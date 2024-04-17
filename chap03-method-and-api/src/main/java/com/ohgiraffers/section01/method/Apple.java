package main.java.com.ohgiraffers.section01.method;

public class Apple {
    public static void main(String[] args) {
        String name = "황정한";
        int age = 30;
        char gender = 'M';
        String phone = "010-5583-5585";

        Apple app1 = new Apple();
        // 애플이라는 클레스를 애플이라는 변수명으로 선언한다. 애플을 매모리 영역에 올린다.
        String num = app1.myinfo(name, age, gender, phone);
        // 문자열이라는 자료형을 가진 num을 선언하고 매개변수 4개를 가진 app1.myinfo라는 함수를 호출하고 반환 받은 값으로 num을 초기화한다
        System.out.println(num);




    }

    public String myinfo(String name, int age, char gender, String phone) {

    String result = name + age + gender + phone;
    return result;
}


}
        /*
         *  myinfo함수를 만들고
         *  이름 문자열
         *  나이 정수
         *  성별 문자
         *  전화번호 '-'을 포함한 전화번호
         *
         * 위 4개의 자료형을 매개변수로받아 하나의 문자열로 더하고 main에서 출력해주세요
         * */
// 마이 임포 함수를 만든다
// 이름 나이 문자 성별 전화번호를 작성한다
// 4개의 자료형을 매개변수를 받는다
// 문자열로 더한다
//리턴으로 메인에 출력한다