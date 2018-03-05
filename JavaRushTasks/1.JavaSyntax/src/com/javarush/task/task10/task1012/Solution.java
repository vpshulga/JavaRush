package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        int[] counts = new int[abcArray.length];
        for (int i = 0; i < list.size(); i++) {
            char[] chars = list.get(i).toCharArray();
            for (int j = 0; j < chars.length; j++) {
                for (int k = 0; k < abcArray.length; k++) {
                    if (chars[j] == abcArray[k])
                        counts[k]++;
                }
            }
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.println(abcArray[i] + " " + counts[i]);
        }






    }

}
