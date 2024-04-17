package main.java.com.ohgiraffers.section01.method;

public class Application02 {
    public static void main(String[] args) {
        /*
         * 전달인자(argumnet)와 매개수(parameter)를 이용한 메소드 호출
         * */

        /*
         * 변수의 종류
         * 1. 지역변수
         * 2. 매개변수
         * 3. 전역변수(필드)
         * 4.클래스(static)변수   //예열
         * */

        /*
         * 지역변수는 선언한 메소드 블러 내부에서만 사용이 가능하다. 이것을 지역변수의 스코프라고 한다.
         * 다른 메소드간 서로 공유해야 하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달 할 수 있다
         *  이 때 전달하는 값을 전달인가(argument) 라고 부르고
         * 메소드 선언문 괄호안에 전달 인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 부른다.
         * */
        int age = 20; // int자료형에 age변수명에 20으로 초기화했다
        Application02 app1 = new Application02();      //어플02에 속성 사람이 걸어다닌다 팔을흔든다
        app1.testMethod(age); //app1.testmethod(); 호출
        //app1. (heap)
    }

        public void testMethod(int x)
        {
            System.out.println("당신의 나이는 " + x + "세 입니다.");

        }
        // add함수() 정수(x.y) 2개 더해서(x+y) 반환(retrun)  메인출력
        public int add ( int x, int y){
            //(접근제어자) (접근 반환타입)
            return x + y;
        }
}