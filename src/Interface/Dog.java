package Interface;

public class Dog implements Canine {
    private int damage;
    private int hitpoints;
    private boolean isAlive;
    private String name;
    private String rasa;

    public Dog(String name, String rasa){
        this.name = name;
        this.rasa = rasa;
    }
    @Override
    public void easyTrained() {
        System.out.println("Sunt foarte usor de dresat");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof! Woof!");

    }

    @Override
    public void makeBabies() {
        System.out.println("Naste pui vii");

    }
    public void caineleAtaca(){
        Snake snake = new Snake("Sasaila", "piton");

        int counter = 0;
        for (int i = 1; i<=10; i++) {

            damage = new Random().randomWithRange(30 , 70);
            int snakeHitpoints = new Random().randomWithRange(40,100);


            if (damage < snakeHitpoints) {
                snake.setAlive(true);
                System.out.println("Traieste ca un barosan!");
                counter +=1;
            } else {
                snake.setAlive(false);
                System.out.println("Ne pare rau domnul " + snake.getName() + " din rasa " + snake.getRasa() + " este istorie");
            }

        }
        System.out.println(snake.getName() + " supravietuieste de " +counter + " din 10 ori");


    }
}
