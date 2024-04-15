package com.ohgiraffers.section01.aritthmetic;

public class Application01 {
    public static void main(String[] args) {
        /*
        * 산술 연삱자
        * 산술 연산자는 주로 사칙연산 고한련된 연산자로 가장 기본적인면서도 많이 사용되는 연산자이다.
        * 연산의 실행이 가능하기 위해 필요한 값이나 변수가 두 개인 이항 연산자로 분료되며
        * 피연산자들의 연산 방향은 왼쪽에서 오른쪽이다.
        **/


        /*
        * 산술연산자의 종류
        *  '+' : 왼쪽의 피연산자에 오른쪽의 피연산자를 더함
        *  '_' : 왼쪽의 피연산자에 오른쪽의 피연산자를 뻄
        *  '*' : 왼쪽의 피연산자에 오른쪽의 피연사자를 곱함
        *  '/' : 왼쪽의 피연산자에 오른쪽의 피연산자로 나눔
        *  '%' : 왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 나머지를 반환
        **/

        /*
        * 산술 연산자의 우선순위
        * 수학의 개념과 유사하게 곱하기와 나누기 연산이 더하기와 뺴기 연산보다 우선적으로 동작한다.
        * 우선순위가 같은경우 연산자의 결합 방향에 의해 실행 순서가 경정된다
        **/

        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + ((double) num1 / num2));
        System.out.println("num1 % num2 = " + num1 % num2 );



    }
}
