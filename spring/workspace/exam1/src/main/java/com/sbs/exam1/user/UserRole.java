package com.sbs.exam1.user;

import lombok.Getter;

@Getter
public enum UserRole {
    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER");

    // 로그인 객체의 권한을 담고 있는 변수
    private final String value;

    UserRole(String value) {
        this.value = value;
    }
}
