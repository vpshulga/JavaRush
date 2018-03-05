package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat oldFormat = new SimpleDateFormat("d/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat newFormat = new SimpleDateFormat("d-MMM-yyyy", Locale.ENGLISH);
        Date oldDate;
        Date newDate;
        String newDateString;

        if (args[0].equals("-c")){
            oldDate = oldFormat.parse(args[3]);
            newDateString = newFormat.format(oldDate);
            newDate = newFormat.parse(newDateString);
            if(args[2].equals("м")){
                allPeople.add(Person.createMale(args[1], newDate));
                System.out.println((allPeople.size()-1));
            }
            else if (args[2].equals("ж")){
                allPeople.add(Person.createFemale(args[1], newDate));
                System.out.println((allPeople.size()-1));
            }

        }

        else if (args[0].equals("-u")){
            int id = Integer.parseInt(args[1]);
            allPeople.get(id).setName(args[2]);
            if(args[3].equals("м")) {
                allPeople.get(id).setSex(Sex.MALE);
            }
            else if (args[3].equals("ж")){
                allPeople.get(id).setSex(Sex.FEMALE);
            }
            oldDate = oldFormat.parse(args[4]);
            newDateString = newFormat.format(oldDate);
            newDate = newFormat.parse(newDateString);
            allPeople.get(id).setBirthDay(newDate);
        }

        else if (args[0].equals("-d")){
            int id = Integer.parseInt(args[1]);
            allPeople.get(id).setName(null);
            allPeople.get(id).setSex(null);
            allPeople.get(id).setBirthDay(null);
        }

        else if (args[0].equals("-i")){
            int id = Integer.parseInt(args[1]);

            String sex;
            Sex s = allPeople.get(id).getSex();
            if (s == Sex.MALE)
                sex = "м";
            else
                sex = "ж";

            Date d = allPeople.get(id).getBirthDay();
            SimpleDateFormat newFormat1 = new SimpleDateFormat("d-MMM-yyyy", Locale.ENGLISH);
            String result = newFormat1.format(d);


            System.out.print(allPeople.get(id).getName() + " " + sex + " " + result);
        }

    }
}
