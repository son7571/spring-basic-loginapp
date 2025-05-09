package com.example.loginapp._core.config;

import com.example.loginapp._core.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WepMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/", "/home", "/index") // 메인화면
                .addPathPatterns("/user/**")
                .addPathPatterns("/board/**")
                .addPathPatterns("/love/**")
                .addPathPatterns("/reply/**")
                .addPathPatterns("/api/**")
                .excludePathPatterns("/board/{id:\\d+}");
    }
}
