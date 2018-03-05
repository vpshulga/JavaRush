package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JULY 1 1980"));
        map.put("Stallone2", new Date("AUGUST 1 1980"));
        map.put("Stallone3", new Date("SEPTEMBER 1 1980"));
        map.put("Stallone4", new Date("NOVEMBER 1 1980"));
        map.put("Stallone5", new Date("DECEMBER 1 1980"));
        map.put("Stallone6", new Date("JANUARY 1 1980"));
        map.put("Stallone7", new Date("FEBRUARY 1 1980"));
        map.put("Stallone8", new Date("MARCH 1 1980"));
        map.put("Stallone9", new Date("APRIL 1 1980"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator<Date> it = map.values().iterator();
        while (it.hasNext()) {
            Date date = it.next();
            if (date.getMonth() >= 5 && date.getMonth() <= 7)
                it.remove();
        }

    }

    public static void main(String[] args) {

    }
}
