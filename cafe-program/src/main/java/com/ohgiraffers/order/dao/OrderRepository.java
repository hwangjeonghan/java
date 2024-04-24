package com.ohgiraffers.order.dao;

import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderRepository {
   private final ArrayList orders = new ArrayList();
   // 초기화하지 못하게 하는것
    public String order(OrderDTO orderDTO) {
        //0
        int oldNum = orders.size();

        orders.add(orderDTO);
        if (oldNum >= orders.size()) {
            return "등록실패";
        }
        return "등록성공";
    }

    public ArrayList print() {
        return this.orders;
    }

    public OrderDTO orderDetail(int no){
        OrderDTO order = (OrderDTO) orders.get(no);
        return order;
    }
    public void remove(int no){
        int oldSize = orderDB.getOrders().size();
        orderDB.getOrders().remove(no);
        
    }


}
