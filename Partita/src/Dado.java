import java.io.Serializable;
import java.util.Random;

public class Dado implements Serializable {
    public short risultato;
    private short facce = 6;
    private Random generatore = new Random();

    public int lancia(){
        return 1 + generatore.nextInt(facce);
    }

    @Override
    public String toString() {
        return "Dado{" +
                "risultato=" + risultato +
                ", facce=" + facce +
                '}';
    }
}
