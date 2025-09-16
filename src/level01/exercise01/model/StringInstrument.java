package level01.exercise01.model;

public class StringInstrument extends Instrument {

    // Static block runs once when the class is first loaded into memory
    static {
        System.out.println("StringInstrument class loaded");
    }
    /**
     * Constructor for StringInstrument.
     * Initializes name and price
     *
     * @param name  the name of the instrument
     * @param price the price of the instrument
     */

    public StringInstrument(String name, double price) {

        super(name,price);
        System.out.println("StringInstrument instance created");
    }
    /**
     * Abstract method.
     * Prints a message to indicate the instrument is playing.
     */
    public void play(){
        System.out.println("A string instrument is playing.");

    }

    @Override
    public String toString() {
        return "StringInstrument{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                '}';
    }

}