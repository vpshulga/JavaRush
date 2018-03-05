package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private int height;
        private String colorHair;
        private int weight;
        private Human mother;

        public Human()
        {

        }

        public Human(int age, int height, Human mother) {
            this.age = age;
            this.height = height;
            this.mother = mother;
        }

        public Human(int age, Human mother) {

            this.age = age;
            this.mother = mother;
        }

        public Human(String name, Human mother) {

            this.name = name;
            this.mother = mother;
        }

        public Human(String name, int age, int height, String colorHair, int weight, Human mother) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.colorHair = colorHair;
            this.weight = weight;
            this.mother = mother;
        }

        public Human(String name, int age, int height, String colorHair, int weight) {

            this.name = name;
            this.age = age;
            this.height = height;
            this.colorHair = colorHair;
            this.weight = weight;
        }

        public Human(String name, int age, int height, String colorHair) {

            this.name = name;
            this.age = age;
            this.height = height;
            this.colorHair = colorHair;
        }

        public Human(String name, int age, int height) {

            this.name = name;
            this.age = age;
            this.height = height;
        }

        public Human(String name, int age) {

            this.name = name;
            this.age = age;
        }

        public Human(String name) {

            this.name = name;
        }
    }
}
