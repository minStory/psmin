package com.lothebys;

import com.lothebys.user.CustomUserDetails;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Getter;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Objects;

// 전역적인 설정을 제공하는 클래스
@Getter
@ControllerAdvice
public class GlobalControllerAdvice {

    // 각 컨트롤러 메서드가 실행되기 전에 호출
    @ModelAttribute
    public void addAttribute(Model model, @AuthenticationPrincipal CustomUserDetails customUserDetails) {

        // 로그인 성공 시
        if (customUserDetails != null) {
            model.addAttribute("user", customUserDetails);
        }
    }
}
