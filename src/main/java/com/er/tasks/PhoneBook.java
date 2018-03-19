package com.er.tasks;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, TreeSet<String>> phoneBook = new TreeMap<>();
        while (scanner.hasNext()) {
            String name = scanner.nextLine();
            String number = scanner.nextLine().replaceAll("\\D*", "");
            TreeSet <String> numbers = phoneBook.get(name);
            if (number.length() == 11 && number.startsWith("7")) {
                numbers.add("+" + number);
                phoneBook.put(name, numbers);
            }
            else if (number.length() == 11 && number.startsWith("8")) {
                numbers.add(number.replaceFirst("8", "+7"));
                phoneBook.put(name, numbers);
            }
            else if (number.length() == 7) {
                numbers.add("+7495" + number);
                phoneBook.put(name, numbers);
            }
        }
        for (Map.Entry entry : phoneBook.entrySet()){
            System.out.println(entry.getKey() + "\n" + entry.getValue());
        }
    }
}
