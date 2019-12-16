package com.example.springbootdemo2.po;

public class Root {
    private String website;

    private int createTime;

    private BasicVersion basicVersion;

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public BasicVersion getBasicVersion() {
        return basicVersion;
    }

    public void setBasicVersion(BasicVersion basicVersion) {
        this.basicVersion = basicVersion;
    }


    @Override
    public String toString() {
        return "Root{" +
                "website='" + website + '\'' +
                ", createTime=" + createTime +
                ", basicVersion=" + basicVersion +
                '}';
    }
}
