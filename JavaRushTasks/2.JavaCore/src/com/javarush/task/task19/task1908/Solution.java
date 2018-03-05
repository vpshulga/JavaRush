package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOneName = reader.readLine();
        String fileTwoName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileOneName));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileTwoName));



        StringBuilder stringBuilder = new StringBuilder();

        while (fileReader.ready()){
            stringBuilder.append((char) fileReader.read());
        }

        String res = stringBuilder.toString();

        for (String str : res.split("\\s")){
            Pattern p = Pattern.compile("^[0-9]+$");
            Matcher m = p.matcher(str);

            if (m.find()){
                fileWriter.write(str);
                fileWriter.write(" ");
            }
        }
        fileReader.close();
        fileWriter.close();

    }
}
