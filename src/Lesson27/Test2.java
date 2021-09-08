package Lesson27;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(abc()); // "Hi!!"
    }

    static StringBuilder abc() {
        StringBuilder result = new StringBuilder("Hi");

        try {
            int[] array = {1, 2, 3};
            int a = array[4]; // Exception
        } catch (Exception e) {
            result.append("!");
            System.out.println("Catch block, result = " + result);
            return result; // В return переделась ссылка на result (Hi!)
        } finally {
            result.append("!"); // Меняется значение result, на которое ссылается return
                                // И выводтся Hi!!
            System.out.println("Finally block, result = " + result);
        }

        return result;
    }
}
