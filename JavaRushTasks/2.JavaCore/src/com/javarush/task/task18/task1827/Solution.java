package com.javarush.task.task18.task1827;

/* 
Прайсы
*/


import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String line;
        ArrayList<String> lists = new ArrayList<>();
        while ((line = fileReader.readLine()) != null){
            lists.add(line);
        }
        fileReader.close();

        if (args[0].equals("-c")){

            long maxID = Long.MIN_VALUE;

            for (String s: lists){
                int idName = Integer.parseInt(s.substring(0,8).trim());
                if (idName > maxID) maxID = idName;
            }
            String id = String.valueOf(++maxID).concat("        ").substring(0,8);
            String prodactName = "";
            for (int j = 1; j < args.length - 2; j++){
                prodactName = prodactName.concat(args[j]);
            }
            prodactName = prodactName.concat("                              ").substring(0,30);
            String price = args[args.length - 2].concat("        ").substring(0,8);
            String quantity = args[args.length - 1].concat("    ").substring(0,4);
            String result = id.concat(prodactName.concat(price.concat(quantity)));
            lists.add(result);


            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName));
            for (String s: lists){
                fileWriter.write(s);
                fileWriter.newLine();
            }
            fileWriter.close();
        }
    }
}


//import java.io.*;
//import java.util.ArrayList;
//import java.util.Collections;
//
//
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName = reader.readLine();
//        reader.close();
//
//        if (args[0].equals("-c")) {
//            addText(fileName, args[1], args[2], args[3]);
//        }
//    }
//
//    static void addText(String fileName, String name, String price, String quantity) throws IOException {
//        int maxId = 1;
//
//        ArrayList<String> list = new ArrayList<>();
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
//        String line;
//        while ((line = reader.readLine()) != null){
//            list.add(line);
//        }
//        reader.close();
//
//        for (String s : list) {
//            s = s.substring(0, 8).trim();
//            int tmp = Integer.parseInt(s);
//            if (tmp == maxId)
//                maxId ++;
//        }
//
//        FileOutputStream outputStream = new FileOutputStream(fileName, true);
//        StringBuilder stringBuilder = new StringBuilder();
//
//        stringBuilder.append(String.valueOf(maxId));
//        while (stringBuilder.toString().length() < 8)
//            stringBuilder.append(" ");
//
//        stringBuilder.append(name);
//
//        if (stringBuilder.toString().length() > 38){
//            stringBuilder.delete(38, stringBuilder.toString().length());
//        }
//        else if (stringBuilder.toString().length() < 38) {
//            while (stringBuilder.toString().length() < 38)
//                stringBuilder.append(" ");
//        }
//
//        stringBuilder.append(price);
//
//        if (stringBuilder.toString().length() > 46){
//            stringBuilder.delete(46, stringBuilder.toString().length());
//        }
//        else if (stringBuilder.toString().length() < 46) {
//            while (stringBuilder.toString().length() < 46)
//                stringBuilder.append(" ");
//        }
//
//        stringBuilder.append(quantity);
//
//        if (stringBuilder.toString().length() > 50){
//            stringBuilder.delete(38, stringBuilder.toString().length());
//        }
//        else if (stringBuilder.toString().length() < 50) {
//            while (stringBuilder.toString().length() < 50)
//                stringBuilder.append(" ");
//        }
//
//        stringBuilder.append("\r\n");
//
//
//        byte[] buffer = stringBuilder.toString().getBytes();
//        outputStream.write(buffer, 0 , buffer.length);
//
//
//        outputStream.close();
//
//    }
//}
