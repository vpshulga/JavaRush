package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 3 2000"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        Date yearStart = new Date();

        yearStart.setHours(0);
        yearStart.setMinutes(0);
        yearStart.setSeconds(0);
        yearStart.setDate(1);
        yearStart.setMonth(0);
        yearStart.setYear(date1.getYear());
        long msDifference = date1.getTime() - yearStart.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int dayCount = (int) (msDifference/msDay);

        if (dayCount % 2 != 0)
            return true;
        else
            return false;
    }
}
