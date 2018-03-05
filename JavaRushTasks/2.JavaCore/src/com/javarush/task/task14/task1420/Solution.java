package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        System.out.println(nod(a, b));
    }

    static int nod(int a, int b){
        int nod = 0;
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                listA.add(i);
        }

        for (int i = 1; i <= b; i++) {
            if (b % i == 0)
                listB.add(i);
        }

        ArrayList<Integer> listNod = new ArrayList<>();

        for (int i = 0; i < listA.size(); i++) {
            for (int j = 0; j < listB.size(); j++) {
                if (listA.get(i) == listB.get(j)){
                    listNod.add(listA.get(i));
                }
            }
        }
        nod = listNod.get(listNod.size() -1);



        return nod;
    }
}
