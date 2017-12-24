package com.er;

public class IntAintB {
    private static void print(int i) {
        System.out.println(i);
    }
    private static void print(byte i) {
        System.out.println(i);
    }
    private static void print(long i) {
        System.out.println(i);
    }
    private static void print(boolean i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        int a = 1, b = 2; long x = 1, y = 2; byte q = 1, w = 2;
        //print(a=>>b);
        //print(a||b);
        //print(a=<b);
        //print(a<<<b);
//int
        print(a >>= b);
        print(a % b);
        print(a ^ b);
        print(a >>> b);
        print(a >> b);
        print(a | b);
//bolean
        print(a == b);
        print(a <= b);
        print(a != b);
    }
}
