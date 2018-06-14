package com.javarush.task.task28.task2805;

public class MyThread extends Thread {
    private static int count;
    private int id = ++count;

    public void setCyclicPriority() {
        int priority = id % 10;
        if (priority == 0) priority = 10;
        int maxPriority = Thread.currentThread().getThreadGroup().getMaxPriority();
        if (priority > maxPriority) priority = maxPriority;
        this.setPriority(priority);
    }

    public MyThread() {
        this.setCyclicPriority();
    }

    public MyThread(Runnable target) {
        super(target);
        this.setCyclicPriority();
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        this.setCyclicPriority();
    }

    public MyThread(String name) {
        super(name);
        this.setCyclicPriority();
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        this.setCyclicPriority();
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        this.setCyclicPriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        this.setCyclicPriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        this.setCyclicPriority();
    }
}
