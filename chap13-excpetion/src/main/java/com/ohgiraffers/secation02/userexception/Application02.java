package com.ohgiraffers.secation02.userexception;

import com.ohgiraffers.secation02.userexception.exception.MonenyNegativeException;
import com.ohgiraffers.secation02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.secation02.userexception.exception.PriceNegativeException;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();
        /*
        * scanner 는 시스템에서 입력을 받을 수 있는 기능을 수행한다
        * 그러나 이러한 기능은 애플리케이션이 실행하는 과정에서 잘못된 임의의 값이 들어갈 수 있다
        * 그렇기 떄문에 항상 SCANNER.CLOSE()으로 호출하여 리소스를 제거해 줘야한다
        * */

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("제품 가격을 입력해주세요");
            int price = sc.nextInt();
            System.out.println("가진 돈을 입력해주세요");
            int money = sc.nextInt();

            et.checkEnoughMoney(price,money);

        } catch (PriceNegativeException e) {
            System.out.println("PriceNegativeException가 발생함");

        } catch (MonenyNegativeException e) {
            System.out.println("MonenyNegativeException 발생함");

        } catch (NotEnoughMoneyException e) {
            System.out.println("NotEnoughMoneyException 발생함");

        }finally {
            // finally 블럭은 오류가 있던 없던 항상 실행하는 블럭이다
            /*
            * 위에 설명한 내용과 같이 scanner는 리로스를 사용하면 닫아주어야한다
            * 그렇기 떄문에 try 불러에서 닫는경우 에러가 발생더ㅣ었을떄 닫히지 않는 경우가 발생할수있어
            * finally 블럭에서 scanner에 할당된 리소스를 제거하여 오류가 발생하던 발생하지 않던 리소스를 제거하게된다
            * */
            sc.close();
            System.out.println("오류가 나던 말던 나는 나의 갈 길을 가련다");
        }
        // Exception in thread "main" java.lang.IllegalStateException: Scanner closed 에러가 발생함
        sc.nextLine();

        //확장문법
        /*
        * 위의 ifnally는 주로 리소스를 제거하는 경우 많이 사용하기 떄문에
        * 이를 축약한 확장 문법으로 try 블럭에() 소괄호 부분에 리소스 할당이 필요한 인스턴스를 생성하게된다면
        * try and catch 블럭에 오류가 있던 없던 리소스를 제거하게 된다
        * 즉, sc.close() 를 항상 마지막에 호출한다는 이야기이다.
        * */
        try(Scanner sc2 = new Scanner(System.in)) {
            System.out.println("제품 가격을 입력해주세요");
            int price = sc.nextInt();
            System.out.println("가진 돈을 입력해주세요");
            int money = sc.nextInt();

            et.checkEnoughMoney(price,money);

        } catch (PriceNegativeException e) {
            System.out.println("PriceNegativeException가 발생함");

        } catch (MonenyNegativeException e) {
            System.out.println("MonenyNegativeException 발생함");

        } catch (NotEnoughMoneyException e ) {
            System.out.println("NotEnoughMoneyException 발생함");

        }


        System.out.println("즐쇼 ~~~~~");
    }
}
