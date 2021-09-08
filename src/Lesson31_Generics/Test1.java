package Lesson31_Generics;

public class Test1 {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("privet");
        String s = info1.getValue();
        System.out.println(info1);

        Info<Integer> info2 = new Info<>(100);
        int i = info2.getValue();
        System.out.println(info2);
    }

//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }

//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }

}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "[(" + value + ")]";
    }

    public T getValue() {
        return value;
    }
}

class Parent {
    public void abc(Info<String> info) {
        String s = info.getValue();
    }
}

