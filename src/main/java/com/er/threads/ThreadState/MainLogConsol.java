package com.er.threads.ThreadState;

public class MainLogConsol {
    //static volatile String changeStr = "\tString does'not changed";
    private static String strForChange = "\tThis is not changed String";
    public static synchronized void changeStr(String threadName) {
        //forChange = String.format("\tString changed by %s",Thread.currentThread().getName());
        strForChange = String.format("\tString changed by %s",threadName);

        System.out.println(strForChange);

    }

    public static void main(String[] args) {
        CommonTread checking = new CommonTread("Checking");
        CommonTread first = new CommonTread("Fiirrsst");
        CommonTread second = new CommonTread("Secconnd");
        DeamonThread daemon = new DeamonThread("Deammonn", checking);
        daemon.start();

        try{
            System.out.println(strForChange + "  ++from main");
            first.start();
            second.start();
            checking.start();
            //Thread.yield();
            checking.join();
            System.out.println(strForChange + "  ++from main");
        }
        catch (InterruptedException ex){
            System.out.println("interrupted in main");
        }
    }

}
