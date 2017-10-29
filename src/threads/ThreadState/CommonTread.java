package threads.ThreadState;

public class CommonTread extends Thread{

    CommonTread(String name){
        super(name);
        //setName(name);
    }

    public void run() {
        try {
            System.out.printf("%s statred. %n",getName());
            Thread.sleep(1);
            //System.out.println(MainLogConsol.changeStr = "\tString changed by First");
            MainLogConsol.changeStr(getName());
        } catch (InterruptedException ex) {
            System.out.printf("%s interrupted.%n",getName());
        }
        System.out.printf("%s finished%n",getName());
    }
}
