package level02.exercise01.model;

import level02.exercise01.interfaces.Camera;
import level02.exercise01.interfaces.Clock;

/**
 * Smartphone extends Phone and implements Camera + Clock.
 */
public class Smartphone extends Phone implements Camera, Clock {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    @Override
    public void alarm() {
        System.out.println("The alarm is ringing!");
    }
}
