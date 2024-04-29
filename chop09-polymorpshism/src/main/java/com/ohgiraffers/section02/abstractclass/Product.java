package com.ohgiraffers.section02.abstractclass;

public abstract class Product {

    private int nonStatidFiled;

    private static int staticFiled;

    public Product() {

    }
    public void nonStatidMetthod() {
        System.out.println("product 클래스의 nonStaticMethod 호출함");
    }
    public static void staticMethod() {
        System.out.println("product 클래스의 StaticMethod 호출함");
    }
    public  abstract  void absMethod();
}
