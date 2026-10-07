package view;

public class View {

    public void showWelcomeMessage() {
        System.out.println("Smart Learning App!");
        System.out.println("Type 'help' to see the available commands.");
    }

    public void showPrompt() {
        System.out.print("> ");
    }

    public void showHelp() {
        System.out.println("Available commands:");
        System.out.println("\thelp");
        System.out.println("\tstate");
        System.out.println("\tquit");
    }

    public void showState(String[] logs) {
        if (logs.length == 0) {
            System.out.println("No active features.");
            return;
        }

        for (String log : logs) {
            System.out.println(log);
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showError(String message) {
        System.out.println("Error: " + message);
    }
}