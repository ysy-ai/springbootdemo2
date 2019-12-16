package com.example.springbootdemo2.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class Test2 {
    public static void main(String[] args) {

        String response ="{\n" +
                "    \"rtnCode\": \"0\",\n" +
                "    \"rtnMsg\": \"成功\",\n" +
                "    \"bean\": {\n" +
                "        \" total \": \"2\"\n" +
                "    },\n" +
                "    \"beans\": [\n" +
                "        {\n" +
                "            \"deptNo\":\"2018020758634\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"deptNo\":\"2018020758634\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        Map responseMap = JSON.parseObject(response, Map.class);
        System.out.println(responseMap);
        List beansList = (List)responseMap.get("beans");
        for (Object o : beansList) {
            Map object = (Map) o;
            String deptNo = (String) object.get("deptNo");
            System.out.println(deptNo);
        }


    }

}
