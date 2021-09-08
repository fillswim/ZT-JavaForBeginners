package Lesson18;

import java.util.Arrays;

public class Lesson18_Array {
    public static void main(String[] args) {

        int[] array1 = {1, 9, 3, -8, 0, 5, 4, 1};
        int[] array2 = array1;

        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(array1);
        for (int i : array1) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i : array2) {
            System.out.print(i + " ");
        }

        char[] array = new char[]{'p', 'r', 'i', 'v', 'e', 't'};
        String str = new String(array);

    }
}
