package com.latte.user;

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
    private String pwd_check;

    @NotBlank
    private String name;

    @NotBlank
    private String mobile_carrier;

    @NotBlank
    private String phone1;

    @NotBlank
    private String phone2;

    @NotBlank
    private String phone3;

    @NotBlank
    @Email(message = "이메일 형식이 올바르지 않습니다.")
    private String email;

}
