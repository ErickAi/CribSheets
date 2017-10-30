package core.date;


import java.time.Instant;
import java.util.Date;

public class CreateDateFromLocalDate {

    public static void main(String[] args) {
        Instant timestamp = Instant.now();
        System.out.println("Текущая отметка времени : "+timestamp);

        //Instant для timestamp
        Instant specificTime = Instant.ofEpochMilli(timestamp.toEpochMilli());
        System.out.println("Instant для timestamp : " + specificTime);

        Date date = new Date(specificTime.toEpochMilli());
        System.out.println("Дата из спецификТайм : " + date);
    }
}
