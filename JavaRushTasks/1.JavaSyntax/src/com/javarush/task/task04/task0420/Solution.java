package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int min1 = 0;
        int min2 = 0;
        int min3 = 0;

        if (a <= b && a <= c) {
            min1 = a;
            if (b < c) {
                min2 = b;
                min3 = c;
            }
            else
            {
                min2 = c;
                min3 = b;
            }

        }
        else if (b <= a && b <= c)
        {
            min1 = b;
            if (a < c)
            {
                min2 = a;
                min3 = c;
            }
            else
            {
                min2 = c;
                min3 = a;
            }

        }
        else if (c <= a && c <= b)
        {
            min1 = c;
            if (a < b)
            {
                min2 = a;
                min3 = b;
            }
            else
            {
                min2 = b;
                min3 = a;
            }

        }
        System.out.println(min3 + " " + min2 + " " + min1 + " ");




    }
}
