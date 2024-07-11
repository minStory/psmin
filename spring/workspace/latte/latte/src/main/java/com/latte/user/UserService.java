package com.latte.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    // 비크립트 주입 객체 받아오기
    private final PasswordEncoder passwordEncoder;

    public List<User> getList() {
        return this.userRepository.findAll();
    }

    public User create(User user) {
        user.setPwd(passwordEncoder.encode(user.getPwd()));
        this.userRepository.save(user);

        return user;
    }
}
