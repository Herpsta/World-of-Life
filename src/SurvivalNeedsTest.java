import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SurvivalNeedsTest {
    @Test
    public void testEat() {
        SurvivalNeeds survivalNeeds = new SurvivalNeeds(50, 50, 50);
        survivalNeeds.eat(30);
        assertEquals(20, survivalNeeds.getHunger());
    }

    @Test
    public void testDrink() {
        SurvivalNeeds survivalNeeds = new SurvivalNeeds(50, 50, 50);
        survivalNeeds.drink(20);
        assertEquals(30, survivalNeeds.getThirst());
    }

    @Test
    public void testRest() {
        SurvivalNeeds survivalNeeds = new SurvivalNeeds(50, 50, 50);
        survivalNeeds.rest(30);
        assertEquals(80, survivalNeeds.getEnergy());
    }

    @Test
    public void testHasDied() {
        SurvivalNeeds survivalNeeds = new SurvivalNeeds(100, 0, 0);
        assertTrue(survivalNeeds.hasDied());

        survivalNeeds = new SurvivalNeeds(0, 100, 0);
        assertTrue(survivalNeeds.hasDied());

        survivalNeeds = new SurvivalNeeds(0, 0, -10);
        assertTrue(survivalNeeds.hasDied());

        survivalNeeds = new SurvivalNeeds(50, 50, 50);
        assertFalse(survivalNeeds.hasDied());
    }
}
