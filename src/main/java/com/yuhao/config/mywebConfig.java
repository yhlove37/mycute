package com.yuhao.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
//@EnableWebMvc  会屏蔽到springBoot中自动配置去掉
public class mywebConfig  implements WebMvcConfigurer {

    //添加视图控制
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //这是用来测试
        registry.addViewController("/").setViewName("index");
//        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/signUp").setViewName("login");
    }
}
