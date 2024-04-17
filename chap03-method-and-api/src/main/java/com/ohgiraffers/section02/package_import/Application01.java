package main.java.com.ohgiraffers.section02.package_import;

import main.java.com.ohgiraffers.section01.method.Calculator;
import static main.java.com.ohgiraffers.section01.method.Calculator.maxnumberof;


public class Application01 {
    public static void main(String[] args){
        int first = 200;
        int second = 300;
        main.java.com.ohgiraffers.section01.method.Calculator cal = new main.java.com.ohgiraffers.section01.method.Calculator();
        int max = maxnumberof(first, second);
        System.out.println(max);

    }
}
