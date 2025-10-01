package level01.exercise02.model;

public class Car {

    private static final String BRAND = "Ford";
    private static String model;
    private final int horsepower;

    public Car(String model, int horsepower) {
        Car.model = model;
        this.horsepower = horsepower;
    }

    public static String getBrand() {
        return BRAND;
    }

    public static String getModel() {
        return model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public static void accelerate() {
        System.out.println("The car is accelerating...");
    }

    public static void brake() {
        System.out.println("The car is braking...");
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
