package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {

        if ((this.weight + this.strength + this.age) > (anotherCat.age + anotherCat.strength + anotherCat.weight))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

    }
}
