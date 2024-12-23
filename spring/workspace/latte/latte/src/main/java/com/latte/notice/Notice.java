package com.latte.notice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer no;

    private String writer_no;

    private String writer_id;

    private String title;

    private String content;

    private String file;

    private String created_date;

    private String updated_date;

    private Integer hit;
}
