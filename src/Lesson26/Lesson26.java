package Lesson26;

import java.util.ArrayList;

public class Lesson26 {
    public static void main(String[] args) {
        Car car1 = new Car("red", "V4");
        Car car2 = new Car("red", "V4");
        Car car3 = new Car("black", "V8");

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        Car car4 = new Car("black", "V8");

//        System.out.println(car1 == car2);
//        System.out.println(car1.equals(car2));

        System.out.println(cars.contains(car4));
        System.out.println(car4);
    }
}

class Car{
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Car) {
            Car car = (Car) obj;
            boolean colorsAreTheSame = this.color.equals(car.color);
            boolean enginesAreTheSame = this.engine.equals(car.engine);
            boolean carsAreTheSame = colorsAreTheSame && enginesAreTheSame;

            return (carsAreTheSame);
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}