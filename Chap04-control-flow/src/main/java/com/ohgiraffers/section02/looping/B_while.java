package com.ohgiraffers.section02.looping;

public class B_while {
    public void testSimplewhileststement(){

        /*
        * [while문 표기식]
        * 초기식;
        * while(조건식){
        * 조건식을 만족하는 경우 수행할 구문(반복할 구문)
        * 증감식;
        * }
        *
        * while(조건식){
        * 조건식을 만족하는 경우 수행할 구문
        * }
        * */

        // while 문을 이용해 구구단을 만든다
        // 1, 초기식 작성
        // 2, while문의 조건식
        // 3. 중첩 while 조건식
        // 4. 연산 i*j
        // 5. 출력
        // 6. 중첩while 증감식
        // 7. while 문의 증감식
        // 8. 중첩 while의 조건 변수 초기화

        int i = 1;

        while (i <= 9) { // 반복해야 하는 대상의 길이를 알 수 없을때 사용한다.
            int j = 1;

            while (j <= 9) {
                System.out.println(i + "*"+ j+ "=" + i * j);
                j++;
            }
            i++;
        }
    }
}
