import java.util.Scanner;

public class GameLoop {
    // Player's initial attributes
    private int health = 100;
    private int day = 1;
    private final SurvivalNeeds needs = new SurvivalNeeds(100, 100, 100);

    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        ConsolePrinter.printWelcomeMessage();

        while (true) {
            ConsolePrinter.printDay(day, health, needs.getHunger(), needs.getThirst());
            ConsolePrinter.printChoices();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    findFood();
                    break;
                case 2:
                    findWater();
                    break;
                case 3:
                    rest();
                    break;
                case 4:
                    ConsolePrinter.printGiveUp();
                    System.exit(0);
                default:
                    ConsolePrinter.printInvalidChoice();
                    break;
            }

            day++;
        }
    }

    // Getters
    public SurvivalNeeds getNeeds() {
        return needs;
    }
    public int getHealth() {
        return health;
    }
    public int getDay() {
        return day;
    }

    private void findFood() {
        int foodFound = (int) (Math.random() * 20) + 10;
        needs.eat(foodFound);
        ConsolePrinter.printFoodFound(foodFound);
        checkStatus();
    }

    private void findWater() {
        int waterFound = (int) (Math.random() * 10) + 5;
        needs.drink(waterFound);
        ConsolePrinter.printWaterFound(waterFound);
        checkStatus();
    }

    private void rest() {
        int restHealed = (int) (Math.random() * 10) + 5;
        health += restHealed;
        ConsolePrinter.printRestResult(restHealed);
        checkStatus();
    }

    private void checkStatus() {
        if (health <= 0 || needs.hasDied()) {
            ConsolePrinter.printGameOver();
            System.exit(0);
        }
    }
}