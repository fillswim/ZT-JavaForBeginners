package Lesson19;

public class Lesson19_Varargs {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] arr : array) {
            for (int a : arr) {
                System.out.print(a + " ");
            }
        }
    }
}
