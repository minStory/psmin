package com.lothebys.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDto {
    // 아이디 중복검사 후 json으로 반환하기 위한 객체
    private String id;
    private Boolean result;

    public UserResponseDto(){
        this.id = null;
        this.result = false;
    }
}
