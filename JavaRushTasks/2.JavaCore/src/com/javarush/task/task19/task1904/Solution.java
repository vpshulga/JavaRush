package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {
        String string = "Иванов Иван Иванович 31 12 1950";
        String[] strings = string.split(" ");
        SimpleDateFormat ft = new SimpleDateFormat("dd MM y");
        Date date = null;
        try {
            date = ft.parse(strings[3] + " " + strings[4] + " " + strings[5]);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(date);
    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {

            String str = this.fileScanner.nextLine();
            String[] strings = str.split(" ");
            SimpleDateFormat ft = new SimpleDateFormat("dd MM y");
            Date date = null;
            try {
                date = ft.parse(strings[3] + " " + strings[4] + " " + strings[5]);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            return new Person(strings[1], strings[2], strings[0], date);
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
