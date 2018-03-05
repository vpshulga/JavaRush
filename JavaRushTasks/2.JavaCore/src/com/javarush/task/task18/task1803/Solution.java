package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        FileInputStream stream = new FileInputStream(fileName);
        while (stream.available() > 0){
            int data = stream.read();
            list.add(data);
        }
        stream.close();

        for (Integer i : list){
            map.put(i, Collections.frequency(list, i));
        }

        int max = 0;
        for (Integer value : map.values()){
            if (value > max)
                max = value;
        }

        for (Map.Entry entry : map.entrySet()){
            if (entry.getValue().equals(max))
                System.out.print(entry.getKey() + " ");
        }


    }
}
