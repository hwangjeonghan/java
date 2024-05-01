package com.ohgiraffers.section03.abstaction.problem2;

public class Car {
    //캡슐화가 되어있는거임
    private boolean isOn;

    private int speed;

    public void starUp() {
        if (isOn) {
            System.out.println("이미 시동이 걸려 있습니다");
        } else {
            this.isOn = true;
            System.out.println("시동이 걸려 있습니다. 이제 출발할 준비가 되어있습니다.");
        }
    }

    public void turnOff() {
        if (this.isOn) {
            if(this.speed >0){
                System.out.println("자동차를 멈추고 다시 종료해 주세요");
            }else {
                this.isOn = false;
                System.out.println("시동을 끕니다.");
            }
        } else {
            System.out.println("이미 시동이 꺼져 있는 상태입니다.");
        }
    }

    public void go() {
        if (this.isOn) {
            System.out.println("차의 시동을 걸어주세요.");
        } else {
            this.speed += 10;
            System.out.println(" 현재 시속은 " + this.speed + "k/m 입니다.");
        }
    }

    public void stop() {
        if (this.isOn) {
            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다.");
            }else{
                System.out.println("차가 멈춰있는 상태입니다.");
            }
        }else{
            System.out.println("시동이 걸려있지 않습니다.");
        }
    }
}