package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException{
        FileInputStream stream = new FileInputStream(args[0]);
        int chars = stream.available();
        int space = 0;
        while (stream.available() > 0){
            int data = stream.read();
            if (data == 32)
                space++;
        }

        stream.close();

        double res = ((double) space / (double) chars) * 100;


        System.out.printf("%.2f",res);


    }
}
