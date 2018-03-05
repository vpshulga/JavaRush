package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        double result = 0;
        boolean isEnd = false;

        int count = 0;
        while (!isEnd)
        {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            double a = Double.parseDouble(reader.readLine());


            if (a != -1)
            {
                count++;
                result += a;
            }
            if (a == -1) {
                isEnd = true;
            }


        }
        result = result / count;

        System.out.println(result);
    }
}

