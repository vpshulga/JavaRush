package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        int min = strings.get(0).length();
        int max = strings.get(0).length();
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() < min ) {
                min = strings.get(i).length();
                indexMin = i;
            }

        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > max ) {
                max = strings.get(i).length();
                indexMax = i;
            }

        }



        if (indexMin <= indexMax)
            System.out.println(strings.get(indexMin));
        else
            System.out.println(strings.get(indexMax));









    }
}
