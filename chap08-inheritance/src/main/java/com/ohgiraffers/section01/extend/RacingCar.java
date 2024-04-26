package com.ohgiraffers.section01.extend;

public class RacingCar extends Car {

    public RacingCar() {
        System.out.println("RacingCar클래스 기본생성사 호출됨");
    }

    @Override
    public void soundhorn() {
        System.out.println("레이싱카는 경적을 올리지 않습니다");
    }

    @Override
    boolean isRunning() {
        return super.isRunning();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
