package level01.exercise01.model;


public class WindInstrument extends Instrument {

    // Static block runs once when the class is first loaded
    static {
        System.out.println("WindInstrument class loaded");
    }
    /**
     * Constructor for WindInstrument.
     * Calls the superclass constructor to set name and price.
     * @param name  the name of the instrument
     * @param price the price of the instrument
     */
    public WindInstrument(String name, double price) {

        super(name,price);
        System.out.println("WindInstrument intance created");
    }


    /**
     * Abstract method.
     * Displays a message indicating that the instrument is playing.
     */
    @Override
    public void play(){
        System.out.println("A wind instrument is playing.");
    }



    @Override
    public String toString() {
        return "WindInstrument{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                '}';
    }

}