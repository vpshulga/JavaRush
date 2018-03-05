package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder stringBuilder = new StringBuilder();

        while (fileReader.ready()){
            String str = fileReader.readLine();
            String[] strings = str.split(" ");
            for (String s : strings) {
                if (s.length() > 6) {
                    stringBuilder.append(s);
                    stringBuilder.append(",");
                }
            }
        }
        fileReader.close();

        stringBuilder.deleteCharAt(stringBuilder.length()-1);

        fileWriter.write(stringBuilder.toString());
        fileWriter.close();
    }
}
