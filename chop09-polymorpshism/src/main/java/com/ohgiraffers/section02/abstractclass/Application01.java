package com.ohgiraffers.section02.abstractclass;

public class Application01 {

    public static void main(String[] args) {

//        Product pro = new Product(); 추상클래스는 인스턴스 생성 불가
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.printSmartPhone();
        smartPhone.absMethod();



        Product product = new SmartPhone();
        product.absMethod();
        product.nonStatidMetthod();
    }
}
