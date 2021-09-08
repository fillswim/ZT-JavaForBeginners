package Lesson29;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test2 {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2021, Month.MAY, 15);
        LocalDate end = LocalDate.of(2021, Month.DECEMBER, 15);
        Period period = Period.of(0, 2, 3);
        change(start, end, period);

    }


    static void change(LocalDate start, LocalDate end, Period period) {
        LocalDate date = start;
        while (date.isBefore(end)) {
            System.out.println("Data " + date + " to change duty");
            date = date.plus(period);
        }
    }
}
