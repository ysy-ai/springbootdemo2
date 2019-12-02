package com.example.springbootdemo2.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Hello {

    @RequestMapping("/test1")
    public String test1(){

       /* User user1 = new User("易","男",20);
        User user2 = new User("树","男",21);
        User user3 = new User("业","男",22);

        List list = new ArrayList();
        list.add(user1);
        list.add(user2);
        list.add(user3);




        System.out.println("==================");

        //将对象转为json文本
        String str1 = JSON.toJSONString(user1);
        System.out.println(str1);



        System.out.println("==================");
        //将json文本转为对象
        User user = JSON.parseObject(str1, User.class);
        System.out.println(user);

        Object obj = JSON.toJSON(list);
        System.out.println(obj);

        //对象转换为json字符串
        String str = JSON.toJSONString(list);
        System.out.println(str);


        System.out.println("==================");
        //将json文本转为集合
        Object parse = JSON.parseArray(str,User.class);
        System.out.println(parse);

        System.out.println("==================");
        //map<=>json
        Map<String,String> map = new HashMap<>();
        map.put("1","你");
        map.put("2","好");
        String str2 = JSON.toJSONString(map);
        System.out.println(str2);

        Map map1 = JSON.parseObject(str2, map.getClass());
        System.out.println(map1);

        Map<String,User> map2 = new HashMap<>();
        map2.put("用户1",user1);
        map2.put("用户2",user2);
        map2.put("用户3",user3);
        String str3 = JSON.toJSONString(map2);
        System.out.println(str3);

        Map map3 = JSON.parseObject(str3, map.getClass());
        System.out.println(map3);

        //基本类型处理
        int o =10;
        //UseSingleQuotes 单引号
        String json = JSON.toJSONString(o, SerializerFeature.UseSingleQuotes);
        int k= JSON.parseObject(json,Integer.class);

        System.out.println("json："+json);
        System.out.println("object："+k);

        //泛型处理
        //JSON.parseObject(str1, new TypeReference<Result<User>>());

        System.out.println("==================");
        //日期处理
        Date date = new Date();
        System.out.println(date);
        String date1 = JSON.toJSONStringWithDateFormat(date, "yyyy-MM-dd HH:mm:ss");
        System.out.println(date1);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("aaa","aaa");
        jsonObject.put("bbb",111);
        jsonObject.put("ccc",null);
        jsonObject.put("ddd","");
        //WriteMapNullValue：输出值为null的字段
        //结果：{"aaa":"aaa","ccc":null,"bbb":111,"ddd":""}
        System.out.println(jsonObject.toJSONString(jsonObject, SerializerFeature.WriteMapNullValue));


        JSONArray jsonArray = new JSONArray();
        for (int i = 0; i < 2; i++) {
            jsonObject.put("AGE", 10);
            jsonObject.put("FULL NAME", "Doe " + i);
            jsonObject.put("DATE OF BIRTH", "2016/12/12 12:12:12");
            jsonArray.add(jsonObject);
        }
        String jsonOutput = jsonArray.toJSONString();
        System.out.println(jsonOutput);

        System.out.println("==================");
        System.out.println("java代码封装为json字符串");
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("username", "宋发元");
        jsonObject1.put("age", 24);
        jsonObject1.put("sex", "男");
        System.out.println("java--->json \n " + jsonObject1.toString());

        System.out.println("json代码封装为java字符串");
        User user4 = jsonObject1.toJavaObject(User.class);
        System.out.println(user4);
*/

      /*  JSONArray OfferList = new JSONArray();
        JSONArray memberList = new JSONArray();
        JSONObject object = new JSONObject();
        JSONObject result = new JSONObject();
        result.put("OfferList",OfferList);

        object.put("respDesc","success");
        object.put("respCode",0);
        object.put("result",result);
        // 声明json对象
        JSONObject response = new JSONObject();
        //把json数组加到json对象中

        //outData.put("ResTable", gResTable);
        //outData.put("CmtTable", gCmtTable);

        response.put("Object",object);
        response.put("rtnMsg","成功");
        response.put("rtnCode",0);

        //此时创建出来的如下:jsonData={"ResTable":[],"CmtTable":[]};
        //把json数据加到json数组中

            JSONObject node1 = new JSONObject();
            node1.put("offerId", "王二1");
            node1.put("offerName", "王二2");
            node1.put("total", "王二3");
            node1.put("used", "王二4");
            node1.put("remain", "王二5");
            node1.put("flowType ", "王二6");
            node1.put("startDate ", "王二7");
            node1.put("endDate ", "王二8");
            node1.put("memberList", memberList);
            OfferList.add(node1);


            JSONObject node2 = new JSONObject();
            node2.put("mainTag", "hello1");
            node2.put("memberNum", "hello2");
            node2.put("memberUsed", "hello3");
            node2.put("memberLimit", "hello4");
            node2.put("effDate", "hello5");
            node2.put("expDate", "hello6");
            node2.put("cityCode ", "hello7");

            memberList.add(node2);


        System.out.println(response);*/















        //解析response
         String  response = "{" +
                 "\"rtnCode\":\"0\",\"rtnMsg\":\"成功\"," +
                 "\"object\":{" +
                 "\"respCode\":\"0\"," +
                 "\"respDesc\":\"success\"," +
                 "\"result\":{" +
                 "\"OfferList\":[{" +
                 "\"offerId\":\"李四1\"," +
                 "\"offerName\":\"套餐名称\"," +
                 "\"total\":\"李四3\"," +
                 "\"used\":\"李四4\"," +
                 "\"remain\":\"李四5\"," +
                 "\"flowType \":\"李四6\"," +
                 "\"memberList \":[{" +
                 "\"mainTag\":\"主卡\"," +
                 "\"memberNum\":\"王五2\"," +
                 "\"memberUsed\":\"王五3\"," +
                 "\"memberLimit\":\"王五4\"," +
                 "\"effDate\":\"王五5\"," +
                 "\"expDate\":\"王五6\"" +
                 "}]" +
                 "}]" +
                 "}" +
                 "}" +
                 "}";
        System.out.println("=================");
        JSONObject csfResJson = JSON.parseObject(response);
        String rtnCode = csfResJson.getString("rtnCode");
        JSONObject object = csfResJson.getJSONObject("object");
        JSONObject result = object.getJSONObject("result");
        JSONArray offerList = result.getJSONArray("OfferList");
        List list = JSON.parseArray(offerList.toJSONString());
        System.out.println(offerList.getJSONObject(0));
        System.out.println(list.toString());


        /*JSONObject offerListobject = OfferList.getJSONObject(0);
        System.out.println(offerListobject);
        JSONArray memberList = offerListobject.getJSONArray("memberList");
        System.out.println(memberList);*/

       /* //套餐名称
        String offerName = offerListobject.getString("offerName");
        //主副卡标识
        //String mainTag = memberListobject.getString("mainTag");
        //成员号码
        //可共享流量
        //已使用量
        String used = offerListobject.getString("used");
        //剩余量
        String remain = offerListobject.getString("remain");

        //System.out.println(mainTag);
        System.out.println(offerName+" "+used+" "+remain);
        //System.out.println(memberListobject);
        System.out.println("shuzu"+offerListobject);
        System.out.println("memberList数组为："+memberList);
        System.out.println("offerList数组为"+OfferList);
        System.out.println(result);
        System.out.println(object);
*/
        return null;
    }

}
