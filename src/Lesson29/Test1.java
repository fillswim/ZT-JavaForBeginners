package Lesson29;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test1 {
    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(2014, 4, 15);
        System.out.println(localDate1);

        LocalDate localDate2 = LocalDate.of(2014, 6, 16);
        System.out.println(localDate2);
        System.out.println(localDate1.isBefore(localDate2));


        LocalTime localTime1 = LocalTime.of(15, 30);
        System.out.println(localTime1);

        LocalTime localTime2 = LocalTime.of(16, 30);
        System.out.println(localTime2);

        System.out.println(localTime2.isAfter(localTime1));

//
//
//        LocalDateTime localDateTime1 = LocalDateTime.of(2015, 9, 10, 17, 25);
//        System.out.println(localDateTime1);



    }
}
