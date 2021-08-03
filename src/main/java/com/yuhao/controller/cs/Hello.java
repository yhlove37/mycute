package com.yuhao.controller.cs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class Hello {
    @RequestMapping("/hello")
    public String HelloWord(){
        return "Hello,Spring-boot";
    }


}
