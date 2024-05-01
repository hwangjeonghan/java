package com.ohgiraffers;

import com.ohgiraffers.order.controller.OrderController;
import com.ohgiraffers.order.dto.OrderDTO;

import java.util.Date;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderController orderController = new OrderController();
        boolean order = true;
        String result = " ";

        while (order) {

            System.out.println("1.주문 등록");
            System.out.println("2.주문 삭제");
            System.out.println("3.주문 수정");
            System.out.println("4.주문 상세조회");
            System.out.println("5.주문 전체조회");
            System.out.print("어떤 메뉴를 동작하시겠나요?");
            int input = sc.nextInt();
            sc.nextLine();
            //  OrderDTO orderDTO = new OrderDTO(); 빈 빌지가 되어버리니까 빌지에 메뉴 수량 가격을 받을수있게 만들어서 바꾼거임


            switch (input) {
                case 1: //주문등록
                    System.out.println("몇개의 메뉴를 주문하시겠습니까? ");
                    int cnt = sc.nextInt();
                    sc.nextLine();

                    OrderDTO[] orders = new OrderDTO[cnt];

                    for (int i = 0; i < orders.length; i++) {
                        System.out.print("메뉴를 입력해 주세요 : ");
                        String menu = sc.nextLine(); //아메리카노 카푸치노 밀크
                        System.out.print("수량을 입력 해 주세요 : ");
                        int quantity = sc.nextInt(); // 1 2 3
                        sc.nextLine();
                        System.out.print("가격을 입력 해 주세요 : ");
                        int price = sc.nextInt();
                        sc.nextLine();
                        orders[i] = new OrderDTO(menu, quantity, price);
                    }
                    result = orderController.order(orders);
                    break;

                case 2: //주문삭제
                    System.out.print("삭제 할 주문 번호를 입력하세요");
                    int delete = sc.nextInt();
                    sc.nextLine();
                    result = orderController.orderDelete(delete);
                    break;
                case 3: //주문 수정
                    break;

                case 4: //주문 상세조회
                    System.out.println("상세 조회할 제품 번호를 입력해주세요");
                    int num = sc.nextInt();
                    sc.nextLine();
                    result = orderController.orderDetail(num);

                    break;

                case 5: //주문 전체조회
                    orderController.orderRead();
                    break;

                default:

                    System.out.print("입력이 잘못되었습니다.");
                    break;
            }

            System.out.println(result);

            System.out.print("주문을 종료하시겠나요?");
            order = sc.nextBoolean();

        }
    }
}
