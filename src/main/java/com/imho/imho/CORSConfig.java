package com.imho.imho;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CORSConfig implements WebMvcConfigurer {
//  addCorsMappings 메서드를 오버라이딩하여 CORS 설정을 추가합니다.
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // API 엔드포인트에 대해서 CORS를 허용하도록 설정
                .allowedOrigins("http://localhost:3000") // 허용할 오리진(도메인)을 지정
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // 허용할 HTTP 메서드 지정
                .allowedHeaders("*") // 허용할 요청 헤더 지정, 필요에 따라 수정 가능
                .allowCredentials(true); // 인증정보(쿠키, 인증헤더 등) 허용 여부 설정, 필요에 따라 수정 가능
    }
}