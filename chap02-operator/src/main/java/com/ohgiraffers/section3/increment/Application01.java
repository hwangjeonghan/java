package com.ohgiraffers.section3.increment;

public class Application01 {
    public static void main(String[] args) {
        /*
        * 증감연산자
        * 피연산자의 앞 or 뒤 사용이 가능하다.
        *  '++' : 1의 증가를 의미한다.
        * '__' : 1의 감소를 의미한다.
        *  ++"변수명" " or 변수명 ++ ++x ll x++
        **/
        int num =0;
        int x = 10 + (++num); // ++ 이 나온곳부터 계산한다
        System.out.println(x);
        System.out.println(num);
        num =0;
        x = 10 + num++; // 앞을 계산하고 난후 나중에 계산한다
        System.out.println(x);
        System.out.println(num);


        num =0;
        int result = num++ * 10;
        //result = num * 10;
        // num += 1;
        System.out.println(result);

        result = ++num * 10;
        System.out.println(result);



    }
}
