package com.lothebys.product;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
// 타임리프와 바인딩하여 해당 필드와 매핑 후 객체로 값을 가져오기 위한 폼
// 자동 데이터 바인딩 & 양방향 바인딩
public class FileUploadForm {

    // 업로드 파일은 데이터가 없어도 null이 아니기 때문에 유효성 검사는 큰 의미가 없다.
    // -> 자바스크립트와 컨트롤러를 통해 유효성 검사
    @NotNull(message = "File1 cannot be null")
    private MultipartFile file1;

    @NotNull(message = "File2 cannot be null")
    private MultipartFile file2;

    @NotNull(message = "File3 cannot be null")
    private MultipartFile file3;
}
