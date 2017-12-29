package com.er.threads;

public class Test extends Thread {//extends от Thread, который implements Runnable, и override метод run.

    public void run() {
        String wait = "";
        try {
            System.out.println("Started and Sleeped");
            Thread.sleep(1111);
            System.out.println(this.getName() + getState() + " from current");
        } catch (InterruptedException ex) {
        }
        System.out.println(" finished");
    }

    public static void main(String[] args) {
        Thread firsttt = new Thread();
        Thread seccond = new Thread();
        Test counter = new Test();
        firsttt.start();
        seccond.start();
        System.out.println("counter is " + counter.getState());
        counter.start();
        System.out.println("counter is " + counter.getState());


    }
}
