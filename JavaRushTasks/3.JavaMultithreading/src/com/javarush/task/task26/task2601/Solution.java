package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Comparator;

/*
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {
    }

    public static Integer[] sort(Integer[] array) {
        //implement logic here
        int mediana = 0;
        Arrays.sort(array);
        if (array.length % 2 == 0)
            mediana = (array[array.length / 2] + array[array.length / 2 - 1]) / 2;
        else
            mediana = array[array.length / 2];


        int finalMediana = mediana;
        Comparator<Integer> comparatorMed = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1- finalMediana) - Math.abs(o2 - finalMediana) ;
            }
        };

        Arrays.sort(array, comparatorMed);


        return array;
    }
}
