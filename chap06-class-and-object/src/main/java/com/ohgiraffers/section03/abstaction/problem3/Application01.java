package com.ohgiraffers.section03.abstaction.problem3;

public class Application01 {
    public static void main(String[] args) {
        Car ram = new Car();
        ram.setName("람보르기니");

        Car po = new Car();
        po.setName("포르쉐");

        CarRacer lee = new CarRacer();
        lee.setCar(ram);
        lee.myCarInfo();

        lee.starUp();
        po.starUp();

        lee.go();
        lee.turnOff();


        lee.stop();
        lee.turnOff();


    }
}
