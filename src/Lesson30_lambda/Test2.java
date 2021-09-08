package Lesson30_lambda;

import java.util.ArrayList;

public class Test2 {
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
//
//        FindStudentsOverGrade findStudentsOverGrade = new FindStudentsOverGrade();
//        FindStudentsUnderGrade findStudentsUnderGrade = new FindStudentsUnderGrade();
//        FindStudentsOverAge findStudentsOverAge = new FindStudentsOverAge();
//        FindStudentsUnderAge findStudentsUnderAge = new FindStudentsUnderAge();
//        FindStudentsBySex findStudentsBySex = new FindStudentsBySex();
//        FindStudentsMixCondition findStudentsMixCondition = new FindStudentsMixCondition();
//
//        studentInfo.testStudents(students, findStudentsOverGrade);
//        System.out.println("--------------------------------------------");
//        studentInfo.testStudents(students, findStudentsUnderGrade);
//        System.out.println("--------------------------------------------");
//        studentInfo.testStudents(students, findStudentsOverAge);
//        System.out.println("--------------------------------------------");
//        studentInfo.testStudents(students, findStudentsUnderAge);
//        System.out.println("--------------------------------------------");
//        studentInfo.testStudents(students, findStudentsBySex);
//        System.out.println("--------------------------------------------");
//        studentInfo.testStudents(students, findStudentsMixCondition);
//        System.out.println("--------------------------------------------");
//
//
//    }
//
//    void printStudent(Student student) {
//        System.out.println("Name of student: " + student.name +
//                ", sex: " + student.sex + ", course: "
//                + student.course + ", avgGrade: " + student.avgGrade);
//    }
//
//    void testStudents(ArrayList<Student> students, StudentChecks studentCheck) {
//        for (Student student : students) {
//            if (studentCheck.testStudent(student)) {
//                printStudent(student);
//            }
//        }
//    }
//
//}
//
//interface StudentChecks {
//    boolean testStudent(Student student);
//}
//
//class FindStudentsOverGrade implements StudentChecks {
//    @Override
//    public boolean testStudent(Student student) {
//        return student.avgGrade > 8.5;
//    }
//}
//
//class FindStudentsUnderGrade implements StudentChecks {
//    @Override
//    public boolean testStudent(Student student) {
//        return student.avgGrade < 9;
//    }
//}
//
//class FindStudentsOverAge implements StudentChecks {
//    @Override
//    public boolean testStudent(Student student) {
//        return student.age > 25;
//    }
//}
//
//class FindStudentsUnderAge implements StudentChecks {
//    @Override
//    public boolean testStudent(Student student) {
//        return student.age < 27;
//    }
//}
//
//class FindStudentsBySex implements StudentChecks {
//    @Override
//    public boolean testStudent(Student student) {
//        return student.sex == 'm';
//    }
//}
//class FindStudentsMixCondition implements StudentChecks {
//    @Override
//    public boolean testStudent(Student student) {
//        return (student.avgGrade > 7.2 && student.age < 23 && student.sex == 'f');
//    }
//}
