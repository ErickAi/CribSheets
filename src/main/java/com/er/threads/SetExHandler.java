package com.er.threads;

public class SetExHandler extends Thread {
    /*
        private class MyUncaughtExceptionHandler implements UncaughtExceptionHandler{
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                if (e instanceof Error){
                    System.out.println("Нельзя дальше работать");
                    return;
                }
                if (e instanceof Exception) {
                    System.out.println("Надо обработать");
                }
                else {
                    System.out.println("ХЗ");
                }
            }
        }
    */
    public SetExHandler() {
        super();
        //setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        this.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {

            @Override
            public void uncaughtException(Thread t, Throwable e) {
                if (e instanceof Error){
                    System.out.println("Нельзя дальше работать");
                    return;
                }
                if (e instanceof Exception) {
                    System.out.println("Надо обработать");
                }
                else {
                    System.out.println("ХЗ");
                }
            }});}

    @Override
    public void run() {
        throw new Error();
    }

    public static void main(String[] args) {
        SetExHandler thread = new SetExHandler();
        thread.start();
    }
}