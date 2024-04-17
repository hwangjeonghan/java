package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

    public void testSimpleIfStatement(){
        /*
         * [if 표현식]
         * if(조건식){
         * 조건식이 참인 경우에 싷행할 명령문
         * }
         *
         * 조건식 : true or false 가 나오는 연산식을 의미한다.
         *
         **/

        Scanner sc = new Scanner(System.in);
        System.out.println("값을 입력 해주세요");

        int num = 10;
        //2의 배수면 n은 2의 배수입니다.
        //0이면 n은 0입니다,
        //2의 배수가 아니면 n은 2의 배수가 아닙니다.

        if(num % 2 != 0){
            System.out.println(num + "은 2의 배수가 아닙니다.with if");
        }else{
            System.out.println(num + "은 2의 배수입니다. with eles");
        }
        if(num % 2 == 0){ // 참일경우 실행
            System.out.println(num + "은 2의 배수입니다");
        }else{ // 거짓일 경우 실행
            System.out.println(num + "2의 배수가 아니면 n은 2의 배수가 아닙니다.");
        }

    }
}
