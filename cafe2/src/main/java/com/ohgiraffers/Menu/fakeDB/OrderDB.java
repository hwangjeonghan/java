package com.ohgiraffers.Menu.fakeDB;


import com.ohgiraffers.Menu.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderDB {

    private final ArrayList orders;
    private static OrderDB orderDB = new OrderDB();

    private OrderDB(){
        orders = new ArrayList();
        OrderDTO orderDTO = new OrderDTO("", 1000, 3);
        orders.add(orderDTO);

    }

    public static OrderDB getInstance(){
        return orderDB;
    }

    public void setItem(OrderDTO[] orderDTO){
        orders.add(orderDTO);
    }

    public ArrayList getOrders(){
        return orders;
    }
}