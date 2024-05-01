package com.ohgiraffers.section01.list.map.run;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

public class Application01 {
    public static void main(String[] args) {

        /*
         * map 인터페이스의 특징
         * collection 인터페이스와는 다른 저장 방식을 가진다
         * 키(key) 와 값(value) 를 하나의 쌍으로 저장하는 방식을 사용한다
         *
         * key(키)란 ?
         * 값 (value) 를 찾기위한 이름 역할을 하는 객체를 의미한다
         * 1. 요소의 저장 순서를 유지하지 않는다.
         * 2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값은 저장할 수 있다
         *
         * hashmap. hashtable, treemap 등의 대포적인 클래스가있다
         * hasmap이 가장 많이 사용되며 hashtavle은 jdk 1.0부터 제공되며
         * hashmap과 동일하게 동작한다 하위 호환을 위해 남겨 놓았기때문에 가급적이면 hashmap을 사용하는것이좋다
         * */

        //hashmap jdk 1.2부터 제공되는 클래스로 해시 알고리즘을 사용하여 검색 속도가 매우 빠르다
        HashMap hamp = new HashMap();
        hamp.put("one", new Date());
        hamp.put(12, "red apple");
        hamp.put(33, 123);
        System.out.println(hamp);
        System.out.println(hamp.get(12));

        HashMap<Integer, String> imap = new HashMap();
        imap.put(1, "2");
        imap.put(2, "10");
        imap.put(3, "A");
        System.out.println(imap);
        System.out.println();

        Collection<String> values = imap.values();
        System.out.println(values);

    }
}
