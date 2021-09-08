package Lesson27;

public class Test10 {
    public static void main(String[] args) {
//        int i = Integer.parseInt("44ab"); // NumberFormatException
        int j = Integer.parseInt("44ab", 16); // NumberFormatException
        System.out.println(j); // 17579

    }
}
