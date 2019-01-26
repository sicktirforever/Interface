package Interface;

public class Wolf implements Canine{

    private String name;
    private String culoare;
    private int varsta;

    public Wolf(String name, String culoare, int varsta){
        this.name = name;
        this.culoare = culoare;
        this.varsta = varsta;
    }
    public String getName() {
        return name;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getVarsta() {
        return varsta;
    }


    @Override
    public void easyTrained() {
        System.out.println("Se pot dresa dar nu chiar asa usor ca si cainii");
    }

    @Override
    public void makeSound() {
        System.out.println("Howl");

    }

    @Override
    public void makeBabies() {
        System.out.println("Naste pui vii");

    }

}
