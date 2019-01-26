package Interface;

public class DragonComodo implements Animals,Reptile {

    private int hitpoints;
    private int armor;
    boolean alive;
    private int damage;
    private int poisonDamage;
    public DragonComodo(int hitpoints, int armor,int damage){
        this.hitpoints = hitpoints;
        this.armor = armor;
        this.damage = damage;
    }

    @Override
    public void blood() {
        System.out.println("are sangele rece");

    }

    @Override
    public void makeSound() {
        System.out.println("habar nu am cum face asta");

    }

    @Override
    public void makeBabies() {
        System.out.println("depune oua");

    }

    public int getHitpoints() {
        return hitpoints;
    }

    public int getArmor() {
        return armor;
    }

    public boolean isAlive() {
        return alive;
    }

    public int getDamage() {
        return damage;
    }

    public void atack(int poisonDamage){
        Jackal jackal = new Jackal(100, 10,120);
        int damage = poisonDamage;
        System.out.println("Damage-ul primit de jackal este: " + damage);
        if (damage < jackal.getHitpoints() + jackal.getArmor()){
            jackal.isAlive(true);
            System.out.println("The jackal is alive");
        }
        else{
            System.out.println("I'm sorry it is history");
        }
    }
    public void damageOverTime(int poisonDamage){
        Jackal jackal = new Jackal(100, 10, 120);
        int hpJacakal = jackal.getHitpoints();
        for (int zile = 1; zile < 5; zile ++){

            hpJacakal = hpJacakal - poisonDamage;
            System.out.println("Hp ramas dupa o zi de la muscatura: " + hpJacakal);
        }
        if (hpJacakal > 0){
            System.out.println("The jackal is alive");
        }
        else {
            System.out.println("I'm sorry it is history");
        }

    }
}
