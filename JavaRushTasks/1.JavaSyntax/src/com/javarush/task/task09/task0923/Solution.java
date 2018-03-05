package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] chars = s.toCharArray();
        ArrayList<Character> newVowels = new ArrayList<>();
        ArrayList<Character> newNotVowels = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i]))
                newVowels.add(chars[i]);
            else if (chars[i] != 32)
                newNotVowels.add(chars[i]);
        }

        for (Character ch : newVowels)
            System.out.print(ch + " ");
        System.out.println("");
        for (Character ch : newNotVowels)
            System.out.print(ch + " ");
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}