package com.er.tasks;

import java.util.Scanner;
public class PhoneCalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = scanner.nextInt();
        int calls[] = new int[countPeople];
        for (int i = 0; i < countPeople; i++) {
            calls[i] = scanner.nextInt();
        }
        for (int i=0; i < countPeople; i++) {
            for (int j = i+1; j <countPeople; j++) {
                if (calls[i] == calls[j]) {
                    System.out.println(i+1 + " " + (j+1));
                }
            }
        }
    }
}
