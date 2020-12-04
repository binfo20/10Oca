import java.io.Serializable;
import java.util.Random;

public class Dado implements Serializable {
    public Dado(int s){
        facce = s;
        generatore = new Random();
    }
    public Dado(){
        facce = 4;
        generatore = new Random();
    }
    public int lancia(){
        return 1 + generatore.nextInt(facce);
    }
    private Random generatore;
    private int facce;
}
