package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        switch (args[0]){
            case "-u":
                update(fileName, args[1], args[2], args[3], args[4]);
                break;
            case "-d":
                delete(fileName, args[1]);
                break;
        }
    }

    static void update(String fileName, String id, String name, String price, String quantity) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null){
            list.add(line);
        }

        reader.close();

        stringBuilder.append(id);
        while (stringBuilder.toString().length() < 8)
            stringBuilder.append(" ");

        stringBuilder.append(name);

        if (stringBuilder.toString().length() > 38){
            stringBuilder.delete(38, stringBuilder.toString().length());
        }
        else if (stringBuilder.toString().length() < 38) {
            while (stringBuilder.toString().length() < 38)
                stringBuilder.append(" ");
        }

        stringBuilder.append(price);

        if (stringBuilder.toString().length() > 46){
            stringBuilder.delete(46, stringBuilder.toString().length());
        }
        else if (stringBuilder.toString().length() < 46) {
            while (stringBuilder.toString().length() < 46)
                stringBuilder.append(" ");
        }

        stringBuilder.append(quantity);

        if (stringBuilder.toString().length() > 50){
            stringBuilder.delete(38, stringBuilder.toString().length());
        }
        else if (stringBuilder.toString().length() < 50) {
            while (stringBuilder.toString().length() < 50)
                stringBuilder.append(" ");
        }

        stringBuilder.append("\r\n");

        for (String s : list) {
            String idStr;
            idStr = s.substring(0, 8).trim();
            if (idStr.equals(id)){
                list1.add(stringBuilder.toString());
            }
            else
                list1.add(s + "\r\n");
        }

        FileOutputStream outputStream = new FileOutputStream(fileName);

        for (String s : list1) {
            byte[] buffer = s.getBytes();
            outputStream.write(buffer, 0 , buffer.length);
        }

        outputStream.close();
    }

    static void delete(String fileName, String id) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(new  FileInputStream(fileName)));
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null){
            list.add(line);
        }
        reader.close();

        for (String s : list) {
            String idStr;
            idStr = s.substring(0, 8).trim();
            if (!idStr.equals(id))
                list1.add(s + "\r\n");
        }

        FileOutputStream outputStream = new FileOutputStream(fileName);

        for (String s : list1) {
            byte[] buffer = s.getBytes();
            outputStream.write(buffer, 0, buffer.length);
        }
        outputStream.close();
    }
}
