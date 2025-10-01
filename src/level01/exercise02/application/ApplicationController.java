package level01.exercise02.application;

import level01.exercise02.model.Car;

public class ApplicationController {

    public void run() {
        Car car1 = new Car("Focus", 120);
        System.out.println("car1 -> " + car1);

        Car car2 = new Car("Mustang", 300);
        System.out.println("car2 -> " + car2);

        System.out.println("car1 (reprint to show static model) -> " + car1);

        System.out.println("brand (static): " + Car.getBrand());
        System.out.println("car1 horsepower (instance): " + car1.getHorsepower());
        System.out.println("car2 horsepower (instance): " + car2.getHorsepower());

        Car.accelerate();
        Car.brake();
    }
}
