package com.ohgiraffers.section05.Typecasting;

public class Application03 {
        public static void main(String[] args) {

        /*
        * 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
        * 다른 자료형 끼리 연산은 큰 자료형으로 자동 형변환 후 연산 처리된다.
        **/
            int inum = 10;
            long lnum = 100;

            int isum = inum + (int) lnum;



            byte byteVnum = 1;
            byte byteVnum2 = 2;

            short shortNum = 1;
            short shortNum2 = 2;

            int result = byteVnum + byteVnum2;
//          byte = (byte)((int)byte + (int)byte)
            int rseult2 =  byteVnum + byteVnum2;





        }
}
