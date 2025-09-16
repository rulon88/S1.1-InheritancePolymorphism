package level01.exercise01;

import level01.exercise01.application.ApplicationController;

/**
 * Main entry point of the program.
 * - Creates the controller.
 * - Runs the program flow.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Start of program ===");

        // Create the controller that handles program flow
        ApplicationController controller = new ApplicationController();

        // Run the controller: load, list and play instruments
        controller.run();

        System.out.println("=== End of program ===");
    }
}
