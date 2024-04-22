package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {

    String name;

    private int hp; //
    // 몬스터의 hp가 0보다 큰 값만 입력될 수 있도록 하여 버그를 막고자함

    public void sethp(int hp){ // sethp 시작 여기서의 hp는 매개변수 받은 hp / 지역변수
        if(hp > 0){ //매개변수 의 hp를 지칭
            this.hp = hp;  // 여기서의 hp는 내 hp를 나타낸다 / 예약어 this / 클래스에 있는 hp를 지칭 / 전역변수
            // call by 레퍼런스
        }else{
            System.out.println("몬스터의 체력은 0보다 작을 수 없습니다.");
        }
    }// set hp 종료
    public int gethp(){
        return this.hp;
    }

}
