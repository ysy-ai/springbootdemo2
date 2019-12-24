package com.example.springbootdemo2.po;

public class Yidong {
    private String catlId;
    private String catlName;
    private String catlPath;
    private String catlNmPath;

    public String getCatlId() {
        return catlId;
    }

    public void setCatlId(String catlId) {
        this.catlId = catlId;
    }

    public String getCatlName() {
        return catlName;
    }

    public void setCatlName(String catlName) {
        this.catlName = catlName;
    }

    public String getCatlPath() {
        return catlPath;
    }

    public void setCatlPath(String catlPath) {
        this.catlPath = catlPath;
    }

    public String getCatlNmPath() {
        return catlNmPath;
    }

    public void setCatlNmPath(String catlNmPath) {
        this.catlNmPath = catlNmPath;
    }

    @Override
    public String toString() {
        return "Yidong{" +
                "catlId='" + catlId + '\'' +
                ", catlName='" + catlName + '\'' +
                ", catlPath='" + catlPath + '\'' +
                ", catlNmPath='" + catlNmPath + '\'' +
                '}';
    }
}
