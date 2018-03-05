package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    boolean discrepancy = false;
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();
    public static String fileName1;
    public static String fileName2;

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
            reader.close();
            BufferedReader reader1 = new BufferedReader(new FileReader(new File(fileName1)));
            String strAdd;
            while ((strAdd = reader1.readLine()) != null){
                allLines.add(strAdd);
            }
            reader1.close();

            BufferedReader reader2 = new BufferedReader(new FileReader(new File(fileName2)));
            String strRem;
            while ((strRem = reader2.readLine()) != null){
                forRemoveLines.add(strRem);
            }
            reader2.close();

            System.out.println(allLines);
            System.out.println(forRemoveLines);

            new Solution().joinData();
            System.out.println(allLines);
            System.out.println(forRemoveLines);
            System.out.println(allLines.size());
            System.out.println(forRemoveLines.size());

        }
        catch (IOException e){

        }

    }

    public void joinData() throws CorruptedDataException {
        for (String string : forRemoveLines){
            if (discrepancy) break;
            if (allLines.contains(string));
            else {
                discrepancy = true;
                break;
            }
        }
        if (!discrepancy){
            allLines.removeAll(forRemoveLines);
        }else{
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
