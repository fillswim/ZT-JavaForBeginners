package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test9 {
    public static void main(String[] args) {

    }

    static void abc() throws FileNotFoundException{
        try {
            File file = new File("test10.txt");
            FileInputStream inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("Catch exception");
            throw e;
        } finally {
            System.out.println("Finally block");
        }
    }
}
