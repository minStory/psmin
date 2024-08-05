package com.latte.user;

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

    public User create(UserCreateForm userCreateForm) {
        String full_phone = "(" + userCreateForm.getMobile_carrier() + ")"
                + userCreateForm.getPhone1() + "-"
                + userCreateForm.getPhone2() + "-"
                + userCreateForm.getPhone3();
        User user = new User();
        user.setId(userCreateForm.getId());
        user.setPwd(passwordEncoder.encode(userCreateForm.getPwd()));
        user.setName(userCreateForm.getName());
        user.setPhone(full_phone);
        user.setEmail(userCreateForm.getEmail());
        user.setSignup_date(LocalDateTime.now());

        this.userRepository.save(user);

        return user;
    }
}
