package com.javarush.task.task23.task2312;

public class Room {
    private int width;
    private int height;
    private Snake snake;

    public static Room game;


    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
    }

    private Mouse mouse;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public static void main(String[] args) {
        game = new Room(400, 400, new Snake(0,0));
        game.getSnake().setDirection(SnakeDirection.DOWN);
    }

    void run(){

    }

    void print(){

    }
}
