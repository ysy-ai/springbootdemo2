package com.example.springbootdemo2.controller;

import com.example.springbootdemo2.po.Student;
import org.springframework.beans.BeanUtils;

import java.util.*;

public class Test3 {
    public static int print1() {
        int i = 0;
        i++;
        return i++;
    }
    public static int print2() {
        int i = 0;
        i++;
        return ++i;
    }
    public static void main(String[] args) {
        /*System.out.println(print1());
        System.out.println(print2());
        int i=0;
        System.out.println(i++);
        System.out.println(++i);*/

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("==========");
        for (int j = 0; j < list.size(); j++) {
            System.out.println(j);
        }

        int i = 0;
        i = i++ + ++i;
        int j = 0;
        j = ++j + j++ + j++ + j++;
        int k = 0;
        k = k++ + k++ + k++ + ++k;
        int h = 0;
        h = ++h + ++h;
        int p1 = 0, p2 = 0; int q1 = 0, q2 = 0;
        q1 = ++p1;
        q2 = p2++;

        System.out.println("i = " + i);//
        System.out.println("j = " + j);//
        System.out.println("k = " + k);//
        System.out.println("h = " + h);//
        System.out.println("p1 = " + p1);//
        System.out.println("p2 = " + p2);//
        System.out.println("q1 = " + q1);//
        System.out.println("q2 = " + q2);//
    }


}
