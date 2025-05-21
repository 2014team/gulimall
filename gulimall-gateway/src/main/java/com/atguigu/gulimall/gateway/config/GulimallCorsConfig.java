package com.atguigu.gulimall.gateway.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class GulimallCorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 所有路径
                .allowedOriginPatterns("*") // 允许所有域（注意 allowedOrigins() 已被替代）
                .allowedMethods("*") // 允许所有请求方法
                .allowedHeaders("*") // 允许所有请求头
                .allowCredentials(true); // 允许携带 Cookie
    }
}
