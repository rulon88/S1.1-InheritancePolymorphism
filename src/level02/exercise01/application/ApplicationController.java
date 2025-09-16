package level02.exercise01.application;

import level02.exercise01.model.Smartphone;

/**
 * Controls the flow of the Smartphone demo.
 */
public class ApplicationController {

    public void run() {
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S24");

        smartphone.call("123456789");
        smartphone.takePhoto();
        smartphone.alarm();
    }
}
