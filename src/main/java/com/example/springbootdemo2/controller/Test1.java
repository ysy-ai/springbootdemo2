package com.example.springbootdemo2.controller;

import com.example.springbootdemo2.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test1 {
    @Autowired
    private User user;
    @RequestMapping("/test")
    public String test () {
        System.out.println(user);
        return " ";
    }
}
