package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();
        double max = 0;

        while (reader.ready()){
            String[] strings = reader.readLine().split(" ");
            if (map.containsKey(strings[0])){
                double val = map.get(strings[0]);
                map.put(strings[0], val + Double.parseDouble(strings[1]));
            }
            else
                map.put(strings[0], Double.parseDouble(strings[1]));
        }
        reader.close();

        for (Double d : map.values()){
            if (d > max)
                max = d;
        }

        for (Map.Entry entry: map.entrySet()){
            if (entry.getValue().equals(max)){
                System.out.println(entry.getKey());
            }

        }
    }
}
