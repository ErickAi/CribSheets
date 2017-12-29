package com.er.threads;

public class IsOneStackForAllThreads extends Thread {
    public static final String FIRST = "first";
    public static final String SECOND = "second";
    private static int summ = 0;
    private static int counter1 = 0;
    private static int counter2 = 0;
    private static boolean stop = false;
private int counter;
    public IsOneStackForAllThreads(String name) {
        super(name);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new IsOneStackForAllThreads(FIRST);
        Thread thread2 = new IsOneStackForAllThreads(SECOND);
        thread1.start();
//        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter1 +" "+ counter2);
    }
    @Override
    public synchronized void run() {
        System.out.println(this.getName() + " Started");
        Thread current = this;
        while(!stop) {
            if (stop) {
                this.interrupt();
                current = null;
                break;
            }
            cycle(this.getName());
            }
/*
        Thread currentThread = Thread.currentThread();
        while(thread == currentThread) {
            if (...) {
                thread = null;
                break;
            }
        }
*/
        System.out.println("interrupted " + stop);
    }

    private static void cycle(String threadName){
        try {
            if (stop) return;
            switch (threadName){
                case FIRST : counter1++;
                    break;
                case SECOND : counter2++;
                    break;
            }

            cycle(threadName);

        } catch (StackOverflowError e) {
            stop = true;
        }
    }

}
