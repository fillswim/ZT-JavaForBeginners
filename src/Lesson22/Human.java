package Lesson22;

public class Human {

    private String name;
    private String surname;

    // 3) Запускается именно этот конструктор
    public Human(String name) {
        this(name, null);
    }
    // 4) Затем запускается перегруженный конструктор
    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}

class Student extends Human {
    Student() {
        // 2) Запускается конструктор Human без параметров, но его нет,
        // есть только конструктор с одним параметром,
        // поэтому нужно передать один параметр
        super("Pet");
    }

    public static void main(String[] args) {
        // 1) Запускается конструктор Student без параметров
        Student student = new Student();
    }
}
