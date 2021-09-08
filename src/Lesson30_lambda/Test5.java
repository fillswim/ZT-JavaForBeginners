package Lesson30_lambda;

public class Test5 {
    static void def(myInterface5 myInterface) {
        System.out.println(myInterface.defInterface());
    }

    public static void main(String[] args) {
        def(() -> 5);
    }
}

interface myInterface5 {
    int defInterface();
}