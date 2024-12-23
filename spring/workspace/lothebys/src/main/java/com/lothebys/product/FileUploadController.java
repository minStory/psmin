package com.lothebys.product;

import com.lothebys.product.image.ImageController;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
    public String productUpload(Model model) {
        // 타임리프 th:object와 바인딩하여 th:field와 매핑하기 위해 model에 추가
        model.addAttribute("fileUploadForm", new FileUploadForm());
        return "product/upload";
    }

    // 파일 업로드를 처리하는 메서드
    @PostMapping("/upload")
    public String insertProduct(@ModelAttribute @Valid FileUploadForm form, BindingResult bindingResult) {
        // 유효성 검사
        if (form.getFile1().isEmpty() || form.getFile2().isEmpty() || form.getFile3().isEmpty()) {
            bindingResult.reject("error.fileUploadForm", "All files must be uploaded");
        }
        // 파일이 하나라도 비어있을 경우
        if (bindingResult.hasErrors()) {
            // 에러 메시지 출력
            String errorMessage = Objects.requireNonNull(bindingResult.getGlobalError()).getDefaultMessage();
            System.err.println(errorMessage);
            return "product/upload";
        }
        try {
            // 현재 날짜에 맞는 경로를 지정해준다.
            root = Paths.get("src/main/resources/static/images/product_images/" + getDate());
            // image 테이블의 데이터 개수를 가져온 후
            // 1을 더해 생성될 고유번호를 임의로 생성해준다. (image 테이블의 데이터가 생성되기 전이기 때문)
            long imageNo = imageController.getCount() + 1;
            // 기존 경로에 image 테이블의 임의로 생성한 고유번호로 구분하여 경로를 재지정해준다.
            root = Paths.get(root.toString() + "/" + imageNo);

            // 업로드 파일 리스트 선언 및 받아온 값으로 초기화 (불변 리스트)
            List<MultipartFile> files = List.of(form.getFile1(), form.getFile2(), form.getFile3());
            // DB에 저장할 경로를 담을 리스트 선언 (가변 리스트)
            List<String> rootList = new ArrayList<>();

            // ------------ 업로드 반복문 구간 start ------------
            // 인덱스 0부터 files의 사이즈만큼 반복(람다식)
            IntStream.range(0, files.size())
                    .forEach(i -> {
                        // 파일명을 불러온다.
                        String originalFileName = files.get(i).getOriginalFilename();

                        // 객체가 null이 아니고, 파일명이 비어있지 않다면
                        if (originalFileName != null && !originalFileName.isEmpty()) {
                            // 위에서 지정한 경로에 폴더를 생성한다.
                            try {
                                Files.createDirectories(root);
                            } catch (IOException e) {
                                System.err.println("Directory creation failed: " + e.getMessage());
                                e.printStackTrace();
                            }

                            // 기존 파일명을 임의로 수정(FilenameUtils 라이브러리를 통해 확장자는 그대로 유지)
                            originalFileName = "image" + (i + 1) + "." + FilenameUtils.getExtension(originalFileName);
                            try {
                                // 파일을 저장할 경로를 설정하고 복사한다.
                                Path destinationFile = this.root.resolve(Paths.get(originalFileName)).normalize().toAbsolutePath();
                                Files.copy(files.get(i).getInputStream(), destinationFile, StandardCopyOption.REPLACE_EXISTING);
                                // 위에서 생성한 rootList에 경로를 담는다.
                                rootList.add(destinationFile.toString().substring(0, destinationFile.toString().length() - originalFileName.length()) + originalFileName);

                            } catch (IOException e) {
                                System.err.println("File saving failed: " + e.getMessage());
                                e.printStackTrace();
                            }
                        } else {
                            rootList.add(null);
                        }
                    });
            // ------------ 업로드 반복문 구간 end ------------

            // 절대 경로가 길기 때문에 DB에 필요한 경로만 추출하기 위한 반복문
            String targetFolder = "\\images";
            IntStream.range(0, rootList.size())
                    .forEach(i -> {
                        if (rootList.get(i) != null) {
                            int srcIndex = rootList.get(i).indexOf(targetFolder);
                            if (srcIndex != -1) {
                                String relativePath = rootList.get(i).substring(srcIndex);
                                rootList.set(i, relativePath);
                            } else {
                                System.err.println("\"" + targetFolder + "\" not found in the path.");
                            }
                        }
                    });

            // image 테이블에 접근하여 경로 삽입
            imageController.insertImage(rootList);
        } catch (Exception e) {
            System.err.println("An unexpected error occurred during file upload: " + e.getMessage());
            e.printStackTrace();
            return "product/upload";
        }
        // 업로드 후 이동할 페이지 설정
        return "redirect:/";
    }


    // 실시간으로 날짜를 불러오는 메서드
    public String getDate() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
    }
}
