package Interface;

public class Snake implements Animals, Taratoare, Reptile{
    private String name;
    private String rasa;
    private int damage;
    private int hitpoints;
    private boolean isAlive;
    public Snake(String name, String rasa){
        this.name = name;
        this.rasa = rasa;
    }
    @Override
    public void makeSound() {
        System.out.println("sssssssssssss");
    }

    @Override
    public void makeBabies() {
        System.out.println("Depune oua");

    }

    @Override
    public void skin() {
        System.out.println("Solzi");

    }

    @Override
    public void movement() {
        System.out.println("Se taraie");

    }

    @Override
    public void blood() {
        System.out.println("Are sangele rece");
    }

    public String getName() {
        return name;
    }

    public String getRasa() {
        return rasa;
    }

    public int getDamage() {
        return damage;
    }

    public int getHitpoints(int hp) {
        return hitpoints;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean setAlive() {
        return isAlive;
    }
}
