package Lesson30_lambda;

import java.util.ArrayList;

public class Test1 {
}

//class Student {
//
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avgGrade;
//
//    public Student(String name, char sex, int age, int course, double avgGrade) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//}
//
//class StudentInfo {
//
//    public static void main(String[] args) {
//        ArrayList<Student> students = new ArrayList<>();
//        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
//        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
//        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
//        Student st4 = new Student("Petr", 'm', 35, 4, 7);
//        Student st5 = new Student("Maria", 'f', 23, 3, 9.1);
//
//        students.add(st1);
//        students.add(st2);
//        students.add(st3);
//        students.add(st4);
//        students.add(st5);
//
//        StudentInfo studentInfo = new StudentInfo();
//        studentInfo.printStudentsOverGrade(students,8.5);
//        System.out.println("----------------------------------");
//        studentInfo.printStudentsUnderGrade(students,9);
//        System.out.println("----------------------------------");
//        studentInfo.printStudentsOverAge(students, 25);
//        System.out.println("----------------------------------");
//        studentInfo.printStudentsUnderAge(students, 27);
//        System.out.println("----------------------------------");
//        studentInfo.printStudentsBySex(students, 'm');
//        System.out.println("----------------------------------");
//        studentInfo.printStudentsMixConditions(students, 7.2, 23, 'f');
//
//    }
//
//    void printStudent(Student student) {
//        System.out.println("Name of student: " + student.name +
//                ", sex: " + student.sex + ", course: "
//                + student.course + "avgGrade: " + student.avgGrade);
//    }
//
//    void printStudentsOverGrade(ArrayList<Student> arrayList, double avgGrade) {
//        for (Student student : arrayList) {
//            if (student.avgGrade > avgGrade) {
//                printStudent(student);
//            }
//        }
//    }
//
//    void printStudentsUnderGrade(ArrayList<Student> arrayList, double avgGrade) {
//        for (Student student : arrayList) {
//            if (student.avgGrade < avgGrade) {
//                printStudent(student);
//            }
//        }
//    }
//
//    void printStudentsOverAge(ArrayList<Student> arrayList, int age) {
//        for (Student student : arrayList) {
//            if (student.age > age) {
//                printStudent(student);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(ArrayList<Student> arrayList, int age) {
//        for (Student student : arrayList) {
//            if (student.age < age) {
//                printStudent(student);
//            }
//        }
//    }
//
//    void printStudentsBySex(ArrayList<Student> arrayList, char sex) {
//        for (Student student : arrayList) {
//            if (student.sex == sex) {
//                printStudent(student);
//            }
//        }
//    }
//
//    void printStudentsMixConditions(ArrayList<Student> arrayList, double avgGrade, int age, char sex) {
//        for (Student student : arrayList) {
//            if (student.avgGrade > avgGrade && student.age < age && student.sex == sex) {
//                printStudent(student);
//            }
//        }
//    }
//}
