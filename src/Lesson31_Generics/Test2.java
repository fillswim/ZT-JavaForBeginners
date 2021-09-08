package Lesson31_Generics;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(10);
        arrayList1.add(30);
        arrayList1.add(150);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("a");
        arrayList2.add("b");
        arrayList2.add("c");

        int a = GenMethod.getSecondElement(arrayList1);
        System.out.println(a);

        String s = GenMethod.getSecondElement(arrayList2);
        System.out.println(s);
    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}
