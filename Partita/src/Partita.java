import static java.lang.System.out;

/***
 * MI pare andiamo bene.
 * Manca il javadoc --> Messo
 * Togliete i file .class dal controllo di git, è inutile e spreca banda
 * (cfr. gitignore)
 * Riguardardate l'idea "CasellaSpeciale". Al momento non c'è tanto,
 * serve solo a marcare la sua esistenza (e potete usare .getClass() senza
 * creare il metodo isSpeciale()
 */

public class Partita {
    Giocatore classifica[] = new Giocatore[4]; /**classifica dei giocatori*/
    boolean Gioco=true; /**Effettuo dei controlli tramite questa variabile*/

    public boolean isGioco() {
        return Gioco;
    }

    public void setGioco(boolean gioco) {
        Gioco = gioco;
    }

    public void setClassifica(Giocatore[] classifica) {
        this.classifica = classifica;
    }

    public static void main (String[] args) {
        /**
         * Per ora il main crea un giocatore ed un dado, lo lancia,
         * le impostazioni salvano il giocatore e lo riprendono
         * */
        out.println("Sono il Main!");
        Giocatore [] g = new Giocatore[4];
        g[1] = new Giocatore("Bartolo",1);
        g[0] = new Giocatore("Mario",3);
        Dado d = new Dado();
        d.lancia();
        out.println(d.toString());
        Impostazioni i = new Impostazioni();
        out.println(i.Salva(g[0]));
        out.println(i.Salva(g[1]));
        out.println(i.Riprendi(g[0]));
        out.println(i.Riprendi(g[1]));
        out.println(i.Esci(g));
    }

}
