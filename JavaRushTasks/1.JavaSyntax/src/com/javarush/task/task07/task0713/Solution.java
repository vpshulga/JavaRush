package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> data = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            data.add(Integer.parseInt(reader.readLine()));
        }

        for (Integer x : data)
        {
            if (x % 3 == 0 && x % 2 == 0)
            {
                list1.add(x);
                list2.add(x);
            }

            else if (x % 3 == 0)
                list1.add(x);
            else if (x % 2 == 0)
                list2.add(x);
            else
                list3.add(x);
        }

        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(List<Integer> list) {
        for (Integer x : list) {
            System.out.println(x);
        }
    }
}
