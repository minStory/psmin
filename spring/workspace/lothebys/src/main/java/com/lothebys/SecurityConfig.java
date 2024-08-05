package com.lothebys;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.web.header.writers.frameoptions.XFrameOptionsHeaderWriter;
import org.springframework.security.web.session.HttpSessionEventPublisher;
import org.springframework.security.web.session.InvalidSessionStrategy;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http, RequestMappingHandlerMapping requestMappingHandlerMapping) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable) // (csrf 공격 차단 비활성화, 403 방지)
                .authorizeHttpRequests((authorizeHttpRequests) -> authorizeHttpRequests
                                // 접근 금지 권한을 먼저 작성해야 한다.
                                .requestMatchers("/test").denyAll() // 전체 접근 금지
                                .requestMatchers("/admin/**").hasRole("ADMIN") // ADMIN 권한
                                .requestMatchers("/user/home").hasRole("USER") // USER 권한
                                .requestMatchers("/**").permitAll() // 전체 권한
                )

                .headers((headers) -> headers
                        .addHeaderWriter(new XFrameOptionsHeaderWriter(
                                XFrameOptionsHeaderWriter.XFrameOptionsMode.SAMEORIGIN)))

                // 로그인 설정 영역
                .formLogin((formLogin) -> formLogin
                        .loginPage("/user/login") // 로그인 페이지의 url
                        .failureUrl("/user/login?error")
                        .defaultSuccessUrl("/")) // 로그인 성공 시 이동할 url

                // 로그아웃 설정 영역
                .logout((logout) -> logout
                        .logoutUrl("/user/logout")
                        // 로그아웃 성공 후 핸들러
                        .logoutSuccessHandler(((request, response, authentication) -> {
                            response.sendRedirect("/");
                        }))
                )

                // 세션 설정 영역
                .sessionManagement(sessionManagement ->
                        sessionManagement
                                //.invalidSessionUrl("/") // 세션 만료 후 리디렉션할 URL
                                .sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED) // 스프링 시큐리티가 필요 시 세션 생성
                                .maximumSessions(1) // 한 사용자 계정으로 최대 3개의 세션 허용
                                .sessionRegistry(sessionRegistry()) // 세션 레지스트리 설정
                )
        ;
        return http.build();
    }

    // 세션 추적, 제한 등 관리 레지스트리
    @Bean
    public SessionRegistry sessionRegistry() {
        return new SessionRegistryImpl();
    }

    // 비크립트 객체 스프링 빈 등록
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // 스프링 시큐리티 로그인 인증 처리
    @Bean
    AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }
}
