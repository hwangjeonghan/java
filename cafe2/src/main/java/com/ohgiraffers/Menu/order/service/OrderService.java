package com.ohgiraffers.Menu.order.service;

import com.ohgiraffers.Menu.order.dao.OrderRepository;
import com.ohgiraffers.Menu.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderService {

    private final OrderRepository orderRepository = new OrderRepository();

    public String order(OrderDTO[] order) {

        for (OrderDTO orderDTO : order) {
            if (orderDTO.getPrice() <= 0) {
                return "땅파서 장사하냐?";
            }
        }
        String result = orderRepository.order(order);
        return result;
    }
    public String orderDelete(int no){
        String result = orderRepository.orderDelete(no);
        return result;
    }
    public OrderDTO orderDetail(int no){

        OrderDTO order = orderRepository.orderDetail(no);
        return order;
    }
    public ArrayList orderRead() {
        ArrayList menuList = orderRepository.orderRead();
        return menuList;
    }
}