package com.example.springbootdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springbootdemo2Application {

    public static void main(String[] args) {

        System.out.println("你好");
        SpringApplication.run(Springbootdemo2Application.class, args);
    }

}
