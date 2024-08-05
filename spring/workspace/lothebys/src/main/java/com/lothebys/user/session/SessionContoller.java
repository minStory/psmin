package com.lothebys.user.session;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RequestMapping("/session")
@RequiredArgsConstructor
@Controller
public class SessionContoller {

    // 실시간 세션 체크 메서드
    @GetMapping("/check")
    @ResponseBody
    public ResponseEntity<SessionResponseDTO> checkRealTime(HttpServletRequest request, HttpServletResponse response) {

        Long minute = getRealTime(request, response).get("minute");
        Long second = getRealTime(request, response).get("second");

        // json 객체에 남은 시간을 넣어 1초마다 자바스크립트와 통신
        SessionResponseDTO dto = new SessionResponseDTO();
        dto.setMinute(minute);
        dto.setSecond(second);

        return ResponseEntity.ok().body(dto);
    }

    // 세션 만료 메서드
    @GetMapping("/expired")
    public ResponseEntity<SessionResponseDTO> expiredSession(HttpServletRequest request, HttpServletResponse response) {

        Long minute = getRealTime(request, response).get("minute");
        Long second = getRealTime(request, response).get("second");

        // 만료되었을 경우 json 객체 응답
        if (request.getSession(false) != null) {
            if (minute == 0 && second == 0) {
                // 세션 해제
                request.getSession().invalidate();
                // json 객체 자체가 필요한 것이기 때문에 값은 없어도 무관
                SessionResponseDTO dto = new SessionResponseDTO();
                dto.setMinute(minute);
                dto.setSecond(second);
                return ResponseEntity.ok().body(dto);
            }
        }
        return null;
    }

    // 세션 시간 초기화 메서드
    @GetMapping("/initialized")
    public void resetSession(HttpServletRequest request, HttpServletResponse response) {
        // 기존 세션을 가져온다.
        HttpSession oldSession = request.getSession(false);
        Authentication authentication = null;

        if (oldSession != null) {
            // 인증 정보 백업
            authentication = SecurityContextHolder.getContext().getAuthentication();
            oldSession.invalidate(); // 기존 세션 무효화
        }

        // 새로운 세션 생성
        HttpSession newSession = request.getSession(true);
        newSession.setMaxInactiveInterval(1200); // 새로운 세션의 비활성 시간 설정

        // 새로운 세션에 인증 정보 복원
        if (authentication != null) {
            SecurityContextHolder.getContext().setAuthentication(authentication);
            newSession.setAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY, SecurityContextHolder.getContext());
        }
    }

    // 남은 세션 시간을 불러오는 메서드
    public Map<String, Long> getRealTime(HttpServletRequest request, HttpServletResponse response) {

        Map<String, Long> timeMap = new HashMap<>();

        if (request.getSession(false) != null) {

            long maxInactiveInterval = request.getSession(false).getMaxInactiveInterval(); // 세션 유효시간(초)
            long currentTime = System.currentTimeMillis(); // 현재시간(밀리초)
            long creationTime = request.getSession(false).getCreationTime(); // 세션 생성시간(밀리초)
            long elapsedTime = TimeUnit.MILLISECONDS.toSeconds(currentTime - creationTime); // 세션 경과시간(초로 변환)
            long remainingTime = maxInactiveInterval - elapsedTime; // 남은시간(초)
            long remainingMinute = remainingTime / 60;
            long remainingSecond = remainingTime % 60;

            timeMap.put("minute", remainingMinute);
            timeMap.put("second", remainingSecond);
        }
        return timeMap;
    }
}

