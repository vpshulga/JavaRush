package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = s.substring(s.indexOf('?')+1);
        String[] strings = s1.split("&");
        for (String s2 : strings) {

            if (s2.contains("=")) {
                System.out.print(s2.substring(0, s2.indexOf('=')) + " ");
            } else
                System.out.print(s2 + " ");

        }
        System.out.print("\n");
        for (String s2 : strings){
            if (s2.contains("obj")){
                try {
                    String res = s2.substring(s2.indexOf('=') + 1);

                    alert(Double.parseDouble(res));
                }
                catch (NumberFormatException e)
                {
                    String res = s2.substring(s2.indexOf('=') + 1);
                    alert(res);
                }
            }
        }



    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
