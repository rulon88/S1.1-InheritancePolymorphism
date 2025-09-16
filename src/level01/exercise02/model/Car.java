package level01.exercise02.model;

public class Car {

    // Constant brand (shared, never changes)
    private static final String BRAND = "Ford";

    // Static field (shared by all cars)
    private static String model;

    // Final field (set once per object)
    private final int horsepower;

    public Car(String model, int horsepower) {
        Car.model = model;          // affects all instances
        this.horsepower = horsepower; // unique to each object
    }

    // Getters
    public static String getBrand() {
        return BRAND;
    }

    public static String getModel() {
        return model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + BRAND + '\'' +
                ", model='" + model + '\'' +
                ", horsepower=" + horsepower +
                '}';
    }
}

