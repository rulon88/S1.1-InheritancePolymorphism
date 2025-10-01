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


        ApplicationController controller = new ApplicationController();
        controller.run();

        System.out.println("=== End of program ===");
    }
}
