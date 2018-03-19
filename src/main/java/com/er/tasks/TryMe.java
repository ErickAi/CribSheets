package com.er.tasks;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TryMe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine().replaceAll("\\D*", "");
        System.out.println(number);
    }
}
