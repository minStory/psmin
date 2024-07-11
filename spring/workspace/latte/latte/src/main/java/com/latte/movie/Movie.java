package com.latte.movie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer no;

    private String title;

    private String genre;

    private Integer screen_time;

    private String director;

    private String actor;

    private Integer limit_age;

    private String release_date;

    private String poster;

    private String content;
}
