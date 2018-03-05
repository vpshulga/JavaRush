package com.javarush.task.task21.task2106;

import java.util.Date;

/* 
Ошибка в equals/hashCode
*/
public class Solution {
    private int anInt;
    private String string;
    private double aDouble;
    private Date date;
    private Solution solution;

    public Solution(int anInt, String string, double aDouble, Date date, Solution solution) {
        this.anInt = anInt;
        this.string = string;
        this.aDouble = aDouble;
        this.date = date;
        this.solution = solution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Solution)) return false;

        Solution solution1 = (Solution) o;

        return anInt == solution1.anInt && aDouble == solution1.aDouble
                &&(string == solution1.string ||(string != null &&(string.equals(solution1.string))))
                && (date == solution1.date || (date != null && date.equals(solution1.date)))
                && (solution == solution1.solution || (solution != null && solution.equals(solution1.solution)));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + anInt;
        result = 37 * result + (string == null ? 0 : string.hashCode());
        result = 37 * result + (date == null ? 0 : date.hashCode());
        long longBits = Double.doubleToLongBits(aDouble);
        result = 37 * result + (int)(longBits - (longBits >>> 32));
        result = 37 * result + (solution == null ? 0 : solution.hashCode());
        return result;
    }

    public static void main(String[] args) {

    }
}
