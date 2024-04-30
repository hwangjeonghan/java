package com.ohgiraffers.Menu.order.dao;

import com.ohgiraffers.Menu.fakeDB.OrderDB;
import com.ohgiraffers.Menu.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderRepository {

    private final OrderDB orderDB = OrderDB.getInstance();

    public String order(OrderDTO[] orders) {

        int oldNum = orderDB.getOrders().size();

        for (OrderDTO orderDTO : orders){
            orderDB.setItem(orders);
        }
        if(oldNum >= orderDB.getOrders().size()){
            return "등록실패";
        }
        return "등록성공";
    }
    public String orderDelete(int no) {
        int oldSize = orderDB.getOrders().size();
        orderDB.getOrders().remove(no);
        if(orderDB.getOrders().size() >= oldSize){
            return "주문 취소가 실패하였습니다.";
        }
        return "주문이 취소되었습니다.";
    }
    public OrderDTO orderDetail(int no) {

        OrderDTO order = (OrderDTO) orderDB.getOrders().get(no);
        return order;
    }
    public ArrayList orderRead() {
        String text = orderDB.getOrders().toString();
        System.out.println("~~~~~~");
        System.out.println(orderDB.getOrders().toString());

        System.out.println("~~~~");
        return orderDB.getOrders();
    }
}