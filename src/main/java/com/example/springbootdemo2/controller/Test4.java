package com.example.springbootdemo2.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.springbootdemo2.po.Beans1;
import com.example.springbootdemo2.po.Yidong;
import org.springframework.util.CollectionUtils;

import java.beans.Beans;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test4 {
    public static void main (String[] args) throws ParseException {
        //getCitysBySuprRegnId();
        //test("123456789qwer");
        test1();
    }

    //根据业务树图（知识分类）父节点、来访渠道、工作组、地域编号查询所有子节点
    public static void getCatalogsByParentId(){
        String response = "{\n" +
                "    \"rtnMsg\": \"成功\",\n" +
                "    \"bean\": {\n" +
                "        \"catlId\": \"0\",\n" +
                "        \"workGroup\": \"000245771000,000245000000001,000245771000001,000245771000002\",\n" +
                "        \"regnId\": \"771\",\n" +
                "        \"chnlCode\": \"1\"\n" +
                "    },\n" +
                "    \"beans\": [\n" +
                "        {\n" +
                "            \"catlId\": \"109\",\n" +
                "            \"hasChilds\": \"1\",\n" +
                "            \"suprCatlId\":\" 0\",\n" +
                "            \"catlNm\": \"账务充值\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"catlId\":\"180206143602000103\",\n" +
                "            \"hasChilds\": \"1\",\n" +
                "            \"suprCatlId\": \"0\",\n" +
                "            \"catlNm\": \"gy一级目录\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"rtnCode\": \"0\"\n" +
                "}";


        Map responseObject = JSON.parseObject(response, Map.class);
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        List beans = (List) responseObject.get("beans");
        for (Object beansList:beans) {
            Map beansMap = (Map) beansList;
            String catlId = (String)beansMap.get("catlId");
            map.put("catlId",catlId);
            String hasChilds = (String)beansMap.get("hasChilds");
            map.put("hasChilds",hasChilds);
            String suprCatlId = (String)beansMap.get("suprCatlId");
            map.put("suprCatlId",suprCatlId);
            String catlNm = (String)beansMap.get("catlNm");
            map.put("catlNm",catlNm);
            list.add(map);
        }

        for (Map<String, String> map1:list) {
            System.out.println(map1);
        }
    }

    //根据关键字查询业务树
    public static void getCatalogsByKeyword(){
        String response = "{\n" +
                "    \"rtnMsg\": \"成功\",\n" +
                "    \"bean\": {\n" +
                "        \"total\": 1\n" +
                "    },\n" +
                "    \"beans\": [\n" +
                "        {\n" +
                "            \"catlId\": \"10801771\",\n" +
                "            \"catlName\": \"合家账户\",\n" +
                "            \"catlPath\": \"10800771,10801771\",\n" +
                "            \"catlNmPath\": \"家庭业务>合家账户\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"catlId\": \"10801772\",\n" +
                "            \"catlName\": \"合家账户2\",\n" +
                "            \"catlPath\": \"10800772,10801772\",\n" +
                "            \"catlNmPath\": \"家庭业务>合家账户2\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"rtnCode\": \"0\"\n" +
                "}";

        JSONObject responseObject = JSON.parseObject(response);
        JSONArray beans = responseObject.getJSONArray("beans");
        List<Yidong> yidongList = JSON.parseArray(beans.toString(), Yidong.class);
        for (Yidong yidong:yidongList) {
            System.out.println(yidong);
        }
        System.out.println("=====================");
        Map responseMap = JSON.parseObject(response, Map.class);
        List beans1 = (List) responseMap.get("beans");
        for (Object beans1Object:beans1) {
            Map beans1Map = (Map) beans1Object;
            String catlName = (String) beans1Map.get("catlName");
            System.out.println(catlName);
        }
    }

    public static void queryGroupByStaffId () {
        String response = "{\n" +
                "    \"rtnCode\": \"0\",\n" +
                "    \"rtnMsg\": \"成功\",\n" +
                "    \"bean\": {},\n" +
                "    \"beans\": [\n" +
                "        {\n" +
                "            \"groupId\": \"2016030202702\",\n" +
                "            \"groupName\": \"添加社会化工作组\",\n" +
                "            \"cityId\": \"\",\n" +
                "            \"provId\": \"\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"object\": null\n" +
                "}";

        Map responseObject = JSON.parseObject(response, Map.class);
        String rtnCode = (String)responseObject.get("rtnCode");
        String success = (String) responseObject.get("成功");
        List beans = (List) responseObject.get("beans");
        StringBuilder stringBuilder = new StringBuilder();
        for (Object beansObject : beans) {
            Map beansObject1 = (Map) beansObject;
            String groupId = (String) beansObject1.get("groupId");
            stringBuilder.append(groupId).append(",");
        }
        String substring = stringBuilder.substring(0, stringBuilder.length() - 1);
        System.out.println(substring.toString());
    }

    public static void getCitysBySuprRegnId () {
        String response = "{\n" +
                "    \"rtnMsg\": \"成功\",\n" +
                "    \"bean\": {\n" +
                "        \"catlId\": \"0\",\n" +
                "        \"workGroup\": \"000245771000,000245000000001,000245771000001,000245771000002\",\n" +
                "        \"regnId\": \"771\",\n" +
                "        \"chnlCode\": \"1\"\n" +
                "    },\n" +
                "    \"beans\": [\n" +
                "        {\n" +
                "            \"argeSeqno\": \"2\",\n" +
                "            \"regnId\": \"地区编码\",\n" +
                "            \"regnNm\": \"防城港\",\n" +
                "            \"rmk\": \"\",\n" +
                "            \"suprRegnId\": \"771\",\n" +
                "            \"areaCode\": \"0070\",\n" +
                "            \"tenantId\": \"-1\",\n" +
                "            \"hrcySeqno\": \"2\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"argeSeqno\": \"3\",\n" +
                "            \"regnId\": \"地区编码\",\n" +
                "            \"regnNm\": \"南宁\",\n" +
                "            \"rmk\": \"\",\n" +
                "            \"suprRegnId\": \"771\",\n" +
                "            \"areaCode\": \"0070\",\n" +
                "            \"tenantId\": \"-1\",\n" +
                "            \"hrcySeqno\": \"3\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"rtnCode\": \"0\"\n" +
                "}";
        /*Map responseObject = JSON.parseObject(response, Map.class);
        String rtnCode = (String) responseObject.get("rtnCode");
        if (rtnCode.equals("0")) {
            List<Map<String,String>> list = new ArrayList<>();
            List beanslist = (List) responseObject.get("beans");
            for (Object beansObject : beanslist) {
                Map<String, String> map = new HashMap<>();
                Map beansObject1 = (Map) beansObject;
                //排列序号
                String argeSeqno = (String) beansObject1.get("argeSeqno");
                map.put("argeSeqno",argeSeqno);
                //区号
                String areaCode = (String) beansObject1.get("areaCode");
                map.put("areaCode",areaCode);
                //地区编码
                String regnId = (String) beansObject1.get("regnId");
                map.put("regnId",regnId);
                //地区名称
                String regnNm = (String) beansObject1.get("regnNm");
                map.put("regnNm",regnNm);
                //层级序号
                String hrcySeqno = (String) beansObject1.get("hrcySeqno");
                map.put("hrcySeqno",hrcySeqno);
                list.add(map);
            }
            for (Map map:list) {
                System.out.println(map);
            }


        }*/
        JSONObject responseObject = JSON.parseObject(response);
        Object beans = responseObject.get("beans");
        List<Beans1> beans1 = JSON.parseArray(beans.toString(), Beans1.class);
        for (int i = 0; i < beans1.size(); i++) {
            System.out.println(beans1.get(i));
        }
        Beans1 beans2 = new Beans1();
        System.out.println();
    }

    //1.请编程实现字符串的反转及替换，不能使用字符串自带的反转及替换函数
    public static void test(String str){

        System.out.println(str+null);
        char[] chars = str.toCharArray();
        System.out.println(chars);
        for (int i = chars.length-1; i > 0; i--) {
            System.out.print(chars[i]+" ");
        }
    }

    public static void test1() throws ParseException {
        //把日期格式转换成字符串
        Date date  = new Date();
        System.out.println(date);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        System.out.println(df.format(date));

        //把日期字符串转换成日期对象
        Date parse = df.parse(df.format(date));
        System.out.println(parse);

        BigInteger bigInteger = new BigInteger("123456789987456321");
        BigInteger bigInteger1 = new BigInteger("789654123654789");
        BigInteger add = bigInteger.add(bigInteger1);
        System.out.println(add);

        List list = new ArrayList();
        list.add("1");
        list.add("5");
        list.add("9");
        list.add("7");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        List list1 = new ArrayList();
        for (int i = list.size()-1; i >= 0; i--) {
            list1.add(list.get(i));
        }
        System.out.println(list1);

        Properties pp = new Properties();
        pp.setProperty("1","a");
        pp.setProperty("2","b");
        pp.setProperty("3","c");
        pp.setProperty("4","d");
        Set<String> strings = pp.stringPropertyNames();
        Iterator<String> iterator = strings.iterator();
        for (Iterator<String> it = iterator; it.hasNext(); ) {
            String str = it.next();
            System.out.println(str+"  ");
        }

        for (String str : strings) {
            System.out.println(str+"  "+pp.getProperty(str));
        }
    }

    //Lambda表达式
    public static void lambdaTest(){

    }

}
