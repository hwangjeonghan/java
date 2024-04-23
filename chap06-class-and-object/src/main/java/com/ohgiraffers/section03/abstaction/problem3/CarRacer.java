package com.ohgiraffers.section03.abstaction.problem3;

public class CarRacer {

    private Car car; // 카레이서라는 클레스의 카라는 필드(자바에없이 내가만드는것)

    public Car getCar() {
        return car;
    }

    public void setCar(Car car)
    {
        this.car = car;
    }

    public void starUp()
    {
        this.car.starUp();
    }

    public void turnOff()
    {
       this.car.turnOff();
    }

    public void go()
    {

        this.car.go();
    }

    public void stop()
    {

        this.car.stop();
    }

    public void myCarInfo(){
        System.out.println(this.car.carName());
    }

}