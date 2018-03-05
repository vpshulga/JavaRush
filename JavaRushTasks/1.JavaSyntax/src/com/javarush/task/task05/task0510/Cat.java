package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name = null;
    private int age;
    private int weight;
    private String address = null;
    private String color;

    public void initialize(String name)
    {
        this.name = name;
        this.age = 10;
        this.weight = 5;
        this.color = "green";


    }

    public void initialize(String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "black";
    }

    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.color = "yellow";
    }

    public void initialize(int weight, String color)
    {
        this.weight = weight;
        this.age = 10;
        this.color = color;
    }

    public void initialize(int weight, String color, String address)
    {
        this.weight = weight;
        this.color = color;
        this.age = 10;
        this.address = address;
    }


    public static void main(String[] args) {

    }
}
