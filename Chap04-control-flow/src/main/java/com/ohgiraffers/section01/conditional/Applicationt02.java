package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

//프로그램내에서 모두가 사용할수있는 application2라는 클래스를 선언한다
public class Applicationt02 { //application02 의 시작
    // 프로그램이 시작시 바로 사용할수있도록 static 영역에 main이라는 함수를 만들고 문자열 배열의 타입을 가진 args 라는 변수를 선언한다
    public static void main(String[] args) { //main의 시작
        // 디 스위치 라는 자료형을 가진 디스위치 변수를 만들고 디스위치 타입으로 값을 제공한다.
        // 디 스위치는 사용자 정의 자료형으로써 타입은 우리가 만든 디스위치를 확인해야한다.
        //  D_switch dSwitch = new D_switch();
        //디스위치 변수가 가지고 있는 testsimple메소드를 실행한다.
        // dSwitch.testSimpleswitchStatemnet();
    //-------------------------------
        //0.D_switch를 만든다
        D_switch dswitch = new D_switch();
        //1. 값을 반환 받는다.
        //  double result = dswitch.switchCalculator();
        //2.화면에 출력한다.
        //  System.out.println(result);
    // -----------------------


        //1. 학생의 성적을 입력받는다
        Scanner in = new Scanner(System.in);
        //2. 입력받은 성적을 매개변수로 전달한다.
        int score = in.nextInt();

        dswitch.geadeCal(score);



    }//mian의 종료
}    // appliaction2의 종료