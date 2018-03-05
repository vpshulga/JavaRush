package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileInputStream stream = new FileInputStream(fileName);
        ArrayList<Integer> list = new ArrayList<>();

        byte[] buffer = new byte[1000];

        while (stream.available()>0)
            list.add(stream.read());

        stream.close();
        int count = 0;

        for (int i : list){
            if (i == 44)
                count++;
        }
        System.out.println(count);
    }
}
