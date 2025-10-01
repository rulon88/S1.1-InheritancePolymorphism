package level01.exercise01.model;

public class StringInstrument extends Instrument {

    static {
        System.out.println("StringInstrument class loaded");
    }

    public StringInstrument(String name, double price) {

        super(name,price);
        System.out.println("StringInstrument instance created");
    }
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