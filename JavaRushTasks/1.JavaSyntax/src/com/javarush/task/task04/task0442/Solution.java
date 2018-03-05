package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isEnd = false;
        int result = 0;

        while (!isEnd)
        {

            int a = Integer.parseInt(reader.readLine());
            result += a;
            if (a == -1)
                isEnd = true;
        }
        System.out.println(result);
    }
}
