package com.er.memory;

public class StackOverflow {
    private static int counter1 = 0;
    private static int counter9 = 0;

    public static void main(String[] args) {
//        int[] over = new int[Integer.MAX_VALUE];
        try {
            cycle1();
        } catch (StackOverflowError e) {
            System.out.println(counter1);
        }
        try {
            cycle9();
        } catch (StackOverflowError e) {
            System.out.println(counter9);
        }
    }

    private static void cycle1(){
        counter1++;
        cycle1();
    }
    private static void cycle9(){
        long l1 = 0; long l2 = 0; long l3 = 0;
        long l4 = 0; long l5 = 0; long l6 = 0;
        long l7 = 0; long l8 = 0; long l9 = 0;
        counter9++;
        cycle9();
    }
}
