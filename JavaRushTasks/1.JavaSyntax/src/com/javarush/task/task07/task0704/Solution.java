package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        int[] reArr = new int[10];

        for (int i = 0, j = (arr.length - 1); i < reArr.length && j >= 0 ; i++, j--) {

            reArr[i] = arr[j];

        }

        for (int i = 0; i < reArr.length; i++) {
            System.out.println(reArr[i]);
        }
    }
}

