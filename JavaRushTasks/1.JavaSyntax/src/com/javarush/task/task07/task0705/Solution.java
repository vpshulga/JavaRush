package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[20];
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0, j =0; i < arr.length / 2 && j < arr1.length; i++, j++) {
            arr1[j] = arr[i];
        }

        for (int i = arr.length / 2, j = 0; i < arr.length && j < arr2.length; i++, j++) {
            arr2[j] = arr[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
