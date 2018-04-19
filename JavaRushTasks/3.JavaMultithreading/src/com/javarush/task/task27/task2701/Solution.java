package com.javarush.task.task27.task2701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Избавляемся от меток
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        int n = 4;
        int m = 3;
        int s = 0;
        for(int i = 1; i <= m; i++)
        {
            int p = 1;
            for(int j = 1;j <= n;j++)
            {
                p = p * i;
            }
            s += p;
        }

        System.out.println(s);
    }

    static boolean isSubstringPresent(String substring, String string) {
        return string.contains(substring);
    }
}

