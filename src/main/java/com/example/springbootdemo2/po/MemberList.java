package com.example.springbootdemo2.po;

public class MemberList {

    String mainTag;
    String memberNum;
    String memberUsed;
    String memberLimit;
    String effDate;
    String expDate;
    String cityCode;

    public String getMainTag() {
        return mainTag;
    }

    public void setMainTag(String mainTag) {
        this.mainTag = mainTag;
    }

    public String getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(String memberNum) {
        this.memberNum = memberNum;
    }

    public String getMemberUsed() {
        return memberUsed;
    }

    public void setMemberUsed(String memberUsed) {
        this.memberUsed = memberUsed;
    }

    public String getMemberLimit() {
        return memberLimit;
    }

    public void setMemberLimit(String memberLimit) {
        this.memberLimit = memberLimit;
    }

    public String getEffDate() {
        return effDate;
    }

    public void setEffDate(String effDate) {
        this.effDate = effDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }


    @Override
    public String toString() {
        return "MemberList{" +
                "mainTag='" + mainTag + '\'' +
                ", memberNum='" + memberNum + '\'' +
                ", memberUsed='" + memberUsed + '\'' +
                ", memberLimit='" + memberLimit + '\'' +
                ", effDate='" + effDate + '\'' +
                ", expDate='" + expDate + '\'' +
                ", cityCode='" + cityCode + '\'' +
                '}';
    }
}
