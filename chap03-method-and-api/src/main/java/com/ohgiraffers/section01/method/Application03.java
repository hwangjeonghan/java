package main.java.com.ohgiraffers.section01.method;

public class Application03 {
    public static void main(String[] args)
    {
        int x = 10;
        int y = 20;

        Application03 app3 = new Application03();
        int result = app3.plus(x, y);
        System.out.println(result);
        result = app3.ma(x, y);
        System.out.println(result);
        result = app3.gopp(x, y);
        System.out.println(result);
        result = app3.na(x, y);
        System.out.println(result);
        result = app3.na2(x, y);
        System.out.println(result);
    }
    // 두수를 더하는 함수
    // 접근제어자 반환타입 함수명(매개변수){}함수몸채

         public int plus(int x,int y)
         {
         int result = x+y;
         return result;

         }
    public int ma(int x,int y)
    {
        int result = x-y;
        return result;
    }
    public int gopp(int x,int y)
    {
        int result = x*y;
        return result;

    }
        public int na(int x,int y)
        {
            int result = x/y;
            return result;
        }
        public int na2(int x,int y){
         int result = x%y;
         return result;

    }
}
