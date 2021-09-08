package Lesson31_Generics;

import java.util.ArrayList;

public class Test3My {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");

//        getElements(integers);
//        getElements(strings);

        Nokia nokia = new Nokia("A35");
        Box<Nokia> nokiaBox = new Box<>(nokia);

//        System.out.println(nokiaBox.get().getModel());

        SubNokia subNokia1 = new SubNokia("SubA35");
        SubNokia subNokia2 = new SubNokia("SubA36");
        SubNokia subNokia3 = new SubNokia("SubA37");
        SubNokia subNokia4 = new SubNokia("SubA38");
        SubNokia subNokia5 = new SubNokia("SubA39");

        ArrayList<SubNokia> subNokiaArrayList = new ArrayList<>();
        subNokiaArrayList.add(subNokia1);
        subNokiaArrayList.add(subNokia2);
        subNokiaArrayList.add(subNokia3);
        subNokiaArrayList.add(subNokia4);
        subNokiaArrayList.add(subNokia5);

        getElements(subNokiaArrayList);

        SubNokia subNokiaOfList = getElement(subNokiaArrayList, 2);
        System.out.println(subNokiaOfList.getClass());


    }

//    static <T> void getElements(ArrayList<T> arrayList) {
//        for (T t : arrayList) {
//            System.out.println(t);
//        }
//    }

    static void getElements(ArrayList<? extends Nokia> arrayList) {
        for (Nokia nokia : arrayList) {
            System.out.println(nokia.getModel());
        }
    }

//    static <T> T getElement(ArrayList<T> arrayList, Integer i) {
//        return arrayList.get(i);
//    }

    static <T extends Nokia> T getElement(ArrayList<T> arrayList, Integer i) {
        return (T) arrayList.get(i);
    }
}

class Box<T>{

    private T value;

    public Box(T t) {
        this.value = t;
    }

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return this.value;
    }

}

class Nokia{
    private String model;

    public Nokia(String model) {
        this.model = model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }
}

class SubNokia extends Nokia {
    public SubNokia(String model) {
        super(model);
    }
}
