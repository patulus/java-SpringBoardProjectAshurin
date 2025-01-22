package com.patulus.springBoardProjectAshurin.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(AbstractHttpConfigurer::disable)                                  // CSRF 설정
                .cors((cors) -> cors                            // CORS 설정
                        .configurationSource(CorsConfig.corsConfigurationSource())
                )
                .authorizeHttpRequests((request) -> request // HTTP 요청 인가 설정
                        .anyRequest() // 그 외 모든 요청에 대해
                        .permitAll()  // 누구나 접근 허용
                )
                .build();
    }

}
