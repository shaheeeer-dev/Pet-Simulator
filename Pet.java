public class Pet {
    private String name;
    private int hunger;
    private int happiness;
    private int energy;


    public void setName(String name) {
        this.name = name;
    }

    public Pet() {
        this.hunger = 50;
        this.happiness = 50;
        this.energy = 50;
    }

    void eat(){
        setHunger(hunger - 10);
        setHappiness(happiness + 2);
    }

    void sleep(){
        setHunger(hunger + 5);
        setEnergy(energy + 20);
    }

    void play(){
        setHappiness(happiness + 10);
        setEnergy(energy - 10);
        setHunger(hunger + 5);
    }
    public void status() {
        System.out.println("\n--- " + name + "'s Status ---");
        System.out.println("Hunger: " + hunger);
        System.out.println("Happiness: " + happiness);
        System.out.println("Energy: " + energy+"\n");
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    private void setHunger(int hunger) {
        this.hunger = Math.max(0, Math.min(hunger, 100));
    }

    public int getHappiness() {
        return happiness;
    }

    private void setHappiness(int happiness) {
        this.happiness = Math.max(0, Math.min(happiness, 100));
    }

    public int getEnergy() {
        return energy;
    }

    private void setEnergy(int energy) {
        this.energy = Math.max(0, Math.min(happiness, 100));
    }

    protected void changeHunger(int amount) {
        setHunger(hunger + amount);
    }

    protected void changeHappiness(int amount) {
        setHappiness(happiness + amount);
    }

    protected void changeEnergy(int amount) {
        setEnergy(energy + amount);
    }
}
class Dog extends Pet{
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public  Dog(){
        super();
    }

    @Override
    void play() {
        System.out.println(getName()+" is chasing the ball...");
        changeHappiness(20);
        changeEnergy(-15);
        changeHunger(5);
    }
}
class Cat extends Pet{
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public Cat() {
        super();
    }

    @Override
    void play() {
        System.out.println(getName()+" is batting at toys...");
        changeHappiness(10);
        changeEnergy(-8);
        changeHunger(3);
    }
}
class Parrot extends Pet{
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public Parrot() {
        super();
    }

    @Override
    void play() {
        System.out.println(getName()+" is shredding its toys...");
        changeHappiness(15);
        changeEnergy(-5);
        changeHunger(+2);
    }
}
class Hamster extends Pet{
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public Hamster() {
        super();
    }

    @Override
    void play() {
        System.out.println(getName()+" is running on its wheel...");
        changeHappiness(35);
        changeEnergy(-20);
        changeHunger(+25);
    }
}
