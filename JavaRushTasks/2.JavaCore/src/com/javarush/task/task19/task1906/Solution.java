package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    private static int counter = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOneName = reader.readLine();
        String fileTwoName = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(fileOneName);
        FileWriter fileWriter = new FileWriter(fileTwoName);

        while (fileReader.ready()){
            int data = fileReader.read();

            if (counter % 2 != 0){
                fileWriter.write(data);
            }
            counter++;

        }

        fileReader.close();
        fileWriter.close();
    }
}
