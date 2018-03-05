package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg[] zergs = new Zerg[10];
        for (int i = 0; i < zergs.length; i++)
        {
            zergs[i] = new Zerg();
            zergs[i].name = ("zerg " + (i+1));
        }

        Protoss[] protosi = new Protoss[5];
        for (int i = 0; i < protosi.length; i++)
        {
            protosi[i] = new Protoss();
            protosi[i].name = ("protoss " + (i+1));
        }

        Terran[] terrani = new Terran[12];
        for (int i = 0; i < terrani.length; i++)
        {
            terrani[i] = new Terran();
            terrani[i].name = ("terran " + (i+1));
        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
