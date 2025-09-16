package level01.exercise01.application;

import level01.exercise01.model.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Controls program flow:
 * - Load instruments
 * - List instruments
 * - Play instruments
 */
public class ApplicationController {

    // List of instruments (polymorphic behavior: all are Instrument)
    private final List<Instrument> instruments = new ArrayList<>();

    /**
     * Entry point of the controller.
     * Calls the three main steps.
     */
    public void run() {
        loadInstruments();
        listInstruments();
        playInstruments();
    }

    /**
     * Load different instrument types into the list.
     */
    private void loadInstruments() {
        instruments.add(new WindInstrument("Flute", 120.0));
        instruments.add(new StringInstrument("Guitar", 300.0));
        instruments.add(new PercussionInstrument("Drum", 200.0));
    }

    /**
     * Print all instruments in the list.
     */
    private void listInstruments() {
        System.out.println("\n--- LIST ---");
        for (Instrument i : instruments) {
            System.out.println(i);
        }
    }

    /**
     * Execute the play() method of each instrument (polymorphism).
     */
    private void playInstruments() {
        System.out.println("\n--- PLAY ---");
        for (Instrument i : instruments) {
            i.play();
        }
    }
}
