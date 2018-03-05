package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<Integer> indexListInt = new ArrayList<>();
        ArrayList<Integer> indexListString = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
                if (isNumber(array[i]))
                {
                    indexListInt.add(i);
                }
                else
                    indexListString.add(i);
        }

        for (int i = indexListInt.size() - 2; i >=0 ; i--)
        {
            for (int j = 0; j <= i; j++) {
                if (Integer.parseInt(array[indexListInt.get(j + 1)]) > Integer.parseInt(array[indexListInt.get(j)])) {
                    String tmp = array[indexListInt.get(j)];
                    array[indexListInt.get(j)] = array[indexListInt.get(j + 1)];
                    array[indexListInt.get(j + 1)] = tmp;
                }
            }
        }




        for (int i = indexListString.size() - 2; i >=0 ; i--) {
            for (int j = 0; j <= i; j++) {
                if (isGreaterThan(array[indexListString.get(j)], array[indexListString.get(j + 1)])) {
                    String tmp = array[indexListString.get(j)];
                    array[indexListString.get(j)] = array[indexListString.get(j + 1)];
                    array[indexListString.get(j + 1)] = tmp;
                }
            }
        }



    }



    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
