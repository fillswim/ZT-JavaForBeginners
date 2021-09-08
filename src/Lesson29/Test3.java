package Lesson29;

import java.time.*;

public class Test3 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 16, 40);
        System.out.println(localDateTime);

        Period period = Period.ofMonths(3);
        Duration duration = Duration.ofMinutes(3);

        System.out.println(localDateTime.plus(period).plus(duration));
    }
}
