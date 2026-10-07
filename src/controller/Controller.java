package controller;

import view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller implements ControllerInterface {

    private final View view;

    public Controller(View view) {
        this.view = view;
    }

    @Override
    public int activate(String[] deactivations, String[] activations) {
        //todo
        return 0;
    }

    @Override
    public boolean enableUIView() {
        //todo
        return false;
    }

    @Override
    public boolean disableUIView() {
        //todo
        return false;
    }

    @Override
    public String[] getStateAsLog() {
        //todo
        return new String[0];
    }

    private void printHelp() {
        System.out.println("Available commands:");
        System.out.println("\tstate");
        System.out.println("\thelp");
        System.out.println("\tquit");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        view.showWelcomeMessage();

        while (running) {
            view.showPrompt();

            String command = scanner.nextLine().trim();

            switch (command.toLowerCase()) {
                case "help":
                    view.showHelp();
                    break;

                case "state":
                    view.showState(getStateAsLog());
                    break;

                case "quit":
                    running = false;
                    break;

                default:
                    view.showError("Unknown command.");
                    break;
            }
        }

        scanner.close();
        view.showMessage("Application stopped.");
    }
}