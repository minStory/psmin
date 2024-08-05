package com.lothebys.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    // 스프링 빈에 등록한 비크립트 객체 주입
    private final PasswordEncoder passwordEncoder;

    public List<User> getList() {
        return this.userRepository.findAll();
    }

    public Optional<User> findById(String id) {
        return userRepository.findById(id);
    }

    public void create(UserCreateForm userCreateForm) {
        String fullPhone = userCreateForm.getNum1() + "-" + userCreateForm.getNum2() + "-" + userCreateForm.getNum3();
        String fullName = userCreateForm.getName_first() + " " + userCreateForm.getName_last();

        User user = new User();
        user.setId(userCreateForm.getId());
        user.setPwd(passwordEncoder.encode(userCreateForm.getPwd()));
        user.setName(fullName);
        user.setPhone(fullPhone);
        user.setEmail(userCreateForm.getEmail());
        user.setAddr(userCreateForm.getAddr() != null ? userCreateForm.getAddr() : ""); // Null 체크
        user.setRegdate(LocalDateTime.now());

        this.userRepository.save(user);
    }
}
