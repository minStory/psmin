package com.lothebys.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(unique = true)
    private String id;

    private String pwd;

    private String name;

    private String phone;

    private String email;

    private String addr = ""; // Default to empty string

    private LocalDateTime regdate;
}

