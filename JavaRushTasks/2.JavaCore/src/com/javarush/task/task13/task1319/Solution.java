package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(name));

        while (true)
        {
            String str = reader.readLine();
            writer.write(str + "\r\n");
            writer.flush();
            if (str.equals("exit"))
                break;
        }

        writer.close();




    }
}
