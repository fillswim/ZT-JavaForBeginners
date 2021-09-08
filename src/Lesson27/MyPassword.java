package Lesson27;

public class MyPassword {

    public void createPassword(String pwd) {
        if (pwd.length() < 8) {
            throw new IllegalArgumentException("Your password is too short");
        }

        System.out.println("Done!");
    }
}
