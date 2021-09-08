package Lesson26;

import java.util.ArrayList;

public class MyAutoboxing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);         // Autoboxing

        int a = list.get(0); // Unboxing
    }
}
