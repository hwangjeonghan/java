package com.ohgiraffers.dao;


import com.ohgiraffers.dto.MemberDTO;
import com.ohgiraffers.repository.MainRepository;

import java.util.Scanner;

public class MainService {
    Scanner scanner = new Scanner(System.in);
    MainRepository mainRepository = new MainRepository();

    public String serviceMemberView(String inputSel) {
        return mainRepository.selectMemberPrint(inputSel);
    }

    public String serviceRegist(String memberName) {
        return mainRepository.registerMember(memberName);
    }

    public String serviceOverPrint() {
        return mainRepository.allMemberPrint();
    }

    public String serviceDelete(int inputNum) {
        return mainRepository.memberDelete(inputNum);
    }

    public String serviceModify(String userName) {
        System.out.print("변경할 이름을 입력해주세요");
        String input = scanner.nextLine();
        return mainRepository.memberModify(userName, input);
    }
}

