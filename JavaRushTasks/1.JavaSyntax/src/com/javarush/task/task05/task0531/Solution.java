package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b,c,d,e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
        int min =0;
        int min1;
        int min2;

        if (a<b)
            min1 = a;
        else
            min1 = b;

        if (c<d)
            min2 = c;
        else
            min2 = d;


        if(min1 < min2 && min1 < e)
            min = min1;
        else if(min2 < min1 && min2 < e)
            min = min2;
        else if (e< min1 && e< min2)
            min = e;


        return min;

    }
}
