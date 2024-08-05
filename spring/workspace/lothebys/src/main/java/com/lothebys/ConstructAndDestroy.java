package com.lothebys;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class ConstructAndDestroy {

    @PostConstruct
    public void initialize() {
        // 애플리케이션 시작 시 세션 초기화
        System.out.println("Application started. Initializing sessions.");
    }

    @PreDestroy
    public void cleanup() {
        // 애플리케이션 종료 시 세션 무효화
        System.out.println("Application is shutting down. Cleaning up sessions.");
    }
}