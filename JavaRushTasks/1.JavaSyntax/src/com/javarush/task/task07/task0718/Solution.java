package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        int start = strings.get(0).length();
        int index = 0;

        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).length() > start)
            {
                start = strings.get(i).length();
            }
            else {
                index = i;
                break;
            }
        }

        if (index > 0) {
            System.out.println(index);
        }
    }
}

