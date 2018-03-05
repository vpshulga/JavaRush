package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        String fileName = args[0];


        FileInputStream inputStream = new FileInputStream(fileName);

        byte[] buffer = new byte[inputStream.available()];

        while (inputStream.available() > 0){
            inputStream.read(buffer);
        }

        inputStream.close();



        ArrayList<Character> list = new ArrayList<>();

        for (byte b : buffer) {
            list.add((char) b);
        }

        Map<Character, Integer> map = new TreeMap<>();

        for (Character character : list) {
            map.put(character, Collections.frequency(list, character));
        }

        for (Map.Entry entry : map.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());



    }
}
