public interface ISurvive {
    public int getHunger();

    public void setHunger(int hunger);

    public int getThirst();

    public void setThirst(int thirst);

    public int getEnergy();

    public void setEnergy(int energy);

    public void eat(int foodValue);

    public void drink(int waterValue);

    public void rest(int energyValue);

    public boolean hasDied();
}
