package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {

        return horses;
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(new ArrayList<>());

        game.getHorses().add(new Horse("Valera", 3, 0));
        game.getHorses().add(new Horse("Vlad", 3, 0));
        game.getHorses().add(new Horse("Stas", 3, 0));

        game.run();
        game.printWinner();
    }

    void print(){
        for (Horse horse : this.getHorses()) {
            horse.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    void move(){
        for (Horse horse : this.getHorses()) {
            horse.move();
        }
    }

    void run() throws InterruptedException {
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public Horse getWinner(){
        Collections.sort(horses, new Comparator<Horse>() {
            @Override
            public int compare(Horse o1, Horse o2) {
                return Double.compare(o1.getDistance(), o2.getDistance());
            }
        });
        return horses.get(horses.size() - 1);
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
