package com.example.springbootdemo2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
@SpringBootTest
public class Springbootdemo2ApplicationTests {

    @RequestMapping("hello")
    @Test
    public  String contextLoads() {
        return "你好";
    }

}
