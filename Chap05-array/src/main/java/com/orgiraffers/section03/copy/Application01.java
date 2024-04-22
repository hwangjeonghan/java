package com.orgiraffers.section03.copy;

public class Application01 {
    public static void main(String[] args) { // 얕은복사 주소값을 공유한다
        String[] goldSideName = {"김재석","송재희","황정한"}; // 0,1,2 번쨰 인덱스들
        System.out.println(goldSideName[0]); // 0번쨰 인덱스 인 사람
        String[] names = goldSideName; //3명의 주소를 가지고있는놈
        System.out.println(goldSideName);
        System.out.println(names);        // 둘은 주소값이 같음

        goldSideName[0] = "김효주";  // 김재석에서 김효주로 인덱스를 초기화해줌
        System.out.println(goldSideName[0]);
        System.out.println(names[0]);        // 둘은 주소값이 같음 주소값을 공유하기때문에 네임즈도 바뀜  /얕은 복사
        System.out.println("-----깊은 복사 -----");

        // --------------------------
        // 깊은 복사의 대한 개념
        goldSideName = new String[]{"김재석","송재희","황정한"}; // 변수명을 새롭게 할당하는 것이 불편해서 임시로 재사용
        // 주소값 재할당
        names = new String[3]; // 주소를 다르게 가짐 new 힙메모리에 값을 새롭게 할당한다는 이야기임

        // for each
        int i =0;
        for (String name : goldSideName) {
            names[i] = name;
            i++;
        }
        goldSideName[0] = "이상우"; // 값만 다르게 할당
        System.out.println(goldSideName[0]); // 이상우
        System.out.println(names[0]);        // 김재석
        for(String name : names) {
            System.out.println(name);
        }
    }
}
