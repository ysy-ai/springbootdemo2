package com.example.springbootdemo2.po;

public class MemberList {
    private String mainTag;
    private String memberNum;
    private String memberUsed;
    private String memberLimit;
    private String effDate;
    private String expDate;
    String name;

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



    @Override
    public String toString() {
        return "MemberList{" +
                "mainTag='" + mainTag + '\'' +
                ", memberNum='" + memberNum + '\'' +
                ", memberUsed='" + memberUsed + '\'' +
                ", memberLimit='" + memberLimit + '\'' +
                ", effDate='" + effDate + '\'' +
                ", expDate='" + expDate + '\'' +
                '}';
    }
}
