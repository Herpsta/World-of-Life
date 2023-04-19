import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConsolePrinter {
    private static final ByteArrayOutputStream consoleOutput = new ByteArrayOutputStream();

    // Redirects console output to a byte array stream
    static {
        System.setOut(new PrintStream(consoleOutput));
    }

    public static void printWelcomeMessage() {
        System.out.println("Welcome to Alien Planet Survival!");
        System.out.println("You find yourself stranded on an unknown alien planet.");
        System.out.println("Your goal is to survive as long as possible.\n");
    }

    public static void printDay(int day, int health, int hunger, int thirst) {
        System.out.println("Day " + day);
        System.out.println("Health: " + health + " Hunger: " + hunger + " Thirst: " + thirst);
    }

    public static void printChoices() {
        System.out.println("What do you want to do?");
        System.out.println("1. Find food");
        System.out.println("2. Find water");
        System.out.println("3. Rest");
        System.out.println("4. Quit");
    }

    public static void printInvalidChoice() {
        System.out.println("Invalid choice. Please choose again.");
    }

    public static void printFoodFound(int foodFound) {
        System.out.println("You found " + foodFound + " units of food.");
    }

    public static void printWaterFound(int waterFound) {
        System.out.println("You found " + waterFound + " units of water.");
    }

    public static void printRestResult(int restHealed) {
        System.out.println("You rested and regained " + restHealed + " health.");
    }

    public static void printGameOver() {
        System.out.println("You died. Game over!");
    }

    public static void printGiveUp() {
        System.out.println("You gave up. Game over!");
    }

    public static String getConsoleOutput() {
        return consoleOutput.toString();
    }
}