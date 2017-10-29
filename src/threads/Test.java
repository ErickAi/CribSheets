package threads;

public class Test extends Thread {//extends от Thread, который implements Runnable, и override метод run.

    public void run() {
        String wait = "";
        try {
            System.out.println("Started and Sleeped");
            Thread.sleep(1111);
            System.out.println(getState() + " from run");
        } catch (InterruptedException ex) {
        }
        System.out.println("I'm finished");
    }

    public static void main(String[] args) {
        Thread firsttt = new Thread();
        Thread seccond = new Thread();
        Test counter = new Test();
        firsttt.start();
        seccond.start();
        System.out.println(counter.getState());
        counter.start();
        System.out.println(counter.getState());


    }
}
