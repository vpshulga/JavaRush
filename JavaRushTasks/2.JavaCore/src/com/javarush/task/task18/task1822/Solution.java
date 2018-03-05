package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();

        FileInputStream stream = new FileInputStream(name);
        byte[] buffer = new byte[stream.available()];

        stream.read(buffer);

        stream.close();

        String s = new String(buffer);
        String[] strings = s.split("\n");

        for (String string : strings) {
            if (string.startsWith(args[0] + " "))
                System.out.println(string);
        }
    }
}
