package com.example.springbootdemo2.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.springbootdemo2.po.PadResu;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        String  response = "{" +
                "\"rtnCode\":\"0\",\"rtnMsg\":\"成功\"," +
                "\"object\":{" +
                "\"respCode\":\"0\"," +
                "\"respDesc\":\"success\"," +
                "\"result\":{" +
                "\"OfferList\":[{" +
                "\"offerId\":\"李四1\"," +
                "\"offerName\":\"180元移动数据套餐\"," +
                "\"total\":\"李四3\"," +
                "\"used\":\"100T\"," +
                "\"remain\":\"100T\"," +
                "\"flowType\":\"李四6\"," +
                "\"memberList\":[{" +
                "\"mainTag\":\"主卡\"," +
                "\"memberNum\":\"13233768161\"," +
                "\"memberUsed\":\"100T\"," +
                "\"memberLimit\":\"王五4\"," +
                "\"effDate\":\"王五5\"," +
                "\"expDate\":\"王五6\"" +
                "}]" +
                "}]" +
                "}" +
                "}" +
                "}";

        System.out.println("=================");
        Map responseMap = JSON.parseObject(response,Map.class);
        System.out.println("rtnCode："+responseMap.get("rtnCode"));
        Map objectMap = (Map) responseMap.get("object");
        System.out.println("respCode："+objectMap.get("respCode"));
        Map resultMap = (Map) objectMap.get("result");

        List offerList = (List) resultMap.get("OfferList");
        Map offerListmap = (Map) offerList.get(0);


        List memberList = (List) offerListmap.get("memberList");
        Map memberListmap = (Map) memberList.get(0);

        String offerName = (String) offerListmap.get("offerName");
        String mainTag = (String) memberListmap.get("mainTag");
        String memberNum = (String) memberListmap.get("memberNum");
        String memberUsed = (String) memberListmap.get("memberUsed");
        String used = (String) offerListmap.get("used");
        String remain = (String) offerListmap.get("remain");

        Map<String,String> map = new HashMap<>();
        map.put("offerName",offerName);
        map.put("mainTag",mainTag);
        map.put("memberNum",memberNum);
        map.put("memberUsed",memberUsed);
        map.put("used",used);
        map.put("remain",remain);

        PadResu padResu = new PadResu();
        padResu.setResult(map);
        System.out.println(
                padResu.getResult().get("offerName")+"      "+
                padResu.getResult().get("mainTag")+"      "+
                padResu.getResult().get("memberNum")+"      "+
                padResu.getResult().get("memberUsed")+"      "+
                padResu.getResult().get("used")+"      "+
                padResu.getResult().get("remain"));

//回退练习

//64545的爽肤水






       /* System.out.println("=================");
        JSONObject responseObject = JSON.parseObject(response);
        JSONObject object = responseObject.getJSONObject("object");
        JSONObject result = object.getJSONObject("result");
        JSONArray offerList1 = result.getJSONArray("OfferList");

        for (int i=0 ; i < offerList1.size() ; i++) {
            JSONArray memberList1 = offerList1.getJSONObject(i).getJSONArray("memberList");
            System.out.println(memberList1);

            for (int j = 0 ; j < memberList1.size() ; j++) {
                System.out.println(memberList1.getJSONObject(j).getString("mainTag"));

            }

        }*/




    }
}
