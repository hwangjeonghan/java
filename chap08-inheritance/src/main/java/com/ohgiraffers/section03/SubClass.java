package com.ohgiraffers.section03;

public class SubClass extends SuperClass {

    // 아래의 private 메소드는 자식에서 접근 할 수 없는 메소드로 재정의가 불가능하다.
    //private void privatemethod(){}
    //final 메서드는 변경할 수 없다는것을 의미하여 이로인해 재정의가 불가능하다.
    //private final void ifnalMethod(){}

    @Override
    public void method(int num) {
        super.method(num);
    }
  /

    @Override //runtimeExceptiond의 자식 클래스로 예외의 범위가 더욱 좁아서 가능하다.
    public void exceptionMethod() throws NullPointerException {
        super.exceptionMethod();
   }

    @Override// 부모보다 접근 범위를 좁게 만들 수 없다.
    protected void protectedmethod() {
        super.protectedmethod();


//@Override 메서드의 시그니처가 다른경우 오버라이드 불가능
//public void method(int num, int num2) {
//    super.method(num);
//}


//    @Override 반환타입이 다른경우 오버라이딩 불가능
//    public String method(int num) {
//    return "";
//}


    protected void protectedmethod() {
        super.protectedmethod();
    }
}

//    @Override 부모보다 더 넓은 범위의 예외를 처리할수없음
//    public void exceptionMethod() throws Exception {
//        super.exceptionMethod();
//    }
}