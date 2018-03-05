package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        System.setOut(consoleStream);

        String str = outputStream.toString().replaceAll("[^0-9 +\\-*]", "");
        String[] strings = str.split(" ");
        int result = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[1].equals("+"))
                result = Integer.parseInt(strings[0]) + Integer.parseInt(strings[2]);
            else if (strings[1].equals("-"))
                result = Integer.parseInt(strings[0]) - Integer.parseInt(strings[2]);
            else if (strings[1].equals("*"))
                result = Integer.parseInt(strings[0]) * Integer.parseInt(strings[2]);
        }

        System.out.println(strings[0] + " " + strings[1] + " " + strings[2] + " " + "= " + result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

