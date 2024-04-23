package com.ohgiraffers.section03.dto.problem1;

import java.util.ArrayList;

public class MemberRepository {

    ArrayList data = new ArrayList();

    public void addMember(String name, char gender, int age, String address, String phone){
        data.add(name);
        data.add(gender);
        data.add(age);
        data.add(address);
        data.add(phone);

    }
    public void print(){
        System.out.println(this.data);
    }
}
