package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream stream = new FileInputStream(args[0]);

        int count = 0;
        while (stream.available() > 0){
            int data = stream.read();
            if ((data > 64 && data < 91) || (data > 96 && data < 123))
                count++;
        }

        stream.close();
        System.out.println(count);
    }
}
