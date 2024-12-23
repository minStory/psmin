package com.latte.user;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RequestMapping("/user")
@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;

    @GetMapping("/home")
    public String list() {
        return null;
    }

    @GetMapping("/signup")
<<<<<<< HEAD:spring/workspace/lothebys/src/main/java/com/lothebys/user/UserController.java
    public String signup(Model model) {
        // 타임리프 th:object와 바인딩하여 th:field와 매핑하기 위해 model에 추가
        model.addAttribute("userCreateForm", new UserCreateForm());
        return "user/signup";
=======
    public String signup(UserCreateForm userCreateForm) {
        return "user/signup_form";
>>>>>>> parent of 26bc1f5 (240806 업로드):spring/workspace/latte/latte/src/main/java/com/latte/user/UserController.java
    }

    @PostMapping("/signup_ok")
    public String signup(@Valid UserCreateForm userCreateForm, BindingResult bindingResult) {
        // 유효성 검사
        if (bindingResult.hasErrors()) {
<<<<<<< HEAD:spring/workspace/lothebys/src/main/java/com/lothebys/user/UserController.java
            System.err.println("Please enter all required information.");
            return "user/signup";
=======
            System.out.println("binding error");
            return "signup_form";
>>>>>>> parent of 26bc1f5 (240806 업로드):spring/workspace/latte/latte/src/main/java/com/latte/user/UserController.java
        }
        try {
            // 회원 가입 메서드 호출
            userService.create(userCreateForm);
        } catch (Exception e) {
            System.err.println("An unexpected error occurred during signup: " + e.getMessage());
            e.printStackTrace();
<<<<<<< HEAD:spring/workspace/lothebys/src/main/java/com/lothebys/user/UserController.java
            bindingResult.reject("signup.error", "An error occurred while processing your request. Please try again.");
            return "user/signup";
=======
            return "user/signup_form";
>>>>>>> parent of 26bc1f5 (240806 업로드):spring/workspace/latte/latte/src/main/java/com/latte/user/UserController.java
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
        return "user/login_form";
    }
}

