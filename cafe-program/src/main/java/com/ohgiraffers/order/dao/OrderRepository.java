package com.ohgiraffers.order.dao;

import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderRepository {
    private final ArrayList orders = new ArrayList();

    // 초기화하지 못하게 하는것
    public String order(OrderDTO[] order) {
        //0
        int oldNum = orders.size();

        for(OrderDTO orderDTO : order) {
            orders.add(orderDTO);
        }
        if (oldNum >= orders.size()) {
            return "등록실패";
        }
        return "등록성공";
    }

    public ArrayList print() {
        return this.orders;
    }

    public OrderDTO orderDetail(int no) {
        OrderDTO order = (OrderDTO) orders.get(no);
        return order;
    }

    public String remove(int delete) {

        orders.remove(delete);
        return delete + "번호가 삭제되었습니다";

        }
        public String orderModify(int num, int num2,String date) {
            if (num < orders.size()) {

                OrderDTO order = (OrderDTO) orders.get(num);
                switch (num2) {
                    case 1:
                        order.setMenuName(date);
                        break;

                    case 2:
                        order.setPrice(Integer.parseInt(date));
                        break;

                    case 3:
                        order.setQuantity(Integer.parseInt(date));
                        break;

                    default:
                        return "잘못 입력 하였습니다";
                }
                return order.toString() + "로 수정하였습니다";
            } else
                return "잘못된 입력입니다.";
        }
}