package com.ohgiraffers.section03.dto.problem2;

public class Application01 {


    public static void main(String[] args) {

        MemberDTO song = new MemberDTO();

        song.setAge(20);
        song.setAddress("인사동");
        song.setGender('여');
        song.setPhone("010-1234-1234");
        song.setName("송재희");

        MemberDTO kim = new MemberDTO();

        kim.setAge(19);
        kim.setAddress("고잔동");
        kim.setGender('남');
        kim.setName("김재석");


        MemberRepostiory memberRepostiory = new MemberRepostiory();
        memberRepostiory.addMember(song);
        memberRepostiory.addMember(kim);
        memberRepostiory.print();

    }
}
