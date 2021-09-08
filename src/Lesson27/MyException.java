package Lesson27;

public class MyException {

    public static void main(String[] args) {
        MyException myException = new MyException();
        try {
            myException.marathon(20, 13);
        } catch (CrampMuscleException e) {
            System.out.println(e.getMessage());
        } catch (TwistLegException e) {
            e.printStackTrace();
        }finally {
            System.out.println("В любом случае Вы получите грамоту");
        }

    }

    void marathon(int temperature, int speed) throws CrampMuscleException, TwistLegException {

        if (speed > 12) {
            throw new CrampMuscleException("The speed was too height: " + speed);
        }

        if (temperature > 32) {
            throw new TwistLegException();
        }

        System.out.println("Вы пробежали марафон!");
    }
}

class TwistLegException extends Exception {

    TwistLegException(String message) {
        super(message);
    }

    TwistLegException() {}
}

class CrampMuscleException extends Exception {

    CrampMuscleException(String message) {
        super(message);
    }

    CrampMuscleException() {}
}