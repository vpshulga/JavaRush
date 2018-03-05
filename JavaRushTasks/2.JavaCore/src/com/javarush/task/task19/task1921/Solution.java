package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        String str;

        while (reader.ready()){
            str = reader.readLine();
            String name = str.replaceAll("\\d", "").trim();
            String bday = str.replaceAll("[^0-9 ]", "").trim();
            System.out.println(name);
            System.out.println(bday);

            SimpleDateFormat dateFormat = new SimpleDateFormat("d M y");
            Date date = dateFormat.parse(bday);
            PEOPLE.add(new Person(name, date));
        }
        reader.close();

        for (Person person : PEOPLE) {
            System.out.println(person.getBirthday());
        }
    }
}
