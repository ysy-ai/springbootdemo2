package com.example.springbootdemo2.po;

import java.util.List;

public class BasicVersion {
    private String userGender;

    private List<UserSearchedHistoryByOrgs> userSearchedHistoryByOrgs;

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public List<UserSearchedHistoryByOrgs> getUserSearchedHistoryByOrgs() {
        return userSearchedHistoryByOrgs;
    }

    public void setUserSearchedHistoryByOrgs(List<UserSearchedHistoryByOrgs> userSearchedHistoryByOrgs) {
        this.userSearchedHistoryByOrgs = userSearchedHistoryByOrgs;
    }

    @Override
    public String toString() {
        return "BasicVersion{" +
                "userGender='" + userGender + '\'' +
                ", userSearchedHistoryByOrgs=" + userSearchedHistoryByOrgs +
                '}';
    }
}
