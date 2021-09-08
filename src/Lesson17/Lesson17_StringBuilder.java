package Lesson17;

public class Lesson17_StringBuilder {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Good Day");

        System.out.println(stringBuilder.subSequence(5, 8));

        stringBuilder.append(" friends");
        System.out.println(stringBuilder);

        stringBuilder.insert(4, " sunny");
        System.out.println(stringBuilder);

        stringBuilder.delete(4, 10);
        System.out.println(stringBuilder);

        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        System.out.println(stringBuilder);

        stringBuilder.replace(5, 7, "Night");
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.capacity());

    }
}
