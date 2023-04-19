public class SurvivalNeeds {
    private int hunger; // player's hunger level
    private int thirst; // player's thirst level
    private int energy; // player's energy level
    private int maxNeedValue = 100; // Maximum value for hunger, thirst and energy

    // constructor
    public SurvivalNeeds(int hunger, int thirst, int energy) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.energy = energy;
    }

    // getters and setters
    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    // methods to update survival needs
    public void eat(int foodValue) {
        hunger -= foodValue;
        if (hunger < 0) {
            hunger = 0;
        } else if (hunger > maxNeedValue) {
            hunger = maxNeedValue;
        }
        System.out.println("You ate some food. Your hunger level is now " + hunger);
    }

    public void drink(int waterValue) {
        thirst -= waterValue;
        if (thirst < 0) {
            thirst = 0;
        } else if (thirst > maxNeedValue) {
            thirst = maxNeedValue;
        }
        System.out.println("You drank some water. Your thirst level is now " + thirst);
    }

    public void rest(int energyValue) {
        energy += energyValue;
        if (energy < 0) {
            energy = 0;
        } else if (energy > maxNeedValue) {
            energy = maxNeedValue;
        }
        System.out.println("You rested. Your energy level is now " + energy);
    }

    // method to check if player has died from lack of survival needs
    public boolean hasDied() {
        return (hunger >= 100 || thirst >= 100 || energy <= 0);
    }
}
