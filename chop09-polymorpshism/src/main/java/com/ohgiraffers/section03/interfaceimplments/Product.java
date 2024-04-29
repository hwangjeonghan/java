package com.ohgiraffers.section03.interfaceimplments;

/*
 * ectend : 상속
 * */
public class Product extends Object implements InterProduct {

    /*
     * 클래스에서 인터페이스를 상속받을 때에는 implements 키워드를 사용한다.
     * 또한 인터페이스는 여러 개를 상속받을 수 있으며
     * extends 로 다른 클래스를 상속 받는 경우에도 그것과 별개로 인터페이스도 추가 상속이 가능하다
     * 단 extends 키워드를 앞에 작성하고 implements를 뒤에 작성한다(순서 변경시 에러가 발생함)
     * */


    //@OVERRRIDE static 메소드 또한 프로그램이 로드될떄 메모리에 할당되기 떄문에 재정의가 불가능하다.
//    public static void staticMethod() {
//        System.out.println("inter priduct 클래스에 staticmethod 호출됨 ...");
//    }

    //@OVERRRIDE 재정의가 불가능하다 오직 인터페이스에서만 작성이 가능함
//    public default void defaultMethod() {
//        System.out.println("interproduct 클래스의 defaultMethod 호출됨..");


    @Override
    public void nonStaticMethod() {
        System.out.println("interproduct의 nonstaticmethod 오버라이딩한 메소드 호출됨 ...");
    }

    @Override
    public void absMethod() {
        System.out.println("interproduct의 absmethod 오버라이딩한 메소드 호출됨 ...");

    }
}
