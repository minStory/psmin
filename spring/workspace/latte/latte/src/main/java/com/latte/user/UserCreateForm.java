package com.latte.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {

    @NotEmpty
    private String pwd;

    @NotEmpty
    private String pwd_check;

    @NotEmpty
    private String name;

    @NotEmpty
    private String mobile_carrier;

    @NotEmpty
    private String phone1;

    @NotEmpty
    private String phone2;

    @NotEmpty
    private String phone3;

    @NotEmpty
    @Email
    private String email;

}
