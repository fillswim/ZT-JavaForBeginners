package Lesson27;

public class Test1 {
    public static void main(String[] args) {

        Animal animal = new Tiger();
        System.out.println(animal.a);
        animal.abc();
    }
}

class Animal{
    int a = 5;

    void abc() {
        System.out.println("Non-static method of class Animal");
    }
}

class Tiger extends Animal {

    int a = 15;

    void abc() {
        System.out.println("Non-static method of class Tiger");
    }
}