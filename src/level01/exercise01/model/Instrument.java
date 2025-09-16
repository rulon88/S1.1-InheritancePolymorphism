package level01.exercise01.model;

/**
 * Abstract class representing a musical instrument.
 * Each instrument has a name and a price.
 * Subclasses must implement the abstract method play().
 */
public abstract class Instrument {

    // Static block runs once when the class is loaded
    static {
        System.out.println("Instrument class loaded.");
    }

    private final String name;
    private final double price;

    // Constructor with validation (not needed, data comes from main)
    public Instrument(String name, double price) {
        this.name = validateName(name);
        this.price = validatePrice(price);
    }

    // Fail-fast validation for name
    private String validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank.");
        }
        return name;
    }

    // Fail-fast validation for price
    private double validatePrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price must be positive.");
        }
        return price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Abstract method implemented by subclasses
    public abstract void play();

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
