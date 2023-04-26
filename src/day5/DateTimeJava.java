package day5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeJava {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);

        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime);
        System.out.println("Before Format ");
        DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd--mm--yyyy hh:mm:ss");
        String modDate = myDateTime.format(myDateFormat);
        System.out.println("After Format "+ modDate);

        DateTimeFormatter myDateFormat2 = DateTimeFormatter.ofPattern("yyyy--mm--dd");
        String modDate2 = myDateTime.format(myDateFormat2);
        System.out.println("After Format "+ modDate2);
        DateTimeFormatter myDateFormat3 = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        String modDate3 = myDateTime.format(myDateFormat3);
        System.out.println("After Format "+ modDate3);

    }
}
