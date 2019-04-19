package com.springbootdemo.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:HelloController
 * @Description: TODO
 * @Author: xu.liu
 * @Date:2019/3/14 16:46
 * @Version:V1.0
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
    System.out.println("^^^^^^^^^^^^^^");
        return "hello spring boot!";
    }
}