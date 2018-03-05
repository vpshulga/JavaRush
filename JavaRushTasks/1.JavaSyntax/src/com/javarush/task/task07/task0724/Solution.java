package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grf1 = new Human("ded valera", true, 60);
        Human grf2 = new Human("ded valerik", true, 65);
        Human grm1 = new Human("baba luba", false, 65);
        Human grm2 = new Human("baba nina", false, 65);

        Human f1 = new Human("papa vlad", true, 35, grf1, grm1);
        Human m1 = new Human("mama galia", false, 45, grf2, grm2);

        Human c1 = new Human("tolik", true, 5, f1, m1);
        Human c2 = new Human("genka", true, 15, f1, m1);
        Human c3 = new Human("serezha", true, 25, f1, m1);

        System.out.println(grf1);
        System.out.println(grf2);
        System.out.println(grm1);
        System.out.println(grm2);
        System.out.println(f1);
        System.out.println(m1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);


    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















