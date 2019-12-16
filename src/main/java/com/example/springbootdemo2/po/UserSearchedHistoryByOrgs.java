package com.example.springbootdemo2.po;

import java.util.List;

public class UserSearchedHistoryByOrgs {
    private boolean orgSelf;

    private String searchedDate;

    private String searchedOrg;



    public boolean isOrgSelf() {
        return orgSelf;
    }

    public void setOrgSelf(boolean orgSelf) {
        this.orgSelf = orgSelf;
    }

    public String getSearchedDate() {
        return searchedDate;
    }

    public void setSearchedDate(String searchedDate) {
        this.searchedDate = searchedDate;
    }

    public String getSearchedOrg() {
        return searchedOrg;
    }

    public void setSearchedOrg(String searchedOrg) {
        this.searchedOrg = searchedOrg;
    }



    @Override
    public String toString() {
        return "UserSearchedHistoryByOrgs{" +
                "orgSelf=" + orgSelf +
                ", searchedDate='" + searchedDate + '\'' +
                ", searchedOrg='" + searchedOrg + '\'' +
                '}';
    }

}
