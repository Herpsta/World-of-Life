import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class GameLoopTest {

    private GameLoop gameLoop;
    private InputStream inputStream;

    @BeforeEach
    public void setUp() {
        gameLoop = new GameLoop();
    }

    @Test
    public void testFindFood() {
        int initialHunger = gameLoop.getNeeds().getHunger();
        int foodFound = 15;
        inputStream = new ByteArrayInputStream("1".getBytes());
        System.setIn(inputStream);
        gameLoop.run();
        Assertions.assertEquals(initialHunger + foodFound, gameLoop.getNeeds().getHunger());
    }

    @Test
    public void testFindWater() {
        int initialThirst = gameLoop.getNeeds().getThirst();
        int waterFound = 10;
        inputStream = new ByteArrayInputStream("2".getBytes());
        System.setIn(inputStream);
        gameLoop.run();
        Assertions.assertEquals(initialThirst + waterFound, gameLoop.getNeeds().getThirst());
    }

    @Test
    public void testRest() {
        int initialHealth = gameLoop.getHealth();
        int restHealed = 8;
        inputStream = new ByteArrayInputStream("3".getBytes());
        System.setIn(inputStream);
        gameLoop.run();
        Assertions.assertEquals(initialHealth + restHealed, gameLoop.getHealth());
    }

    @Test
    public void testInvalidChoice() {
        inputStream = new ByteArrayInputStream("5\n".getBytes());
        System.setIn(inputStream);
        gameLoop.run();
        String consoleOutput = ConsolePrinter.getConsoleOutput();
        Assertions.assertTrue(consoleOutput.contains("Invalid choice."));
    }

}
