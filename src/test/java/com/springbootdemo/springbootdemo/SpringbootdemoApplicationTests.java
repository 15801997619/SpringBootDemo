package com.springbootdemo.springbootdemo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import static org.hamcrest.Matchers.equalTo;

import java.net.URL;
import java.util.regex.Matcher;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringbootdemoApplicationTests {

    private int port;
    private URL base;

    @Autowired
    private TestRestTemplate template;

    @Before
    public void setUp()throws Exception {
        this.base=new URL("http://localhost:"+port+"/hello");
    }

    @Test
    public void sayHello()throws Exception {
        ResponseEntity<String> response= template.getForEntity(base.toString() ,String.class);
        Assert.assertThat(response.getBody() , equalTo("hello spring boot!"));
    }
//    @Test
//    public void contextLoads() {
//
//    }

}
