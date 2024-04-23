package com.ohgiraffers.order.dto;

public class OrderDTO {

    private String menuname;

    private int price;

    private int quantity;

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public int getPrice() {
        return price;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity, int price) {
        this.quantity = quantity;
        this.price = quantity * price;

    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "menuname='" + menuname + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
