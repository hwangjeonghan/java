package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application03 {

    public static void main(String[] args) {
        /*
        * 단일 연결 리스트
        * : 저장한 요소가 순서를 유지하지 않고 저장되지만 이러한 요소를 사이클 링크로 연결하여 구성하며
        * 마치 연결된 리스트 형태인 것 처럼만든 사료 구조이다
        * 요소의 저장과 삭제 시 다음 요소를 가리키는 참조 링크만 변경하면 되기 떄문에
        * 요소의 저장과 삭제가 번번히 일어나는 경우 ArrayList 보다 성능면에서 우수하다
        * 하지만 단일 연결 리스트는 다음 요소만 링크하기떄문에 이전 요소로 접근하기가 어렵다
        * 이를 보완하고자 만든것이 이중 연결 리스트이다
        *
        * 이중연결리스트
        * 단일 연결 리스트는 다음 요소만 링크하는 반면 이중 연결리스트는 이전 요소도 링크하여
        * 이전요소로 접근하기 쉽게 고안된 자료 구조이다
        *
        * liskedlist는 이중연결 리스트를 구현한것이며 역시 list 인터페이스를 상속받아서
        * arraylist 와 사용하는 방법이 거의 유사하다
        * 하지만 내부적으로 요소를저장하는방법에 차이가있는것이다
        * 각 컬렉션 프레임 워크 클래스들의 특징을파악하고 그에 따라 적합한 자료구조를 구현한 클래스를 선택하는 것이좋다
        *
        * */

        List<String> linkedList = new LinkedList<>();

        linkedList.add("apple");
        linkedList.add("banana");

        System.out.println(linkedList.size());

        System.out.println(linkedList.get(0));

        linkedList.remove(0);
        System.out.println(linkedList);


        System.out.println(linkedList.isEmpty());
        //리스트를 초기화함
        linkedList.clear();
        System.out.println(linkedList.isEmpty());
    }
}
