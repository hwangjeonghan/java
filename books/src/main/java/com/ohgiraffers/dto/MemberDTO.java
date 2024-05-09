package com.ohgiraffers.dto;

public class MemberDTO {

        private int memberNum;
        private String memberName;
        private String memberRentalList;

    public int getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(int memberNum) {
        this.memberNum = memberNum;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberRentalList() {
        return memberRentalList;
    }

    public void setMemberRentalList(String memberRentalList) {
        this.memberRentalList = memberRentalList;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "memberNum=" + memberNum +
                ", memberName='" + memberName + '\'' +
                ", memberRentalList='" + memberRentalList + '\'' +
                '}';
    }
}
