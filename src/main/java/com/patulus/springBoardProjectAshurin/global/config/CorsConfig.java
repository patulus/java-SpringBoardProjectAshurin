package com.patulus.springBoardProjectAshurin.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.List;

@Configuration
public class CorsConfig {

    public static CorsConfigurationSource corsConfigurationSource() {
        // CORS 설정
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(List.of("http://localhost:5173")); // 다른 출처에서 요청할 수 있도록 허용
        configuration.setAllowedMethods(List.of("GET", "POST", "DELETE"));    // 지정된 요청 메서드에 한해서만 허용
        configuration.setAllowedHeaders(List.of("*"));                     // 지정된 헤더만 존재해야 허용
        configuration.setAllowCredentials(true);                              // 인증 정보를 포함한 요청을 허용

        // URL에 따라 CORS 설정을 달리할 수 있음
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration); // 모든 요청에 대해 설정 적용

        return source;
    }

}
