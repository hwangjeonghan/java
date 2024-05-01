package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.compartor.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application02 {

    public static void main(String[] args) {
        List<BookDTO> bookDTOList = new ArrayList<>();
        bookDTOList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookDTOList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookDTOList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookDTOList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
        bookDTOList.add(new BookDTO(5, "삼국유사", "일연", 58000));

        for(BookDTO book : bookDTOList){
            System.out.println(book);
        }
        List testList = new ArrayList();
        testList.add(1);
        testList.add("2");
        testList.add('a');
        for(Object test : testList){
            System.out.println(test.toString());
        }
        //제네릭의 타입 제한에 의해 comparable 타입을 가지고 있는 경우에만 sort가 사용 가능하다
        //Collections.sort(bookDTOList);
        bookDTOList.sort(new AscendingPrice());

        System.out.println("가격오름차순 정렬");
        for (BookDTO book : bookDTOList) {
            System.out.println(book);
        }
    }
}
