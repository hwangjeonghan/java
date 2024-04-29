package com.ohgiraffers.order.controller;


import com.ohgiraffers.order.dto.OrderDTO;
import com.ohgiraffers.order.service.OrderService;


import java.util.Scanner;

public class OrderController {

    Scanner sc = new Scanner(System.in);

    private final OrderService orderService = new OrderService();

    public String order(OrderDTO[] orders) {

        for (OrderDTO orderDTO : orders) {
            //컨트롤러 계층에서는 각 기능을 수행하기 위한 필수값의 누락이 있는지 검사한다.
            if (orderDTO.getMenuName().equals("")) {
                return "메뉴를 정해주세요";
            }

            if (orderDTO.getQuantity() <= 0) {
                return "수량을 입력해주세요";
            }

        }

        //컨트롤러 계층에서는 각 기능을 수행하기 위한 필수값의 누락이 있는지 검사한다.

        // service 로직으로 넘김
        String result = orderService.order(orders);
        return result;

    }

    public String orderModify(int sel) {
        if (sel < 0) {
            return "똑바로 입력해주세요 ";
        }
        int num = 0;
        System.out.println("수정을 원하는 정보를 입력해 주세요(메뉴,가격,수량)");
        String input = sc.nextLine();
        if (input.equals("메뉴")) {
            num = 1;
        }else if(input.equals("가격")) {
            num = 2;
        }else if(input.equals("수량")){
            num = 3;
        }else{
            return "입력이 틀렸습니다 다시 확인하세요";

        }System.out.println("덮어쓸 정보를 입력해주세요");
        String input2 = sc.nextLine();
        return orderService.orderModify(sel, num, input2);


    }

    public String orderDelete(int delete) {


        if(delete < 0) {
            return "확인해주세요";
        }
            return orderService.orderDelete(delete);
    }

    public String orderRead() {
        String hwang = String.valueOf(orderService.orderRead());
        System.out.println(hwang);
        return hwang;


    }

    public String orderDetail(int no) {
        if (no < 0) {
            return "메뉴 번호를 잘못 입력하였습니다.";
        }
        OrderDTO orderDTO = orderService.orderDetail(no);
        if (orderDTO == null) {
            return "존재하지 않는 주문입니다";
        }
        return orderDTO.toString();
    }
}