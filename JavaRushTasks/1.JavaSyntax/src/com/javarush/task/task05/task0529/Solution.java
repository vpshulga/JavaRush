package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        boolean isStop = false;

        while (!isStop)
        {
            String s = reader.readLine();
            if (!s.equals("сумма"))
            {
                int a = Integer.parseInt(s);
                result += a;
            }
            else
                isStop = true;
        }

        System.out.println(result);
    }
}
