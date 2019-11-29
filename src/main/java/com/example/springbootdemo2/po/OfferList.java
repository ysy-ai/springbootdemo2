package com.example.springbootdemo2.po;

import java.util.ArrayList;
import java.util.List;

public class OfferList {

    String offerId;
    String offerName;
    String total;
    String used;
    String remain;
    String flowType;
    List<MemberList> memberList = new ArrayList<>();

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    public String getRemain() {
        return remain;
    }

    public void setRemain(String remain) {
        this.remain = remain;
    }

    public String getFlowType() {
        return flowType;
    }

    public void setFlowType(String flowType) {
        this.flowType = flowType;
    }

    public List<MemberList> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberList> memberList) {
        this.memberList = memberList;
    }

    @Override
    public String toString() {
        return "OfferList{" +
                "offerId='" + offerId + '\'' +
                ", offerName='" + offerName + '\'' +
                ", total='" + total + '\'' +
                ", used='" + used + '\'' +
                ", remain='" + remain + '\'' +
                ", flowType='" + flowType + '\'' +
                ", memberList=" + memberList +
                '}';
    }
}
