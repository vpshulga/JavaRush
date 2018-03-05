package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        ArrayList<String> names = new ArrayList<>();
        FileInputStream in;
        while (!(fileName = reader.readLine()).equals("end")) {
            names.add(fileName);
        }
        Collections.sort(names);

        String fileResult = names.get(0).replaceAll(".part1", "");
        System.out.println(fileResult);


        File resFile = new File(fileResult);
        resFile.createNewFile();

        FileOutputStream outputStream = new FileOutputStream(fileResult, true);


        byte[] buffer;
        for (String name : names) {
            in = new FileInputStream(name);
            buffer = new byte[in.available()];
            while (in.available() > 0) {
                in.read(buffer);
                outputStream.write(buffer);
            }
            in.close();
        }
        outputStream.close();
    }

}
