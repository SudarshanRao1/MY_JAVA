public class Pet {
    private String name;
    private int hungerLevel;

    public Pet(String name, int hungerLevel) {
        this.name = name;
        this.hungerLevel = hungerLevel;
    }

    public void eat(int foodAmount) throws OverfedException {
        if (this.hungerLevel + foodAmount > 100) {
            throw new OverfedException("Pet is overfed!");
        }
        this.hungerLevel += foodAmount;
        System.out.println(name + " ate. Hunger level: " + hungerLevel);
    }

    public synchronized void decreaseHunger(int amount) {
        if (this.hungerLevel - amount >= 0) {
            this.hungerLevel -= amount;
        }
    }
}