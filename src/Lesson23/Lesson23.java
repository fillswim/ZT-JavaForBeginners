package Lesson23;

public class Lesson23 {

    public static void main(String[] args) {
        System.out.println(new Employee().salary);
        System.out.println(new Doctor().salary);
    }
}

class Employee{

    int salary = 500;

    static void eat() {
        System.out.println("Employee eats");
    }
}

class Doctor extends Employee {

    int salary = super.salary + 100;

    static void eat() {
        System.out.println("Doctor eats");
    }
}
