package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null || string.isEmpty())
            throw new TooShortStringException();

        int countTab = 0;
        for (int i = 0; i < string.length(); i++) {
            char sym = string.charAt(i);
            if (sym == '\t')
                countTab++;
        }
        if (countTab < 2)
            throw new TooShortStringException();
        String[] strings = string.split("\t");


        return strings[1];
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
