package core.date;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateClass {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, Month.JUNE, 10);
        int year = date.getYear(); // 2014
        Month month = date.getMonth(); // Июнь
        int dom = date.getDayOfMonth(); // 10
        DayOfWeek dow = date.getDayOfWeek(); // Вторник
        int len = date.lengthOfMonth(); // 30 (дней в Июне)
        boolean leap = date.isLeapYear(); // false (не високосный год)

        System.out.println(year);
        System.out.println(month);
        System.out.println(dom);
        System.out.println(dow);
        System.out.println(len);
        System.out.println(leap);

    }
}
