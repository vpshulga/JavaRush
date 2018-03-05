package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (ArithmeticException e) {
            exceptions.add(e);
        }
        exceptions.add(new ArrayStoreException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new ArrayStoreException());


        //напишите тут ваш код

    }
}
