package com.javarush.task.task21.task2101;

import java.util.Arrays;

/*
Определяем адрес сети
*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, (byte)1,(byte) 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254,(byte) 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000

        System.out.println(Arrays.toString(netAddress));
        System.out.println((byte)168);
        int a = 168;
        System.out.println(Integer.toBinaryString((byte)257));

    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] netAddress = new byte[4];
        for (int i = 0; i < netAddress.length; i++)
            netAddress[i] = (byte) ((ip[i] & mask[i]));
        return  netAddress;
    }

    public static void print(byte[] bytes) {
        String currentBinary;
        for (byte aByte : bytes) {
            currentBinary = Integer.toBinaryString(256 + (int) aByte);
//            System.out.println(currentBinary);
            System.out.print(currentBinary.substring(currentBinary.length() -8)+" ");
        }
        System.out.println();
    }
}
