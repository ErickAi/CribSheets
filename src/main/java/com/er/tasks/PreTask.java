package com.er.tasks;

import java.util.Scanner;

public class PreTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int summ = 0;
        for (int i = 0; i < count; i++) {
            summ += scanner.nextInt();
        }
        System.out.println(summ);
    }
}
