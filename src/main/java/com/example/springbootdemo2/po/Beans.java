package com.example.springbootdemo2.po;

public class Beans {
    private String argeSeqno;
    private String regnId;
    private String regnNm;
    private String rmk;
    private String suprRegnId;
    private String areaCode;
    private String tenantId;
    private String hrcySeqno;

    public String getArgeSeqno() {
        return argeSeqno;
    }

    public void setArgeSeqno(String argeSeqno) {
        this.argeSeqno = argeSeqno;
    }

    public String getRegnId() {
        return regnId;
    }

    public void setRegnId(String regnId) {
        this.regnId = regnId;
    }

    public String getRegnNm() {
        return regnNm;
    }

    public void setRegnNm(String regnNm) {
        this.regnNm = regnNm;
    }

    public String getRmk() {
        return rmk;
    }

    public void setRmk(String rmk) {
        this.rmk = rmk;
    }

    public String getSuprRegnId() {
        return suprRegnId;
    }

    public void setSuprRegnId(String suprRegnId) {
        this.suprRegnId = suprRegnId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getHrcySeqno() {
        return hrcySeqno;
    }

    public void setHrcySeqno(String hrcySeqno) {
        this.hrcySeqno = hrcySeqno;
    }

    @Override
    public String toString() {
        return "beans{" +
                "argeSeqno='" + argeSeqno + '\'' +
                ", regnId='" + regnId + '\'' +
                ", regnNm='" + regnNm + '\'' +
                ", rmk='" + rmk + '\'' +
                ", suprRegnId='" + suprRegnId + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", tenantId='" + tenantId + '\'' +
                ", hrcySeqno='" + hrcySeqno + '\'' +
                '}';
    }
}
