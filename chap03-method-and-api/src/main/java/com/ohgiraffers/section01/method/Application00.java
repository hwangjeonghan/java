package main.java.com.ohgiraffers.section01.method;

public class Application00 {
    public static void main(String[] args)
    {
        /*
         *  myinfo함수를 만들고
         *  이름 문자열
         *  나이 정수
         *  성별 문자
         *  전화번호 '-'을 포함한 전화번호
         *
         * 위 4개의 자료형을 매개변수로받아 하나의 문자열로 더하고 main에서 출력해주세요
         * */

        String name = ("황정한");
        int age = 30;
        char gender = ('남');
        String phone = ("010-5583-5585");

        Application00 app1 = new Application00();
        String sum = app1.myimfo(name, age, gender,phone);
        //String info + app1.myinfo("황정한",20,'남',"010-5583-5585")
        System.out.println(sum);
        //System.out.println(app1.myinfo("황정한",20,'남',"010-5583-5585"));


    }
                           //myimfo() 이게 매개변수
    public String myimfo(String name, int age,char gender, String phone) {
        String result = name + age + gender + phone;
        return result;
    }

    //1.myimfo 함수 만들기
    //2.매개변수 String, int age,char gender, String phone
    //3.매개변수 더하기
    //4. retrun result
}

