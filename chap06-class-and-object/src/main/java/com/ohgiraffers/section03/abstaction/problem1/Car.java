package com.ohgiraffers.section03.abstaction.problem1;

public class Car {

    private boolean isOn; //캡슐화가 되어있는거임

    private int speed;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
