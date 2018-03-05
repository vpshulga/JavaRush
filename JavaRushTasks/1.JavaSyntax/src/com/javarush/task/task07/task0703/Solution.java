package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arrs = new String[10];
        int[] arri = new int[10];
        for (int i = 0; i < 10; i++) {
            arrs[i] = reader.readLine();
            arri[i] = arrs[i].length();
        }

        for (int i = 0; i < arri.length; i++) {
            System.out.println(arri[i]);
        }

    }
}
