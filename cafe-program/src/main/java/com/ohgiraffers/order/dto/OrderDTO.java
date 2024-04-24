package com.ohgiraffers.order.dto;

public class OrderDTO {


    private String menuName;

    private int price;

    private int quantity;

    public OrderDTO(String menu, int quantity, int price) {
        this.menuName = menu;
        this.quantity = quantity;
        this.price = price;
    }
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
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
                "menuName='" + menuName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
