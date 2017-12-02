public class TryMe {


    public static void show(){

        System.out.println("Static method called");
    }

    public static void main(String[] args)  {
        Integer i1 = 129;
        Integer i2 = 129;
        System.out.println(i1 == i2);

        Integer i3 = 127;
        Integer i4 = 127;
        System.out.println(i3 == i4);
    }
}