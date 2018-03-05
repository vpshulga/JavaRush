package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        reader.close();

        FileInputStream stream1 = new FileInputStream(fileName2);
        FileInputStream stream2 = new FileInputStream(fileName3);
        FileOutputStream outputStream = new FileOutputStream(fileName1);

        while (stream1.available()>0){
            int data = stream1.read();
            outputStream.write(data);
        }
        stream1.close();

        while (stream2.available()>0){
            int data = stream2.read();
            outputStream.write(data);
        }
        stream2.close();
        outputStream.close();

    }
}
