package com.javarush.task.task22.task2211;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        byte[] buffer = new byte[1000];
        while (inputStream.available() > 0){
            inputStream.read(buffer);
        }

        inputStream.close();
        String strWin1251 = new String(buffer, "Windows-1251");
        buffer = strWin1251.getBytes("UTF-8");
        FileOutputStream outputStream = new FileOutputStream(args[1]);
        outputStream.write(buffer);


    }
}
