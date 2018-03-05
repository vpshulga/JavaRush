package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        reader.close();

        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream1 = new FileOutputStream(fileName2);
        FileOutputStream outputStream2 = new FileOutputStream(fileName3);



        if (inputStream.available() > 0) {
            byte[] bytes = new byte[inputStream.available()];
            int count = inputStream.read(bytes);
            outputStream1.write(bytes, 0, count - count / 2);
            outputStream2.write(bytes, count - count / 2, count / 2);
        }
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
