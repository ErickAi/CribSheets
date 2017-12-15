package com.er.core.date;


import java.time.LocalDate;
import java.time.Month;

public class LocalDateClass {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate myBirthDay = LocalDate.of(1981,11,29);
        LocalDate HelenBirthDay = LocalDate.of(1985, Month.FEBRUARY,2);
        LocalDate day123OfYear2020 = LocalDate.ofYearDay(2020,123);

        System.out.println("Current Date\t\t" +      currentDate);
        System.out.println("My Birthday\t\t\t"+      myBirthDay);
        System.out.println("Helen's Birthday\t" +    HelenBirthDay);
        System.out.println("123 day of 2020\t\t" +   day123OfYear2020);
        System.out.println("");
        System.out.println("Current year\t\t\t" +       currentDate.getYear());
        System.out.println("Current month\t\t\t" +      currentDate.getMonth());
        System.out.println("Current day of month\t" +   currentDate.getDayOfMonth());
        System.out.println("Current day of week\t\t" +  currentDate.getDayOfWeek());
        System.out.println("In current month\t\t" +     currentDate.lengthOfMonth() + "\t\tdays");
        System.out.println("In current year\t\t\t" +    currentDate.lengthOfYear() + "\t\tdays");
        System.out.println("Is current Date leap?\t" +  currentDate.isLeapYear());
    }
}
