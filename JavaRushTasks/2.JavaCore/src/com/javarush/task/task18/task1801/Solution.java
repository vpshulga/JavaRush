package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        ArrayList<Integer> bytes = new ArrayList<>();
        while (fileInputStream.available() > 0){
            int data = fileInputStream.read();
            bytes.add(data);
        }
        fileInputStream.close();
        Collections.sort(bytes);
        System.out.println(bytes.get(bytes.size()-1));
    }
}
