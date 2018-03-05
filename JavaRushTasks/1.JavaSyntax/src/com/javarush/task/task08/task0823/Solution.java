package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            c[0]  = Character.toUpperCase(c[0]);
            if (c[i] == 32)
                c[i + 1] = Character.toUpperCase(c[i + 1]);
        }
        String s1 = new String(c);
        System.out.println(s1);

        //напишите тут ваш код
    }
}
