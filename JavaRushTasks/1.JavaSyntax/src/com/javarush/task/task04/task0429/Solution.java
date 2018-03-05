package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int[] arr = {a, b, c};


        int countp = 0;
        int counto = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                countp++;
            else if (arr[i] < 0)
                counto++;
        }

        System.out.println("количество отрицательных чисел: " + counto);
        System.out.println("количество положительных чисел: " + countp);

    }
}
