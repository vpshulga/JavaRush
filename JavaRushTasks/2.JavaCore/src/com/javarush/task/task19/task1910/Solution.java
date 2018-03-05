package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNameOne = reader.readLine();
        String fileNameTwo = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileNameOne));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileNameTwo));

        ArrayList<String> list = new ArrayList<>();

        while (fileReader.ready()){
            list.add(fileReader.readLine());
        }

        for (String s : list) {
           s = s.replaceAll("\\p{Punct}", "");
            fileWriter.write(s);
        }

        fileReader.close();
        fileWriter.close();

    }
}
