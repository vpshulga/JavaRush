package com.javarush.task.task18.task1820;

/*
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        File file1 = new File(reader.readLine());
        File file2 = new File(reader.readLine());

        FileInputStream in = new FileInputStream(file1);
        FileOutputStream out = new FileOutputStream(file2);


        while(in.available() > 0){
            byte[] data = new byte[in.available()];
            in.read(data);
            out.write(getInput(data));
        }


        in.close();
        out.close();

    }

    private static byte[] getInput(byte[] data){

        StringBuilder builder = new StringBuilder();
        String[] s = new String(data).split(" ");
        byte[] res;
        long[] tmp = new long[s.length];

        for(int i = 0; i < s.length; i++){
            tmp[i] = Math.round(Double.valueOf(s[i]));
        }

        for(long i : tmp){
            builder.append(i);
            builder.append(" ");
        }

        res = builder.toString().getBytes();

        return res;
    }
}
