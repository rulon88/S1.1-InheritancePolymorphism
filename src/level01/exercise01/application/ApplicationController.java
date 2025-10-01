package level01.exercise01.application;

import level01.exercise01.model.*;
import java.util.ArrayList;
import java.util.List;


public class ApplicationController {


    private final List<Instrument> instruments = new ArrayList<>();


    public void run() {
        loadInstruments();
        listInstruments();
        playInstruments();
    }

    private void loadInstruments() {
        instruments.add(new WindInstrument("Flute", 120.0));
        instruments.add(new StringInstrument("Guitar", 300.0));
        instruments.add(new PercussionInstrument("Drum", 200.0));
    }


    private void listInstruments() {
        System.out.println("\n--- LIST ---");
        for (Instrument i : instruments) {
            System.out.println(i);
        }
    }


    private void playInstruments() {
        System.out.println("\n--- PLAY ---");
        for (Instrument i : instruments) {
            i.play();
        }
    }
}
