package com.lothebys.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {

    @NotBlank
    private String id;

    @NotBlank
    private String pwd;

    @NotBlank
    private String name_first;

    @NotBlank
    private String name_last;

    @NotBlank
    private String num1;

    @NotBlank
    private String num2;

    @NotBlank
    private String num3;

    private String addr; // 주소는 선택 사항이므로 빈 문자열 허용

    @NotBlank
    @Email(message = "The email format is invalid.")
    private String email;

}
