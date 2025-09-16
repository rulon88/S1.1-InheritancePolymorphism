package level01.exercise01.model;

public class PercussionInstrument extends Instrument {
    // Static block runs once when the class is first loaded into memory
    static{
        System.out.println("PercussionInstrument class loaded");
    }
    /**
     * Constructor for PercussionInstrument.
     * Initializes name and price.
     * @param name  the name of the instrument
     * @param price the price of the instrument
     */
    public PercussionInstrument(String name, double price) {
        super(name, price);
        System.out.println("PercussionInstrument instance created");
    }

    @Override
    public void play(){
        System.out.println("A percussion instrument is playing.");
    }

    @Override
    public String toString() {
        return "PercussionInstrument{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                '}';
    }


}