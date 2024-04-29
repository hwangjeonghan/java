package com.ohgiraffers.section04.use;

public class FireCar extends Car implements Soundable {

    @Override
    public void go() {
        System.out.println("소방차가가 달려갑니다");

    }

    @Override
    public void stop() {
        System.out.println(" 소방차가 멈춥니다");

    }
    @Override
    public  void horn(){
        System.out.println("소방차가 나갑니다 빠아아아아앙!");

    }
}
