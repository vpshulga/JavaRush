package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileInputStream stream = new FileInputStream(fileName);
        Set<Integer> set = new TreeSet<>();
        while (stream.available() > 0){
            set.add(stream.read());
        }
        stream.close();
        for (int s : set)
            System.out.print(s + " ");
    }
}
