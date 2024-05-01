package com.orgiraffers.secotion01.array;

import java.util.Scanner;

public class Test {
  public static void main(String[] args)
  {
   Test test =new Test();
   test.avg();

  }
  public void avg() //반환없는 메서드 명 avg 를 선언한다  / 배열 동일한 자료형의 묶음
  {
    String[] subject ={"수학","영어","국어","과학","사회"};
    Scanner sc = new Scanner(System.in); //스케너를 sc = 메모리 new
    int[] scores = new int[5]; // 원시 정수자료형 []배열 스코어라는 변수의 선언했다 = 메모리에 새로운 정수형 배열 0 1 2 3 4 초기화한다
    int result = 0;      // 배열초기화를 할떄 배열 개수를 length 라한다 .
    for (int i = 0; i < scores.length; i++)
      {
        System.out.println( subject[i] );
      scores[i] = sc.nextInt(); // 배열을 i (0~4)까지 이용하겠다 = 스케너에 입력하겠다
      result += scores[i]; // result = result + scores[i]
     }
    double avg = result / scores.length; //실수타입에 평균 (변수명)= 90+80+100+79+80 / 5

    for (int i = 0; i < scores.length; i++) {
    System.out.print(scores[i] + " ");
    }
    System.out.println("평균점수 : " + avg);
  }

  }
/*
 * a학생의 평균 점수를 구하는 프로그램을 만들어 주세요
 * 시험의 과목은 5개로 점수는 정수 단위입니다.
 *5개 과목의 점수를 입력받고 평균을 구하여 화면에 출력합니다.
 * 예) a학생의 수학 : 90점, 영어 :80, 국어 :100점, 과학 :79점, 사회 :80점이며 평균은 x입니다.
 */
