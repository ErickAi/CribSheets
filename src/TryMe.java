public class TryMe {

    static volatile int count = 0;

    class MyThread extends Thread{
        public MyThread() {
            start();
        }
        @Override
        public synchronized void start() {
            count++;
        }
    }

    public static void main(String[] args) {

        for (int i=0; i<1000; i++) {
            Thread stBy = new Thread(() -> {    //объявление класса, переменной, создание объекта
                count++;                        //переопределение метода
            });
            stBy.start();
        }
        System.out.println("волатильность переменной не гарантирует потокобезопасности при ее изменении. " +
                "\nиз 1000 итераций изменения переменной сработали только \n" + count);
    }
}
