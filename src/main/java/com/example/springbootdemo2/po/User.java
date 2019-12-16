package com.example.springbootdemo2.po;

import org.springframework.stereotype.Component;

@Component
public class User {

    private String username;
    private String password;
    private String sex;
    private int age;

    public String getUsername() {
        return username;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
