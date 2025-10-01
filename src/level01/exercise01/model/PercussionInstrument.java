package level01.exercise01.model;

public class PercussionInstrument extends Instrument {

    static{
        System.out.println("PercussionInstrument class loaded");
    }

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