package com.example.springbootdemo2.po;

import java.util.HashMap;
import java.util.Map;

public class PadResu {
    Map<String,Object> result = new HashMap<>();

    public Map<String, Object> getResult() {
        return result;
    }

    public PadResu setResult(Map<? extends String,?> map){
        this.result.putAll(map);
        return this;
    }
}
