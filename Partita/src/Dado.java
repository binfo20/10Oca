import java.io.Serializable;
import java.util.Random;

public class Dado implements Serializable {
    public short risultato;
    private short facce = 6;

    public short lancia(){
        risultato = (short)(Math.random() * facce + 1);
        return risultato;
    }

    @Override
    public String toString() {
        return "Dado{" +
                "risultato=" + risultato +
                '}';
    }

    private Random generatore;

}
