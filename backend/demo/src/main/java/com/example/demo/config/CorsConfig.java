package com.example.demo.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // パスを適切に設定
                        .allowedOrigins("http://localhost:3000") // 許可するオリジンを設定
                        .allowedMethods("GET", "POST", "PUT", "DELETE"); // 許可するHTTPメソッドを設定
            }
        };
    }
}