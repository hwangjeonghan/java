package com.ohgiraffers.secation02.userexception;

import com.ohgiraffers.secation02.userexception.exception.MonenyNegativeException;
import com.ohgiraffers.secation02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.secation02.userexception.exception.PriceNegativeException;

public class Application01 {

    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

//        try {
//
//            et.checkEnoughMoney(100, 200);
//
//            try {
//                et.checkEnoughMoney(100, -200);
//
//            }catch (MonenyNegativeException e) {
//                System.out.println("정신 차려~~");
//            }
//
//        } catch (Exception e) {
//            System.out.println("상품의 가격을 정수로 다시 입력해주세요");




//        try {
//            et.checkEnoughMoney(-100, 200);
//
//        } catch (PriceNegativeException e) {
//            System.out.println("돈이 음수야");
//
//        } catch (MonenyNegativeException e) {
//            System.out.println("가진 돈이 음수야");
//
//        } catch (NotEnoughMoneyException e) {
//            System.out.println("제품이 가진 돈보다 비싸");
//
//        } catch (Exception e) {
//            System.out.println("워든 에러");
//        }



//        try {
//            et.checkEnoughMoney(100, 200);
//            et.checkEnoughMoney(200, -200);
//
//            et.checkEnoughMoney(10, 200);
//        } catch (Exception e){
//         익센션은 모든 예외의 최상의 타입으로 아래의 예외를 검사하지않음
//        } catch (PriceNegativeException e) {
//            System.out.println("제품의 가격이 음수 일 수 없습니다");
//        } catch (MonenyNegativeException e) {
//            System.out.println("가진돈이 음수 입니다");
//        } catch (NotEnoughMoneyException e) {
//            System.out.println("제품의 가격이 가진 돈보다 비싸네요");
//        }



        try {
            et.checkEnoughMoney(100, 200);
            et.checkEnoughMoney(200, -200);

            et.checkEnoughMoney(10, 200);

        } catch (PriceNegativeException e) {
            System.out.println("제품의 가격이 음수 일 수 없습니다");
        } catch (MonenyNegativeException e) {
            System.out.println("가진돈이 음수 입니다");
        } catch (NotEnoughMoneyException e) {
            System.out.println("제품의 가격이 가진 돈보다 비싸네요");
        }

        System.out.println("쇼핑 종료");
    }
}
