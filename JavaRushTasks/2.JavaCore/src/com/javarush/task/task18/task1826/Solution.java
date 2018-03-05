package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args[0].equals("-e"))
            crypt(args[1], args[2],1);
        else if (args[0].equals("-d"))
            enCrypt(args[1], args[2],1);
    }

    static void crypt(String fileName, String fileOutputName, int key) throws IOException{
        FileInputStream inputStream = new FileInputStream(fileName);
        FileOutputStream outputStream = new FileOutputStream(fileOutputName);

        while (inputStream.available() > 0){
            int data = inputStream.read();
            int result = (data + key) % 256;
            outputStream.write(result);
        }
        inputStream.close();
        outputStream.close();
    }

    static void enCrypt(String fileName, String fileOutputName, int key) throws IOException{
        FileInputStream inputStream = new FileInputStream(fileName);
        FileOutputStream outputStream = new FileOutputStream(fileOutputName);

        while (inputStream.available() > 0){
            int data = inputStream.read();
            int result = (data - key + 256) % 256;
            outputStream.write(result);
        }
        inputStream.close();
        outputStream.close();
    }

}
