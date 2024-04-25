package com.ohgiraffers.order.service;

import com.ohgiraffers.order.dao.OrderRepository;
import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderService {

    private final OrderRepository orderRepository = new OrderRepository();
    // 서비스 계층
    // 비즈니스 로직 수행 및 데이터 베이스의 대한 리소스를 관리한다.

    public String order(OrderDTO[] orders) {


        for (OrderDTO orderDTO : orders) {

            if (!orderDTO.getMenuName().equals("아메리카노")) {
                //if(1 != 1)
                //******* 조건식이 겟네임을  아더 디티오에 참조해서 아메리카노와 같지 않을때  true 면 넘어가고 false 면리턴값으로 넘긴다
                return "주문실패";
            }
            if (orderDTO.getPrice() <= 0) {
                return "땅파서 장사하냐?";
            }

        }
        String result = orderRepository.order(orders);
        return result;
    }
    public ArrayList orderRead(){
        return orderRepository.print();

    }
    public String orderDelete(int delete) {
        return  orderRepository.remove(delete);

    }
    public OrderDTO orderDetail(int no) {
        OrderDTO order = orderRepository.orderDetail(no);
        return order;
    }
}
