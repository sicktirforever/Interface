package Interface;

public class Jackal implements Canine{
    private int hitpoints;
    private int armor;
    boolean alive;
    private int damage;

    public Jackal(int hitpoints, int armor, int damage){
        this.hitpoints = hitpoints;
        this.armor = armor;
        this.damage = damage;
    }

    @Override
    public void easyTrained() {
        System.out.println("Este aproape imposibil de dresat");
    }

    @Override
    public void makeSound() {
        System.out.println("Howl");

    }

    @Override
    public void makeBabies() {
        System.out.println("Naste pui vii");

    }

    public int getHitpoints() {
        return hitpoints;
    }

    public int getArmor() {
        return armor;
    }

    public boolean isAlive(boolean b) {
        return alive;
    }

    public int getDamage() {
        return damage;
    }
    public void atack(int damage){

    }
}
