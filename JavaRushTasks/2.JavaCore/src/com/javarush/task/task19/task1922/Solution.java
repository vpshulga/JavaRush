package com.javarush.task.task19.task1922;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();

        ArrayList<String> list = new ArrayList<>();


        String str;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(name));
        while (bufferedReader.ready()){
            str = bufferedReader.readLine();

            list.add(str);
        }


        for (String s : list) {
            String[] splitArr = s.split(" ");
            int count = 0;
            for (String s1 : splitArr) {
                if (words.contains(s1))
                    count++;


            }
            if (count == 2)
                System.out.println(s);
        }

        bufferedReader.close();
    }
}
