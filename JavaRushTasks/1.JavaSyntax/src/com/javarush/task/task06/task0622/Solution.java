package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        int n = 5;
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt( reader.readLine() );
        }
        for (int i = 1; i < num.length; i++) {
            for (int y = 1; y < num.length; y++) {
                if (num[y] < num[y - 1]) {
                    int min = num[y];
                    num[y] = num[y - 1];
                    num[y - 1] = min;
                }
            }
            if (num[i] < num[i - 1]) {
                int min = num[i];
                num[i] = num[i - 1];
                num[i - 1] = min;
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println( num[i] );
        }


    }
}
