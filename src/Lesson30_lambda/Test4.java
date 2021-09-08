package Lesson30_lambda;

public class Test4 {
    static void def(MyInterface myInterface) {
        System.out.println(myInterface.defInterface("privet"));
    }

    public static void main(String[] args) {
        def(x -> x.length());
    }
}

interface MyInterface {
    int defInterface(String string);
}