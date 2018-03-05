package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileInputStream stream = new FileInputStream(fileName);
        ArrayList<Integer> bytes = new ArrayList<>();

        while (stream.available() > 0){
            int data = stream.read();
            bytes.add(data);
        }
        stream.close();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer i : bytes){
            map.put(i, Collections.frequency(bytes, i));
        }

        for (Map.Entry entry : map.entrySet()){
            if (entry.getValue().equals(Collections.min(map.values())))
                System.out.print(entry.getKey() + " ");
        }

    }
}
