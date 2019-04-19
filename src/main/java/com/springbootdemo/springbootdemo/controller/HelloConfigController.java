package com.springbootdemo.springbootdemo.controller;

import com.springbootdemo.springbootdemo.config.Myconfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:HelloConfigController
 * @Description: TODO
 * @Author: xu.liu
 * @Date:2019/3/15 10:40
 * @Version:V1.0
 **/
@RestController
public class HelloConfigController {

    @Autowired
    private Myconfig myConfig;


    @RequestMapping(value = "/myConfig")
    public String testMyConfig(){

        System.out.println(myConfig.getTeacher()+"我叫："+myConfig.getName()+","+myConfig.getSex()+"今年"+myConfig.getAge()+"岁，从事"+myConfig.getJob()+"工作"+myConfig.getHome());
        return "我叫："+myConfig.getName()+","+myConfig.getSex()+"今年"+myConfig.getAge()+"岁，从事"+myConfig.getJob()+"工作,home:"+myConfig.getHome();
    }



}