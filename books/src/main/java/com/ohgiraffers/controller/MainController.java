package com.ohgiraffers.controller;

import com.ohgiraffers.dao.MainService;
import com.ohgiraffers.dto.MemberDTO;

import java.util.Scanner;

public class MainController {
        MainService mainService = new MainService();
        Scanner scanner = new Scanner(System.in);


        public void memberService() {
            int intput;
            String intputsel = "";

            System.out.println();
            System.out.println("----------맴버관리 메뉴----------");
            System.out.println("1.맴버 검색");
            System.out.println("2.맴버 등록");
            System.out.println("3.맴버 수정");
            System.out.println("4.맴버 삭제");
            System.out.println("5.맴버 전체 확인");
            System.out.println("원하시는 메뉴를 선택해주세요");
            intput = scanner.nextInt();
            scanner.nextLine();
            String memberName = "";
            int inputNum;
            String result = "";

            switch (intput) {
                case 1:
                    System.out.println("검색하실 회원명을 입력해주세요");
                    intputsel = scanner.nextLine();
                    result = mainService.serviceMemberView(intputsel);
                    break;
                case 2:
                    System.out.println("등록하실 회원 이름을 입력해 주세요");
                     memberName = scanner.nextLine();
                    result = mainService.serviceRegist(memberName);
                    break;
                case 3:
                    System.out.println("수정하실 회원의 이름을 입력해주세요");
                    memberName = scanner.nextLine();
                    result = mainService.serviceModify(memberName);
                    break;
                case 4:
                    System.out.println("삭제하실 번호를 입력해 주세요");
                    inputNum = scanner.nextInt();
                    if(inputNum < 0) {
                        System.out.println("번호를 다시 확인해 주세요");
                        break;
                    }
                    result = mainService.serviceDelete(inputNum);
                    break;
                case 5:
                    result = mainService.serviceOverPrint();
                    break;
                default:
                    System.out.println("오류입니다");
                    break;
            }
            System.out.println(result);
        }
}
