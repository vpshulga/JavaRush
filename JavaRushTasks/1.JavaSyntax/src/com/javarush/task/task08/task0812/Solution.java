package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));

        }

        int count = 1;
        int countMax = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i-1) == list.get(i))
                count++;
            else
                count = 1;

            if (count > countMax) {
                countMax = count;
            }

        }
        System.out.println(countMax);

    }
}