package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

            int[] arr = new int[N];
            arr[0] = Integer.parseInt(reader.readLine());
            int maximum = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i] = Integer.parseInt(reader.readLine());


                if (arr[i] > maximum)
                    maximum = arr[i];

            }
            System.out.println(maximum);

    }
}
