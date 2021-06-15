package com.zou.demo.bootstrapcurd.config;

import com.zou.demo.bootstrapcurd.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: 邹祥发
 * @date: 2021/6/12 10:55
 * 定义拦截器注册器
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    /**
     * 注册拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器
        //静态资源放行,放行post请求
        registry.addInterceptor(new LoginInterceptor()).excludePathPatterns("/css/**", "/js/**", "/images/**","/check");
    }

}
