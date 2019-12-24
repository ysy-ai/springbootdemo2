package com.example.springbootdemo2.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.springbootdemo2.po.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        String response = "{" +
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


        JSONObject responseObject = JSON.parseObject(response);
        JSONObject object = responseObject.getJSONObject("object");
        JSONObject result = object.getJSONObject("result");
        JSONArray offerList = result.getJSONArray("OfferList");
        //保存解析的商品
        List<Map<String, String>> list = new ArrayList<>();
        //解析商品列表
        List<OfferList> offerLists = JSON.parseArray(offerList.toString(), OfferList.class);
        for (OfferList item : offerLists) {
            //商品名称
            String offerName = item.getOfferName();
            //已使用量
            String used = item.getUsed();
            //剩余量
            String remain = item.getRemain();

            List<MemberList> memberList = item.getMemberList();
            for (MemberList value : memberList) {
                //主副卡标识
                String mainTag = value.getMainTag();
                //成员号码
                String memberNum = value.getMemberNum();
                //可共享流量
                String memberUsed = value.getMemberUsed();

                Map<String, String> map = new HashMap<>();
                map.put("offerName", offerName);
                map.put("used", used);
                map.put("remain", remain);
                map.put("mainTag", mainTag);
                map.put("memberNum", memberNum);
                map.put("memberUsed", memberUsed);
                list.add(map);

            }
        }



       /* System.out.println("=================");
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

        }*/

        PadResu padResu = new PadResu();
        PadResu list2 = padResu.put("list", list);
        List list3 = (List) padResu.getResult().get("list");
        Map o = (Map) list3.get(0);
        System.out.println(o.get("offerName"));

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

        Root root = JSON.parseObject(data, Root.class);
        BasicVersion basicVersion = root.getBasicVersion();
        List<Map> list1 = new ArrayList<>();
        List<UserSearchedHistoryByOrgs> userSearchedHistoryByOrgs = basicVersion.getUserSearchedHistoryByOrgs();
        for (int i = 0; i < userSearchedHistoryByOrgs.size(); i++) {
            Map<String, String> map = new HashMap<>();
            System.out.println(userSearchedHistoryByOrgs.get(i));
            System.out.println(userSearchedHistoryByOrgs.get(i).getSearchedDate());
            map.put("SearchedDate", userSearchedHistoryByOrgs.get(i).getSearchedDate());
            list1.add(map);
        }
        System.out.println(list1.toString());
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i).get("SearchedDate"));
        }
        System.out.println("====================");


    }
}
