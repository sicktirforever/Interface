package Interface;

public class Random {

    public int randomWithRange(int min, int max){
        int range = (max - min)+ 1;
        return (int) (Math.random() * range) + min;
    }
}
