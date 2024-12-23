package com.latte;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.header.writers.frameoptions.XFrameOptionsHeaderWriter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            //.csrf(AbstractHttpConfigurer::disable) // (csrf 공격 차단 비활성화, 403 방지)
            .authorizeHttpRequests((authorizeHttpRequests) -> authorizeHttpRequests
                .requestMatchers(new AntPathRequestMatcher("/**")).permitAll()
                //.requestMatchers(new AntPathRequestMatcher("/movie/**")).hasRole("USER")
                //.anyRequest().authenticated()
            )
            // h2-console 사용 시 작성해야 할 코드
//            .csrf((csrf) -> csrf
//                    .ignoringRequestMatchers(new AntPathRequestMatcher("/h2-console/**")))
            .headers((headers) -> headers
                    .addHeaderWriter(new XFrameOptionsHeaderWriter(
                            XFrameOptionsHeaderWriter.XFrameOptionsMode.SAMEORIGIN)))

            // 로그인 설정 영역
            .formLogin((formLogin) -> formLogin
                .loginPage("/user/login") // 로그인 페이지의 url
                .defaultSuccessUrl("/")) // 로그인 성공 시 이동할 url

            // 로그아웃 설정 영역
            .logout((logout) -> logout
                .logoutRequestMatcher(new AntPathRequestMatcher("/user/logout"))
                .logoutSuccessUrl("/")
                .invalidateHttpSession(true))
        ;

        return http.build();
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