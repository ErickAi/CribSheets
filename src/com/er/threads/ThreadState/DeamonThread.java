package com.er.threads.ThreadState;

public class DeamonThread extends Thread {

    private Thread stBy = new Thread() { //объявление класса-наследника, объявление переменной, создание объекта класса-наследника
        public void run() {        //переопределение метода
            try {
                sleep(1111);
                //System.out.printf("------------DeamonThread   is %s %n",DeamonThread.this.getState());
                //sleep(1111);
            } catch (InterruptedException ignored) {}
        }
    };
    private Thread checking;
    private State checkngState;

    DeamonThread (String name, Thread checking){
        setPriority(MAX_PRIORITY);
        setName(name);
        this.checking = checking;
        checking.setPriority(MIN_PRIORITY);
        stBy.start();
        setDaemon(true);
    }

    @Override
    public void run() {
        System.out.printf("%s statred. %n",getName());
        while (true) {
            if (checking.getState() != checkngState) {
                checkngState = checking.getState();
                System.out.printf("------------CheckingThread is %s %n", checkngState);
            }
            if (stBy.getState()==State.TERMINATED)
                break;
        }
        System.out.printf("%s finished.%n",getName());
    }
}
