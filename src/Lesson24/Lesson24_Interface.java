package Lesson24;

public class Lesson24_Interface {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.fly();
        System.out.println(parrot instanceof flyAble);
    }
}

interface flyAble {

    default void fly(){
        System.out.println("Anybody flies");
    }
}

class Bird implements flyAble{

}

class Parrot extends Bird {

}