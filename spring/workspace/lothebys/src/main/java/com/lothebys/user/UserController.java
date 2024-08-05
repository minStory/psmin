package com.lothebys.user;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/user")
@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;

    @GetMapping("/home")
    public String list() {
        return "user/home";
    }

    @GetMapping("/signup")
    public String signup(UserCreateForm userCreateForm) {
        return "user/signup";
    }

    @PostMapping("/signup_ok")
    public String signup(@Valid UserCreateForm userCreateForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("binding error");
            return "user/signup";
        }
        try {
            userService.create(userCreateForm);
        } catch (Exception e) {
            System.out.println("service error");
            e.printStackTrace();
            return "user/signup";
        }
        return "redirect:/";
    }

    // 자바스크립트로 비동기 통신
    // 아이디가 중복 검사 위한 메서드
    @GetMapping("/id_duplicate_check")
    @ResponseBody
    public ResponseEntity<UserResponseDto> idDuplicateCheck(@RequestParam("id") String id) {
        Optional<User> existingUser = userService.findById(id);
        // 검사 된 값을 json으로 변환하여 보내기 위한 객체
        UserResponseDto dto = new UserResponseDto();

        // 아이디가 중복인 경우
        // 4자리 이상 16 미만이 아닌 경우
        // 영문과 숫자의 조합이 아닌 경우
        if (existingUser.isPresent() || !(4 <= id.length() && id.length() <= 16)
                || !id.matches(".*[a-zA-Z].*") || !id.matches(".*[0-9].*")) {
            dto.setId(id);
            dto.setResult(true);
        }

        return ResponseEntity.ok().body(dto);
    }

    // Post 방식의 처리는 스프링 시큐리티가 대신 한다.
    @GetMapping("/login")
    public String login() {
        return "user/login";
    }
}