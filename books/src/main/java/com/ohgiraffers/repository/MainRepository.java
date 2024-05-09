package com.ohgiraffers.repository;

import com.ohgiraffers.dto.BookDTO;
import com.ohgiraffers.dto.MemberDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRepository {

    private final ArrayList<MemberDTO> memberDTO = new ArrayList<>();
    private final ArrayList<BookDTO> bookDTO = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public String selectMemberPrint(String memberName) {
        for (MemberDTO memberDTO : this.memberDTO) {
            if (memberDTO.getMemberName().equals(memberName)) {
                return memberDTO.toString();
            }
            return memberDTO.toString();
        }
        return "해당하는 맴버가 존재하지 않습니다.";
    }

    public String registerMember(String memberName) {
        int memberDTOSize = this.memberDTO.size();
        MemberDTO members;
        members = this.memberDTO.get(memberDTOSize);
        members.setMemberName(memberName);
        System.out.println(this.memberDTO);
        if (memberDTOSize >= this.memberDTO.size()) {
            return "등록실패";
        }
        members = this.memberDTO.get(memberDTOSize);
        members.setMemberNum(memberDTOSize);

        return "등록성공";

    }

    public String memberModify(String userName, String input) {

        for (int i = 0; i < memberDTO.size(); i++) {

            MemberDTO member = this.memberDTO.get(i);
            if (member.getMemberName().equals(userName)) {
                member.setMemberName(input);
            }
        }
        return "올바른 값을 입력하세요.";
    }

    public String memberDelete(int inputNum) {

        if (inputNum < memberDTO.size()) {
            memberDTO.remove(inputNum);
        } else {
            return "잘못된 입력입니다.";
        }
        return inputNum + " 번이 삭제 되었습니다.";
    }

    public String allMemberPrint() {
        String result = "";
        if (memberDTO.isEmpty()) {
            return "등록된 회원이 없습니다.";

        }
        for(int i = 0; i < memberDTO.size(); i++) {
            result += memberDTO.get(i).toString() + "\n";
        }
        return result;
    }
}