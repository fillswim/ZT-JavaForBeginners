package Lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Test5 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalTime lt = LocalTime.of(16, 40);
        LocalDateTime ldt = LocalDateTime.of(ld, lt);

//        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_TIME;
//        System.out.println(lt.format(dtf));
//        System.out.println(dtf.format(lt));

//        DateTimeFormatter dtfMy = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
//        System.out.println(ldt);
//        System.out.println(dtfMy.format(ldt));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 02 2016", formatter);
        System.out.println(date);

    }
}
