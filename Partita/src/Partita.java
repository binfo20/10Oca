import java.io.Serializable;
import static java.lang.System.*;

public class Partita implements Serializable {

    public static void main (String[] args) {
        out.println("Sono il Main!");
        Giocatore g = new Giocatore("Mario");
        Dado d = new Dado();
        d.lancia();
        out.println(d.toString());
        Impostazioni i = new Impostazioni();
        out.println(i.Salva(g));
        out.println(i.Riprendi(g));
    }

}
