package com.orgiraffers.secotion01.array;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        test1 test1 = new test1();
        test1.arg();

    // 학생수의 평균을 구한다
    // 5개 과목 정수
    // 점수를 입력받고 화면에 출력

    } public void arg(){

        Scanner sc =new Scanner(System.in);
        int[] score = new int[5];

        int result = 0;
        for(int i=0; i<score.length; i++) {
            score[i] = sc.nextInt();
            result += score[i];
        }
            double arg = result/score.length;
            System.out.println("점수 총합 : " + result);
            System.out.println("점수 평균 : " + arg);


    }

}