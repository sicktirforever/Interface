package Interface;

public class Birds implements Animals{
    @Override
    public void makeSound() {

    }

    @Override
    public void makeBabies() {

    }
    enum Bird{
        PELICAN("Delta Dunarii"),
        BARZA("In zona de campie"),
        STRUT("Africa"),
        FAZAN("Zona de padure");

        private String habitat;
        Bird(String habitat){
            this.habitat = habitat;
        }

        public String getHabitat() {
            return habitat;
        }
    }
}
