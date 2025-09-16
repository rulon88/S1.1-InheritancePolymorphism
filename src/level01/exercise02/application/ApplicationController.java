package level01.exercise02.application;

import level01.exercise02.model.Car;

/**
 * Controls the program flow for exercise 2 (static & final fields).
 */
public class ApplicationController {

    public void run() {
        // First car
        Car car1 = new Car("Focus", 120);
        System.out.println(car1);

        // Second car (changes static 'model' for ALL cars)
        Car car2 = new Car("Mustang", 300);
        System.out.println(car2);

        // car1 is affected because 'model' is static
        System.out.println(car1);

        // Access static final brand directly
        System.out.println("Brand (static final): " + Car.getBrand());
    }
}
