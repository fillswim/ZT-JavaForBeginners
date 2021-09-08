package Lesson30_lambda;

public class Test6 {
    static void def(myInterface6 myInterface) {
        System.out.println(myInterface.defInterface("privet", "poka"));
    }

    public static void main(String[] args) {
        def((String x, String y) -> x.length());
    }
}

interface myInterface6 {
    int defInterface(String str1, String str2);
}