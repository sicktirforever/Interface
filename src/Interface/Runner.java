package Interface;

public class Runner {
    public static void main(String[] args) {
        Animals dog = new Dog("Rex", "soricar");
        dog.makeSound();
        Canine dog2 = new Dog("Dingo", "lup cehoslovac");
        dog2.easyTrained();
        Animals snake = new Snake("Sasaila", "piton");
        ((Snake) snake).movement();
        ((Snake) snake).blood();
        Taratoare snake2 = new Snake("Spanchilau", "anaconda");
        ((Snake) snake2).makeSound();

        Reptile dragon = new DragonComodo(200, 20, 130);
        ((DragonComodo) dragon).atack(100);

        dragon.blood();

        Animals wolf = new Wolf("GigiKent", "negru", 4);
        System.out.println(((Wolf) wolf).getName() +" "+ ((Wolf) wolf).getCuloare() +" "+ ((Wolf) wolf).getVarsta());

       Reptile dragon2 = new DragonComodo(200, 20, 130);
        ((DragonComodo) dragon2).damageOverTime(30);
        ((Dog) dog).caineleAtaca();

    }
    }



