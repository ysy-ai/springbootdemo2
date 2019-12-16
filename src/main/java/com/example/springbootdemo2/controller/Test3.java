package com.example.springbootdemo2.controller;

import com.example.springbootdemo2.po.Student;
import org.springframework.beans.BeanUtils;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<String,Object>();

        //2.给一些参数
        map.put("id", 2);
        map.put("name", "EZ");
        map.put("age", 22);
        map.put("classID", 3);
        map.put("birthday", new Date());
        System.out.println(map.toString());
        //需求：把map的属性值拷贝到S中
        Student s = new Student();
        BeanUtils.copyProperties(s, map);
        System.out.println(s.toString());

    }
}
