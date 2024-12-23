package com.lothebys.user.session;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SessionResponseDTO {

    private Long minute;
    private Long second;

    public SessionResponseDTO(Long minute, Long second) {
        this.minute = minute;
        this.second = second;
    }

}
