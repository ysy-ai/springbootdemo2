package com.example.springbootdemo2.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.springbootdemo2.po.PadResu;


import java.util.ArrayList;
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

        List<Map<String,String>> list = new ArrayList<>();
        List offerList = (List) resultMap.get("OfferList");
        for (int i = 0; i < offerList.size(); i++) {
            Map offerListmap  =  (Map) offerList.get(i);
            String offerName = (String) offerListmap.get("offerName");
            String used = (String) offerListmap.get("used");
            String remain = (String) offerListmap.get("remain");
            List memberList = (List)offerListmap.get("memberList");
            for (int j = 0; j < memberList.size(); j++) {
                Map memberListmap = (Map) memberList.get(j);
                String mainTag = (String) memberListmap.get("mainTag");
                String memberNum = (String) memberListmap.get("memberNum");
                String memberUsed = (String) memberListmap.get("memberUsed");
                Map<String,String> map = new HashMap<>();
                map.put("offerName",offerName);
                map.put("mainTag",mainTag);
                map.put("memberNum",memberNum);
                map.put("memberUsed",memberUsed);
                map.put("used",used);
                map.put("remain",remain);
                list.add(map);
            }

        }

        PadResu padResu = new PadResu();

        System.out.println(padResu.put("list",list).getResult());


        System.out.println("*******************");


        String data = "" +
                "{\"website\":\"chinamobilesh\", " +
                "\"create_time\":157360, " +
                "\"basic_version\":{" +
                "\"user_gender\": \"男\"," +
                "\"user_searched_history_by_orgs\": [{" +
                "\"org_self\": true," +
                "\"searched_date\": \"2017-11-07\"," +
                "\"searched_org\": \"其他\"" +
                "}," +
                "{" +
                "\"org_self\": false," +
                "\"searched_date\": \"2017-07-08\"" +
                ",\"searched_org\": \"线上消费分期\"" +
                "}]" +
                "}" +
                "}";


}
}
