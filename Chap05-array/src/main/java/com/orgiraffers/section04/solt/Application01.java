package com.orgiraffers.section04.solt;

import java.util.Arrays;

public class Application01 {
    public static void main(String[] args) {
        int[] num = {20, 10};

        int temp = num[0]; // 20
        num[0] = num[1];   // 10
        num[1] = temp; // temp 는 값을 임시저장할수있는 변수를 만들때

        int[] arr = {2, 1, 3};
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("정렬 후");
        Arrays.sort(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
