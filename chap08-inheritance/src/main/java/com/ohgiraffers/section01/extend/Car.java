package com.ohgiraffers.section01.extend;

public class Car {


    boolean runningstatus;

    public Car() {

        System.out.println("car 클래스의 기본생성자 호출됨");
    }

    public void soundhorn() {
        if (isRunning())
            System.out.println("빵!빵!");
        else
            System.out.println("주행중이 아닌 상태에서는 경적을 울릴 수 없습니다");

    }

    //private  boolean isRungnng(){
     boolean isRunning() {
        return runningstatus;
    }

    public void stop() {
        runningstatus = false;
        System.out.println("자동차가 멈춥니다");
    }

    public void run() {
        runningstatus = true;
        System.out.println("자동차가 달립니다");
    }
}