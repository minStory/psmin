package com.latte.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // 기본 제공 메서드가 아닌 String Type으로
    // id로 조회하는 메서드 오버로딩
    // Optional로 NullPointerException 방지
    Optional<User> findById(String id);
}
