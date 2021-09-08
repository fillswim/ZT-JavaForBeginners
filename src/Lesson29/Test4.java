package Lesson29;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Test4 {
    public static void main(String[] args) {

        LocalDate ld = LocalDate.of(2016, Month.SEPTEMBER, 1);
        System.out.println(ld.getDayOfWeek());
        System.out.println(ld.getDayOfYear());
        System.out.println(ld.getMonth());

        LocalTime lt = LocalTime.of(16, 40);
        System.out.println(lt);
        System.out.println(lt.getHour());

    }
}
