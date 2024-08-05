package com.lothebys.product;

import com.lothebys.product.image.ImageController;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

@RequestMapping("/product")
@RequiredArgsConstructor
@Controller
public class FileUploadController {

    // 업로드 시 image 테이블에 접근하기 위해 의존성 주입
    private final ImageController imageController;

    // 업로드될 폴더의 경로 변수 선언
    private Path root;

    // 파일 업로드 페이지 이동
    @GetMapping("/upload")
    public String listUploadedFiles(FileUploadForm fileUploadForm) {
        return "product/upload";
    }

    // 파일 업로드를 처리하는 메서드
    @PostMapping("/upload")
    public String handleFileUpload(@ModelAttribute FileUploadForm form) {

        // 현재 날짜에 맞는 경로를 지정해준다.
        root = Paths.get("src/main/resources/static/images/product_images/" + getDate());
        // image 테이블의 데이터 개수를 가져온 후
        // 1을 더해 생성될 고유번호를 임의로 생성해준다. (image 테이블의 데이터가 생성되기 전이기 때문)
        long imageNo = imageController.getCount() + 1;
        // 기존 경로에 image 테이블의 임의로 생성한 고유번호로 구분하여 경로를 재지정해준다.
        root = Paths.get(root.toString() + "/" + imageNo);

        // 업로드 파일 리스트 선언 및 받아온 값으로 초기화
        List<MultipartFile> files = new ArrayList<>(Arrays.asList(form.getFile1(), form.getFile2(), form.getFile3()));
        // DB에 저장할 경로를 담을 리스트 선언
        List<String> rootList = new ArrayList<>();

        // ------------ 업로드 반복문 구간 start ------------
        // 인덱스 0부터 files의 사이즈만큼 반복(람다식)
        IntStream.range(0, files.size())
                // 일반 forEach문은 i가 객체 그 자체이지만
                // IntStream을 사용하여 i를 인덱스로 사용할 수 있게 변환
                .forEach(i -> {
                    // 파일명을 불러온다.
                    String originalFileName = files.get(i).getOriginalFilename();

                    // 객체가 null이 아니고, 파일명이 비어있지 않다면
                    if(!Objects.requireNonNull(originalFileName).isEmpty()){
                        // 위에서 지정한 경로에 폴더를 생성한다.
                        try {
                            Files.createDirectories(root);
                        } catch (IOException e) {
                            System.err.println("디렉토리 생성 실패: " + e.getMessage());
                        }

                        // 기존 파일명을 임의로 수정
                        // 이미지 개수는 모두 같으므로 폴더를 나누고 파일명을 통일해야 직관적, 편의성 우수
                        originalFileName = "image" + (i + 1) + ".png";
                        try {
                            // 파일을 저장할 경로를 설정하고 복사한다.
                            Path destinationFile = this.root.resolve(Paths.get(originalFileName)).normalize().toAbsolutePath();
                            Files.copy(files.get(i).getInputStream(), destinationFile, StandardCopyOption.REPLACE_EXISTING);
                            // 위에서 생성한 rootList에 경로를 담는다.
                            // 대충 경로를
                            rootList.add(destinationFile.toString().substring(0, destinationFile.toString().length() - originalFileName.length()) + originalFileName);

                        } catch (IOException e) {
                            throw new RuntimeException("파일을 저장할 수 없습니다. 오류: " + e.getMessage(), e);
                        }
                    }else{
                        rootList.add(null);
                    }
                });
        // ------------ 업로드 반복문 구간 end ------------



        // 경로가 길기 때문에 DB에는 필요한 경로만 삽입하기 위한 반복문
        // ex) /src/main/resources/static/images/product_images/ -> /images/product_images/
        // 경로를 추출할 기준점 변수 생성 후 지정
        String targetFolder = "\\images";
        // ------------ 경로 추출 반복문 구간 start ------------
        IntStream.range(0, rootList.size())
                .forEach(i -> {
                    if(rootList.get(i) != null){
                        // "\images"의 위치를 찾는다.
                        int srcIndex = rootList.get(i).indexOf(targetFolder);
                        if (srcIndex != -1) {
                            // "\images"부터 문자열을 잘라낸다.
                            String relativePath = rootList.get(i).substring(srcIndex);
                            rootList.set(i, relativePath);
                        } else {
                            System.out.println("\"" + targetFolder + "\" not found in the path.");
                        }
                    }
                });
        // ------------ 경로 추출 반복문 구간 end ------------

        // image 테이블에 접근하여 경로 삽입
        imageController.insertImage(rootList);

        // 업로드 후 이동할 페이지 설정
        return "redirect:/";
    }

    // 실시간으로 날짜를 불러오는 메서드
    public String getDate() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
    }
}
