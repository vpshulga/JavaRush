package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sum = 0;
        String sNumber = Integer.toString(number);
        for (int i = 0; i < sNumber.length() ; i++) {
            sum += Character.getNumericValue(sNumber.charAt(i));
        }

        return sum;
    }
}