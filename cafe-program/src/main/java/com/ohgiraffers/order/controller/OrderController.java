package com.ohgiraffers.order.controller;

import com.ohgiraffers.order.dao.OrderRepository;
import com.ohgiraffers.order.dto.OrderDTO;
import com.ohgiraffers.order.service.OrderService;

public class OrderController {

    private OrderService orderService = new OrderService();

    public String oder(OrderDTO orderDTO){

        //컨트롤러 계층에서는 각 기능을 수행하기 위한 필수값의 누락이 있는지 검사한다.
        if(orderDTO.getMenuName().equals("")){
            return "메뉴를 정해주세요";
        }

        if(orderDTO.getQuantity() <= 0){
            return "수량을 입력해주세요";
        }

        // service 로직으로 넘김
        String result = orderService.order(orderDTO);
        return result;

    }  public String orderModify(){

        return "주문수정";

    }  public String orderDelete(int delete){
        orderService.orderDelete(delete);


        return "주문삭제";

    }  public String orderRead(){
        orderService.orderRead();

        return "주문 전체조회";

    }  public String orderDetail(){

        return "주문 상세조회";

    }

}
