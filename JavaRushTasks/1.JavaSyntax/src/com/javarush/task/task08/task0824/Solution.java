package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human("tolik", true, 10, new ArrayList<>());
        Human child2 = new Human("dasha", false, 12, new ArrayList<>());
        Human child3 = new Human("vlad", true, 13, new ArrayList<>());

        ArrayList<Human> list1 = new ArrayList<>();
        list1.add(child1);
        list1.add(child2);
        list1.add(child3);

        Human father = new Human("papa valera", true, 35,  list1);
        Human mother = new Human("mama nina", false, 35,  list1);

        ArrayList<Human> list2 = new ArrayList<>();
        list2.add(father);

        ArrayList<Human> list3 = new ArrayList<>();
        list3.add(mother);

        Human ded1 = new Human("ded petya", true, 60, list2);
        Human baba1 = new Human("baba tanya", false, 60, list2);
        Human ded2 = new Human("ded igor", true, 65, list3);
        Human baba2 = new Human("baba sveta", false, 65, list3);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(baba1);
        System.out.println(baba2);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;


        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;

        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
