package com.springbootdemo.springbootdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName:myconfig
 * @Description: TODO
 * @Author: xu.liu
 * @Date:2019/3/15 10:25
 * @Version:V1.0
 **/
@Configuration
@PropertySource(value= "classpath:application.properties")
@ConfigurationProperties(prefix = "usr")
public class Myconfig {

    private String name;

    private String job;

    private int age;

    private String sex;

    private String teacher;

    private String home;

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}