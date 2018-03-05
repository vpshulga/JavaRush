package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();

        while (reader.ready()){
            String[] strings = reader.readLine().split(" ");

            if (map.containsKey(strings[0])){
                double val = map.get(strings[0]);
                val += Double.parseDouble(strings[1]);
                map.put(strings[0], val);
            }
            else
                map.put(strings[0], Double.parseDouble(strings[1]));
        }

        System.out.println(map);

        for (Map.Entry entry : map.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());

        reader.close();






    }

}
