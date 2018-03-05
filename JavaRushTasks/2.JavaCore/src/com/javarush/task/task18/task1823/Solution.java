package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> names = new ArrayList<>();
        String fileName;
        while(!(fileName = reader.readLine()).equals("exit")){
            names.add(fileName);
        }

        for(String s : names){
            new ReadThread(s).start();
        }

        reader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;
        private FileInputStream stream;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }

        @Override
        public void run() {
            synchronized (resultMap) {
                try {
                    resultMap.put(fileName, findMaxByte(fileName));
                } catch (IOException e) {
                    e.printStackTrace();

                }
            }
        }

        Integer findMaxByte(String fileName) throws IOException {
            stream = new FileInputStream(fileName);
            ArrayList<Integer> list = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            Integer result = 0;

            while (stream.available() > 0){
                int data = stream.read();
                list.add(data);
            }
            stream.close();

            for (Integer integer : list) {
                map.put(integer, Collections.frequency(list, integer));
            }


            Integer max = 0;

            for (Integer val : map.values()){
                if (val > max)
                    max = val;
            }

            for (Map.Entry entry : map.entrySet()){
                if (entry.getValue().equals(max))
                    result = (Integer) entry.getKey();
            }

            return result;
        }
    }
}
