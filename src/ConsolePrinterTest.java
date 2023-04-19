import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConsolePrinterTest {

    @Test
    public void testPrintWelcomeMessage() {
        ConsolePrinter.printWelcomeMessage();
        String expectedOutput = "Welcome to Alien Planet Survival!\n" +
                "You find yourself stranded on an unknown alien planet.\n" +
                "Your goal is to survive as long as possible.\n\n";
        String consoleOutput = ConsolePrinter.getConsoleOutput();
        Assertions.assertEquals(expectedOutput, consoleOutput);
    }

    @Test
    public void testPrintDay() {
        ConsolePrinter.printDay(1, 100, 50, 75);
        String expectedOutput = "Day 1\n" +
                "Health: 100 Hunger: 50 Thirst: 75\n";
        String consoleOutput = ConsolePrinter.getConsoleOutput();
        Assertions.assertEquals(expectedOutput, consoleOutput);
    }

    @Test
    public void testPrintChoices() {
        ConsolePrinter.printChoices();
        String expectedOutput = "What do you want to do?\n" +
                "1. Find food\n" +
                "2. Find water\n" +
                "3. Rest\n" +
                "4. Quit\n";
        String consoleOutput = ConsolePrinter.getConsoleOutput();
        Assertions.assertEquals(expectedOutput, consoleOutput);
    }

    @Test
    public void testPrintInvalidChoice() {
        ConsolePrinter.printInvalidChoice();
        String expectedOutput = "Invalid choice. Please choose again.\n";
        String consoleOutput = ConsolePrinter.getConsoleOutput();
        Assertions.assertEquals(expectedOutput, consoleOutput);
    }

    @Test
    public void testPrintFoodFound() {
        ConsolePrinter.printFoodFound(10);
        String expectedOutput = "You found 10 units of food.\n";
        String consoleOutput = ConsolePrinter.getConsoleOutput();
        Assertions.assertEquals(expectedOutput, consoleOutput);
    }

    @Test
    public void testPrintWaterFound() {
        ConsolePrinter.printWaterFound(5);
        String expectedOutput = "You found 5 units of water.\n";
        String consoleOutput = ConsolePrinter.getConsoleOutput();
        Assertions.assertEquals(expectedOutput, consoleOutput);
    }

    @Test
    public void testPrintRestResult() {
        ConsolePrinter.printRestResult(8);
        String expectedOutput = "You rested and regained 8 health.\n";
        String consoleOutput = ConsolePrinter.getConsoleOutput();
        Assertions.assertEquals(expectedOutput, consoleOutput);
    }

    @Test
    public void testPrintGameOver() {
        ConsolePrinter.printGameOver();
        String expectedOutput = "You died. Game over!\n";
        String consoleOutput = ConsolePrinter.getConsoleOutput();
        Assertions.assertEquals(expectedOutput, consoleOutput);
    }

    @Test
    public void testPrintGiveUp() {
        ConsolePrinter.printGiveUp();
        String expectedOutput = "You gave up. Game over!\n";
        String consoleOutput = ConsolePrinter.getConsoleOutput();
        Assertions.assertEquals(expectedOutput, consoleOutput);
    }

}
