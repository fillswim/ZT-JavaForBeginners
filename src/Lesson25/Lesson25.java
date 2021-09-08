package Lesson25;

public class Lesson25 {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon();
        surgeon.whoIAm();                // "I am a Surgeon"
        ((Doctor) surgeon).whoIAm();     // "I am a Surgeon"
        ((Employee) surgeon).whoIAm();   // "I am a Surgeon"
    }
}

class Employee{
    void whoIAm(){
        System.out.println("I am an Employee");
    }
}

class Doctor extends Employee{
    @Override
    void whoIAm() {
        System.out.println("I am a Doctor");
    }
}

class Surgeon extends Doctor {
    @Override
    void whoIAm() {
        System.out.println("I am a Surgeon");
    }
}
