package core.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CreateDateSimpleDateFormat {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat forParseDate = new SimpleDateFormat("dd/MM/yy");
        Date myBD = forParseDate.parse("29/11/81");
        SimpleDateFormat forOutput = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
            System.out.println(forOutput.format(myBD));
            System.out.println(String.format("My BirthDay is %s", forOutput.format(myBD)));

        Date helenBD = new SimpleDateFormat("yyyy-MM-dd 'T'HH:mm:ss").parse("1989-02-20 T09:00:00");
        String helenBDstr = new SimpleDateFormat("dd/MM/yyyy, Ka").format(helenBD);
        System.out.println(helenBDstr);


    }
}
