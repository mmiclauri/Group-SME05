package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller implements ControllerInterface {

    private final List<String> activeFeatures;

    public Controller() {
        activeFeatures = new ArrayList<>();
    }

    @Override
    public int activate(String[] deactivations, String[] activations) {
        return 0;
    }

    @Override
    public boolean enableUIView() {
        return false;
    }

    @Override
    public boolean disableUIView() {
        return false;
    }

    @Override
    public String[] getStateAsLog() {
        return new String[0];
    }

    private void printHelp() {
        System.out.println("Available commands:");
        System.out.println("\tstate");
        System.out.println("\thelp");
        System.out.println("\tquit");
    }

    private void printState() {
        if (activeFeatures.isEmpty()) {
            System.out.println("No active features.");
            return;
        }

        for (String feature : activeFeatures) {
            System.out.println(feature);
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Smart Learning App");
        System.out.println("Type 'help' to see the available commands.");

        boolean running = true;

        while (running) {
            System.out.print("> ");
            String command = scanner.nextLine().trim();

            switch (command) {
                case "help":
                    printHelp();
                    break;

                case "state":
                    printState();
                    break;

                case "quit":
                    running = false;
                    break;

                default:
                    System.out.println("Unknown command.");
                    break;
            }
        }
    }
}