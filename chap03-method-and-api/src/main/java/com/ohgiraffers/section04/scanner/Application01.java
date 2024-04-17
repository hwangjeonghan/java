package main.java.com.ohgiraffers.section04.scanner;
// 패키지라는 경로에 (생략)
import java.util.Scanner;
//포함한다 자바라는 패키지에 유틸이라는 패키지에 스캐너라는 클래스
public class Application01 { // 클래스 안에 애플리케이션 01에
    public static void main(String[] args) { //접근제어자는 퍼블릭으로 아무나 쓸수 있으며 메모리영역은 스텍틱으로 미리 올려둔다 반환값은 존재하지않고 메소드명은 메인이라고한다

        Scanner sc = new Scanner(System.in); // 클래스 스캐너를 sc변수로 선언한다 = sc안에는 스캐너라안에 시스템 인이라는 객채를 만들어서 sc를 초기화한다

    Application01 app1 = new Application01(); // 이하동일
    String info = app1.inputinfo(); // 문자열 변수인포 안에 app1.inoutinfo를 해당함수에 초기화한다.
    System.out.println(info); // 인포를 출력한다

    }

    public String inputinfo(){


        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.println("당신의 키를 입력해주세요 : ");
        double height = sc.nextDouble();
        System.out.println("당신의 나이를 입력해주세요 : ");
        int age = sc.nextInt();
        System.out.println("당신의 성별을 입력해주세요 : ");
        char gender = sc.next().charAt(0); // 넥스트 라인은 라인을 입력해줌

        return "당신의 이름은" + name + "입니다. \n" +  "당신의 나이는 " + age + "세 입니다. \n" + "당신의 키는 " + height +" 입니다 \n " + "당신의 성별은" + gender + "입니다.";
         //클래스는 사용자 정의 타입 / sc 변수명 == 메모리의 주소== 값 // 스캐너는 사용자에게 입력받는것
        //heap(String) app1. ~~ 권한을 넣어주는것  앨 만들려면 조건이있어야할떄도있고 없을때도있다
    }

}
