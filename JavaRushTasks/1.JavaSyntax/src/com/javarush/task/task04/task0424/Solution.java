package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int na = 1;
        int nb = 2;
        int nc = 3;

        if (a == b && a != c)
            System.out.println(nc);
        if (a != b && a == c)
            System.out.println(nb);
        if (b == c && b != a)
            System.out.println(na);

    }
}
