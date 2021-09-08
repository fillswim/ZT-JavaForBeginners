package Lesson20;

import java.util.*;

public class Lesson20_ArrayList {
    public static void main(String[] args) {
//        ArrayList<String> list1 = new ArrayList<>();
//        list1.add("A");
//        list1.add("B");
//        list1.add("C");
//        list1.add("D");

        List<String> list1 = List.of("one", "two", "three");
        List<String> list2 = List.copyOf(list1);

        System.out.println(list2);

    }
}
