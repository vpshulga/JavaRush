package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    //напишите тут ваш код

    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertToSeconds(5));
        System.out.println(convertToSeconds(10));
    }

    public static int convertToSeconds(int hours)
    {
        int seconds = hours * 60 * 60;
        return seconds;
    }
}
