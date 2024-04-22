package com.ohgiraffers.secotion.user_type;

import java.util.Arrays;

public class Member {


    String id;

    String pwd;

    String name;

    int age;

    char gender;

    String[] hobby;

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}