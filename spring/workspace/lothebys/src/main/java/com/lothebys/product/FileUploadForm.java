package com.lothebys.product;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
// FileUpload를 객체로 가져오기 위한 폼
// 필요하다면 유효성 검사를 추가할 수 있다.
public class FileUploadForm {

    // File은 선택하지 않아도 전달되는 데이터가 null이 아니기 때문에
    // @NotNull은 큰 의미는 없기에 자바스크립트로 유효성 검사를 해준다 막아준다.
    @NotNull
    private MultipartFile file1;

    @NotNull
    private MultipartFile file2;

    @NotNull
    private MultipartFile file3;
}
