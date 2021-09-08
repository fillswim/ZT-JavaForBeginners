package Lesson16;

import java.util.Locale;

public class Lesson16_String {
    public static void main(String[] args) {

        String s1 = new String("abcdefgabcd");

        // Длина строки
        int length = s1.length();
        System.out.println(length);

        // Нахождение символа по индексу
        char c1 = s1.charAt(3);
        System.out.println(c1);

        // Нахождение индекса символа
        int i1 = s1.indexOf('b');
        System.out.println(i1);

        int i2 = s1.indexOf("de");
        System.out.println(i2);

        int i3 = s1.indexOf("b");
        System.out.println(i3);

        // Поиск индекса символа, начиная с определенного
        int i4 = s1.indexOf("a", 5);
        System.out.println(i4);

        boolean b1 = s1.startsWith("abc");
        System.out.println(b1);

        boolean b2 = s1.startsWith("abc", 7);
        System.out.println(b2);

        boolean b3 = s1.endsWith("bcd");
        System.out.println(b3);

        String s2 = s1.substring(7);
        System.out.println(s2);
        System.out.println(s1);

        String s3 = s1.substring(7, 9);
        System.out.println(s3);

        String s4 = "abc        ";
        String s5 = s4.trim();
        System.out.println(s5);
        System.out.println(s4);

        String s6 = "privet";
        String s7 = s6.replace("t", "d");
        System.out.println(s7);

        String s8 = "poka";
        String s9 = s8.replace("k", "k");
        System.out.println(s8 == s9);

        String s10 = s8.concat(" poka");
        System.out.println(s10);

        String s11 = "HELLO!";
        System.out.println(s11.toLowerCase(Locale.ROOT));

        String s12 = "hello!";
        System.out.println(s12.toUpperCase(Locale.ROOT));

        String s13 = "abracadabra";
        boolean b = s13.contains("c");
        System.out.println(b);

        String s14 = "         ";
        // Проверяет, состоит ли строка из пробелов
        boolean b14 = s14.isBlank();
        System.out.println(b14);

        String s15 = "";
        System.out.println(s15.isEmpty());

        String s16 = "        Hi!            ";
        System.out.println(s16.trim());
        // Удаляет пробелы в начале
        System.out.println(s16.stripLeading());
        // Удаляет пробелы в конце
        System.out.println(s16.stripTrailing());




    }
}
