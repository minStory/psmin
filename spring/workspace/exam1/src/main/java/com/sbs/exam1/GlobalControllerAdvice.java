package com.sbs.exam1;

import com.sbs.exam1.user.CustomUserDetails;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

// 전역적인 설정을 제공하는 클래스
@ControllerAdvice
public class GlobalControllerAdvice {

    // 각 컨트롤러 메서드가 실행되기 전에 호출된다.
    @ModelAttribute
    public void addAttribute(Model model, @AuthenticationPrincipal CustomUserDetails customUserDetails) {
        // 세션(사용자 인증)이 null이 아니라면
        if (customUserDetails != null) {
            model.addAttribute("user", customUserDetails);
        }
    }
}
