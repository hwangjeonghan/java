package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

//class 사용자 정의 단위
public class Application01 {
    public static void main(String[] args) {
        //쿠키를 찍어내는 것 나는 a_if 로찍을거야 ! aif라는 놈의 쿠키!
          A_if aIf = new A_if();
          aIf.testSimpleIfStatement();// 먹으려고 이 쿠키를 주문한거야!

        Application01 app1 = new Application01();
        String han1 = app1.call();
        System.out.println(han1);

        /*
         * 계산기 만들기
         * 두 수와 연산기호를 입력받아
         * 수를 입력받고 , 또 수를 입력받고, 그리고 연산기호를 받는다.
         * 연산기호에에 맞는 연산을 수행하는 프로그램을 만들어주세요
         **/


    }
    // 메서드의 이름 정하기 1. calculator 메서드를 만든다.
    public double Calculator(){
        // 입력받을수있는 기능을 추가한다
        Scanner sc = new Scanner(System.in);
        // 2. 첫번쨰 수를입력 받는다.
        int first = sc.nextInt();
        // 3. 두번쨰 수를 입력받는다.
        int second = sc.nextInt();
        // 4. 연산 기호를 입력받는다
        char operator = sc.nextLine().charAt(0);
        // 5. 연산기호를 확인한다.

        double result;
        if (operator == '+')
        {
            result = first + second;
        }else if (operator == '-')
        {
            result = first - second;
        }else if (operator == '*')
        {
            result = first * second;
        }else if (operator == '/')
        {
            result = first/second;
        }
        return 0.0;

    }
    // 6. 연산을 진행한다.
    // 7. 반환한다.
    //한번에 연산식 입력받기
        public String call() {          // 콜 이라는 메서드를 만든다 접근제어자에 스트링이라는 자료명
        Scanner sc = new Scanner(System.in); //스캐너 화면에서
        String input = sc.nextLine();        // 넥스트 라인 : 한 라인에 다 나타낸다
        String[] target = input.split(" ");  // String[] input = "1 + 2" [] 0번쨰 :"1" 1번쨰 :"+" 2번째 : "2"
        int result = 0;

        if (target[1].equals("+"))
        {
            result = Integer.parseInt(target[0]) + Integer.parseInt(target[2]); // 정수형으로 바꿀수있는 애들만 바꿔준다
        }
        else if(target[1].equals("-"))
        {
            result = Integer.parseInt(target[0]) - Integer.parseInt(target[2]);
        }else if(target[1].equals("*"))
        {
            result = Integer.parseInt(target[0]) * Integer.parseInt(target[2]);
        }else if(target[1].equals("/"))
        {
            result = Integer.parseInt(target[0]) / Integer.parseInt(target[2]);
        }else
        {
            System.out.println("수식이 틀렸습니다.");
        }
        return "" + result;

    }
}