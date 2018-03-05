package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {

        for (String s : getTokens("level22.lesson13.task01", ".")) {
            System.out.println(s);
        }

    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer st = new StringTokenizer(query, delimiter);
        String[] res = new String[st.countTokens()];
        int i = 0;
        while (st.hasMoreTokens()){
            res[i] = st.nextToken();
            i++;
        }
        return res;
    }
}
