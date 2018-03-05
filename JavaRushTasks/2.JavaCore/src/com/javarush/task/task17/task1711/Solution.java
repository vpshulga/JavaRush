package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d/MM/yyy", Locale.ENGLISH);

        switch (args[0]){
            case "-c":
            synchronized (allPeople){
                int x = 2;
                int y = 1;
                int z = 3;
                for (int i = 0; i < args.length / 3 ; i++) {

                    if (args[x].equals("м"))
                        allPeople.add(Person.createMale(args[y], simpleDateFormat.parse(args[z])));
                    else if (args[x].equals("ж"))
                        allPeople.add(Person.createFemale(args[y], simpleDateFormat.parse(args[z])));

                    System.out.println((allPeople.size() -1));

                    x += 3;
                    y += 3;
                    z += 3;

                }
            }
            break;

            case "-u":
                synchronized (allPeople){
                    int x = 1;
                    int y = 2;
                    int z = 3;
                    int d = 4;
                for (int i = 0; i < args.length / 4; i++) {


                    int id = Integer.parseInt(args[x]);

                    allPeople.get(id).setName(args[y]);
                    if (args[z].equals("м"))
                        allPeople.get(id).setSex(Sex.MALE);
                    else if (args[z].equals("ж"))
                        allPeople.get(id).setSex(Sex.FEMALE);
                    allPeople.get(id).setBirthDay(simpleDateFormat.parse(args[d]));

                    x += 4;
                    y += 4;
                    z += 4;
                    d += 4;
                }
            }
            break;

            case "-d":
                synchronized (allPeople){
                for (int i = 1; i < args.length; i++) {
                    int id = Integer.parseInt(args[i]);

                    allPeople.get(id).setName(null);
                    allPeople.get(id).setSex(null);
                    allPeople.get(id).setBirthDay(null);
                }
            }
            break;

            case "-i":
                synchronized (allPeople){
                for (int i = 1; i < args.length; i++) {
                    int id = Integer.parseInt(args[i]);
                    String sex;
                    if (allPeople.get(id).getSex() == Sex.MALE)
                        sex = "м";
                    else
                        sex = "ж";

                    SimpleDateFormat sdf = new SimpleDateFormat("d-MMM-yyyy", Locale.ENGLISH);
                    String result = sdf.format(allPeople.get(id).getBirthDay());

                    System.out.print(allPeople.get(id).getName() + " " + sex + " " + result + "\n");
                }
            }


        }
    }
}
