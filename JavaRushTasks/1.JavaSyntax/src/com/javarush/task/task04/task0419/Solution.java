package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        int n1;
        int n2;

        if (a > b)
            n1 = a;
        else
            n1 = b;

        if (c > d)
            n2 = c;
        else
            n2 = d;

        if (n1 > n2)
            System.out.println(n1);
        else
            System.out.println(n2);
    }
}
