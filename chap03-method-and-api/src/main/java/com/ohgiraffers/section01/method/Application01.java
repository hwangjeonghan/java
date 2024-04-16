package main.java.com.ohgiraffers.section01.method;

public class Application01 {
        public static void main(String[] args) {
            /*
            * 메소드
            * 메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
            * */

            System.out.println("main() 시작됨....");

            Application01 app1 = new Application01(); //레퍼런스타입(참조하다)(메모리에 올림)
            app1.methodA();                     //메소드에이를 실행시켜라
         //.(참조연산자)

            System.out.println("main() 종료됨..");
        }
              //void는 반환(return)타입이없음 모든 메서드는 리턴이있어야 끝남.
        public void methodA(){
            System.out.println("methodA() 시작됨");
            methodB();
            System.out.println("methodA() 종료됨");

        }

        public void methodB(){
            System.out.println("methodB() 시작됨");
            methodC();
            System.out.println("methodB() 종료됨");

        }
        public void methodC(){
            System.out.println("methodC() 시작됨");
            System.out.println("methodC() 종료됨");    //선입후출

        }

}

