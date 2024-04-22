package com.ohgiraffers.section02.looping;

import java.util.Scanner;
//대상의길이를 알때
public class A_for {
    public void testSimpleForStatemnet() {
        /*
         * [for문 표현식]
         * for(초기식; 조건식; 증감식){
         *  //조건식이 참인 경우 실행할 구문 == 반복할 구문
         * }
         * */
        // 초기 1 조건 2 실행 3 증감 4 로 돌아감 규칙임. 그 다음은 2 3 4 순으로 비교하고 실행 증가 시킴. 시스템 출력을 열번하면 번거로우니 반복문을 사용한다.
        for (int i = 1; i <= 10; ++i) {
            for (int x = 1; x <= 10; x++) {
                System.out.println("천원 단위" + x);
            }
            System.out.println("만원 단위 : " + i);
        }
    }

    // 구구단을 만들어주세요!
    public void ququdan() {
        for (int i = 1; i <= 9; ++i) {
            for (int x = 1; x <= 9; x++) {
                System.out.println(i + "*" + x + "=" + i * x);

            }
        }
    }

    public void qqqwwweee() {
        for (int i = 1; i <= 9; i++) {
            for (int x = 1; x <= 9; x++) {

                if ((x % i == 0) && (i != 1) && (x != 1)) {
                    System.out.println(i + "*" + x + "=" + i * x);
                }
            }
        }
    } //10명의 이름과 나이를 입력받아 화면에 출력해주세요
    // 스크린 출력문 , 반복문 작성, 이름 출력문 작성 밑 문자열 입력문 받기 , 나이 출력문 작성 나이 정수형 입력문 받기 , 출력문 나이 이름

    //예) 이름 000 나이 20
    // string / int
    public void lllqqq() {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("이름을 입력하세요 : ");
            String name = sc.nextLine();
            System.out.println("나이를 입력하세요 : ");
            int age = sc.nextInt();
            System.out.println("이름 : " + name + "나이" + age + "입니다.");
        }
    }


}