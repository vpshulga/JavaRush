package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/


import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        ArrayList<String> list = new ArrayList<>();
        Pattern p = Pattern.compile("\\d");
        Matcher m;
        String line;
        while ((line = fileReader.readLine()) != null){
            list.add(line);
        }
        fileReader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        for (String s : list) {
            String[] strings = s.split(" ");
            for (String string : strings) {
                m = p.matcher(string);
                if (m.find())
                    writer.write(string +" ");
            }
        }

        writer.close();
    }
}
