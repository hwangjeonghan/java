package com.ohgiraffers.section04.dto;

import java.util.Date;

public class Application01 {
    public static void main(String[] args) {

        UserDTO user = new UserDTO("id","pwe","쏭", new Date());

        System.out.println(user);
    }
}
