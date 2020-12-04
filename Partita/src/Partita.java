import java.io.Serializable;
import static java.lang.System.*;

public class Partita implements Serializable {

    public static void main (String[] args) {
        out.println("Sono il Main!");
        Giocatore m = new Giocatore("Mario");
        Giocatore b = new Giocatore("Bartolo");
        Dado d = new Dado();
        d.lancia();
        out.println(d.toString());
        Impostazioni i = new Impostazioni();
        out.println(i.Salva(m));
        out.println(i.Salva(b));
        out.println(i.Riprendi(m));
        out.println(i.Riprendi(b));
    }

}
