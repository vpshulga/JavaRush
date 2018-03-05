package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if (string == null || string.isEmpty())
            throw new TooShortStringException();

        int spaceCount = 0;
        for (int i = 0; i < string.length(); i++) {
            char sym = string.charAt(i);
            if (sym == ' ')
                spaceCount++;
        }
        if (spaceCount < 4)
            throw new TooShortStringException();

        String[] strings = string.split(" ");
        String res = "";
        for (int i = 1; i < 5; i++) {
            res += (strings[i] + " ");
        }

        return res.trim();
    }

    public static class TooShortStringException extends RuntimeException{

    }
}
