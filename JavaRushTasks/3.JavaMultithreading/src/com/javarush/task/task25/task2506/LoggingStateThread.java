package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread{
    private Thread target;

    public LoggingStateThread(Thread target) {
        this.target = target;
    }

    @Override
    public void run() {
        State state = target.getState();
        System.out.println(state);
        while (state != State.TERMINATED) {
            if (state != target.getState()) {
                state = target.getState();
                System.out.println(state);
            }
        }
    }
}
