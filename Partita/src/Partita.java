import java.io.Serializable;
import static java.lang.System.*;

/***
 * MI pare andiamo bene.
 * Manca il javadoc
 * Togliete i file .class dal controllo di git, è inutile e spreca banda
 * (cfr. gitignore)
 * Riguardardate l'idea "CasellaSpecilae". Al momento non c'è tatnto,
 * serve solo a marcare la sua esistenza (e potete usare .getClass() senza
 * creare il metodo isSpeciale()
 */

public class Partita implements Serializable {

    public static void main (String[] args) {
        out.println("Sono il Main!");
        Giocatore m = new Giocatore("Mario", 1);
        Giocatore b = new Giocatore("Bartolo", 7);
        Dado d = new Dado();
        d.lancia();
        out.println(d.toString());
        Impostazioni i = new Impostazioni();
        out.println(i.Salva(m));
        out.println(i.Salva(b));
        out.println(i.Riprendi(m));
        out.println(i.Riprendi(b));
        out.println(i.Esci());
    }

}
