import java.io.Serializable;
import java.util.Random;

public class Dado implements Serializable {
    private short facce = 6;
    private Random generatore = new Random();
    public int lancia(){
        return 1 + generatore.nextInt(facce);
    }

}
