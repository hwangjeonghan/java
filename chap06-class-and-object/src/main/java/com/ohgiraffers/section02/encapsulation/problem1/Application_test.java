package com.ohgiraffers.section02.encapsulation.problem1;

public class Application_test {
    public static void main(String[] args) {

        Book[] books = new Book[3];
        // 자료형 변수명
        Person jung = new Person();

        books[0].bname = "개미";
        books[1].bname = "어린왕자";
        books[2].bname = "고래";

        books[0].author = "베르나르";
        books[1].author = "몰라";
        books[2].author = "황정한";


        books[0].num = 0001;
        books[1].num = 0002;
        books[2].num = 0003;

        jung.book = books[0];
        jung.hname = "황정한";



    }
}
