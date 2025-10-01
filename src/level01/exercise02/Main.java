package level01.exercise02;

import level01.exercise02.application.ApplicationController;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Start of program ===");
        ApplicationController controller = new ApplicationController();
        controller.run();
        System.out.println("=== End of program ===");
    }
}
