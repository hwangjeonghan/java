package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

// D_switch라는 클래스를 모두가 사용할 수있도록 만든다.
public class D_switch { //D_switch의 시작
    // 클래스 내부 속성
    // testsimpelswithstatemnet 라는 반환 값이 없는 메서드를 모두가 사용할수있도록 만든다
    public void testSimpleswitchStatemnet() {// testSimpleSwitch 메서드의 시작
        /*
         * [switch문 표현식]
         * switch(비교대상 값){
         *   case 비교값 : 비교값이 참인 경우 실행할 구문; break;
         *   case 비교값 : 비교값이 참인 경우 실행할 구문; break;
         *   default : caes에 모두 해당하지 않는 경우; berak;
         * }
         * */
        // 사용자한테 값을 입력받을 수 있는 객체를 생성함
        Scanner sc = new Scanner(System.in);
        // 화면에 첫 번째 정수 입력 : 를 입력하라는 내용을 출력함
        System.out.println("첫번째 정수 입력 : ");
        // 사용자가 입력한 값을 정수로 받아서 first에 대입함
        int first = sc.nextInt();
        // 사용자의 화면에 두 번쨰 정수를 입력하라고 출력함
        System.out.println("두번쨰 정수 입력 : ");
        //사용자가 입력한 값을 second라는 변수에 정수로 받아서 대입함
        int second = sc.nextInt();
        //사용자의 화면에 연산기호를 입력하라고 출력함
        System.out.println("연산 기호 입력");
        //사용저거 압력한 연산 기호를 문자로 받아서 op에 대입함
        char op = sc.next().charAt(0);
        //아래의 계산기를 완성합니다.
        // 연산은 + - * /가 가능하며 이외는 계산 불가능이라는 결과를 화면에 출력합니다.

        switch (op) { // op변수를 기준으로 아래의 값과 일치하는지 확인함
            // op가 +와 같다면 first + second 결과를 화면에 출력함
            case '+':
                System.out.println(first + second);
                break;
            // op가 -와 같다면 first + second 결과를 화면에 출력함
            case '-':
                System.out.println(first - second);
                break;
            // op가 *와 같다면 first + second 결과를 화면에 출력함
            case '*':
                System.out.println(first * second);
                break;
            // op가 /와 같다면 first + second 결과를 화면에 출력함
            case '/':
                System.out.println(first / second);
                break;
            // op가 위의 수식에 모두 만족하지 않으면 같지 않음을 출력함
            default:
                System.out.println("같지않음");
                break;
        }//testSimpleswitchStatemnet 메서드의 종료

    }    // D_switch의 종료

    public double switchCalculator () {
        //1. 스캐너 값을 입력받는다
        Scanner sc = new Scanner(System.in);
        //2.첫 수 입력받기
        int frist = sc.nextInt();
        //3. 두번쨰 수입력받기
        int second = sc.nextInt();
        //4. 연산기호 입력받기
        char op1 = sc.next().charAt(0);
        double result = 0;
        //5.연산 기호 비교
        switch (op1) {
            case '+':
                result = frist + second;
                break;
            case '-':
                result = frist - second;
                break;
            case '*':
                result = frist * second;
                break;
            case '/':
                result = frist / second;
                break;
            default:
                System.out.println("연산불가");
        }
        //6. 반환
        return result;

    }
    // 계산기 만들고 /결과를 반환합니다. (switch를 이용함) /반환(retrun)된 결과는 application02에서 출력해주세요
    // + - / * 만 제공하고 일치하는 연산이 없는 경우 연산 불가라는 결과를 출력하고 반환값을 0.0으로 합니다.
    /*
    * 등급 계산기 프로그램 if
    * main에서 학생의 성적을 입력받고
    * 아래의 메서드에서 학생의 등급을 화면에 출력해주세요
    */

    //1.메서드를 만든다
    public void geadeCal(int score) {
        String grade;
        if (score == 100) {
            grade = "A+";
        }else if (score < 100 && score >= 90) {
            grade = "A";
        }else if (score < 90 && score >= 85) {
            grade = "B+";
        }else if (score < 85 && score >= 75) {
            grade = "B";
        }else if (score < 75 && score >= 60) {
            grade = "C";
        }else{
            grade = "D";
        }
        System.out.println("입력하신 학생의 점수는" + grade + "등급이다.");
    }
    //2.점수의 범위를 구분한다.
    //3.출력한다.





}

