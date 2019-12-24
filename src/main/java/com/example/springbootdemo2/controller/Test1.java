package com.example.springbootdemo2.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.springbootdemo2.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/*
*
*
* */

@Controller
public class Test1 {
    @Autowired
    private User user;
    @RequestMapping(value = "/test")
    public String test () {
        System.out.println(user);
        return " ";
    }

    public static void main(String[] args) {
        String response = "{\n" +
                "    \"face\": [\n" +
                "        {\n" +
                "            \"position\": {\n" +
                "                \"mouth_right\": {\n" +
                "                    \"y\": 21.687167,\n" +
                "                    \"x\": 57.765155\n" +
                "                },\n" +
                "                \"mouth_left\": {\n" +
                "                    \"y\": 20.749833,\n" +
                "                    \"x\": 52.425537\n" +
                "                },\n" +
                "                \"center\": {\n" +
                "                    \"y\": 18.583333,\n" +
                "                    \"x\": 56.205251\n" +
                "                },\n" +
                "                \"height\": 10.166667,\n" +
                "                \"width\": 14.558473,\n" +
                "                \"nose\": {\n" +
                "                    \"y\": 18.785333,\n" +
                "                    \"x\": 56.317422\n" +
                "                },\n" +
                "                \"eye_left\": {\n" +
                "                    \"y\": 14.81305,\n" +
                "                    \"x\": 52.951074\n" +
                "                },\n" +
                "                \"eye_right\": {\n" +
                "                    \"y\": 16.054433,\n" +
                "                    \"x\": 60.904535\n" +
                "                }\n" +
                "            },\n" +
                "            \"attribute\": {\n" +
                "                \"race\": {\n" +
                "                    \"value\": \"Asian\",\n" +
                "                    \"confidence\": 90.348\n" +
                "                },\n" +
                "                \"gender\": {\n" +
                "                    \"value\": \"Female\",\n" +
                "                    \"confidence\": 99.9999\n" +
                "                },\n" +
                "                \"smiling\": {\n" +
                "                    \"value\": 0.490444\n" +
                "                },\n" +
                "                \"age\": {\n" +
                "                    \"value\": 11,\n" +
                "                    \"range\": 5\n" +
                "                }\n" +
                "            },\n" +
                "            \"tag\": \"\",\n" +
                "            \"face_id\": \"403f40726858a195ea3aec08c4f05354\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"session_id\": \"6cdc4eac5f86433f9ce041993df1555e\",\n" +
                "    \"img_height\": 1001,\n" +
                "    \"img_width\": 700,\n" +
                "    \"img_id\": \"dc6e6d69d669e4bf20a111f58361fb3e\",\n" +
                "    \"url\": \"http://d.hiphotos.baidu.com/image/w%3D2048/sign=618830d52c738bd4c421b53195b386d6/3c6d55fbb2fb4316d61e357222a4462309f7d3b1.jpg\",\n" +
                "    \"response_code\": 200\n" +
                "}";

        JSONObject responseObject = JSON.parseObject(response);
        JSONArray face = responseObject.getJSONArray("face");
        for (Object o : face) {
            Map map = (Map) o;
            Map position = (Map) map.get("position");
            Map mouth_right = (Map) position.get("mouth_right");
            System.out.println(mouth_right);
        }
    }
}
