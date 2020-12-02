import java.io.Serializable;

public class Partita implements Serializable {

    public static void main (String[] args) {
        System.out.println("Sono il Main!");
        Giocatore g = new Giocatore("Mario");
        Impostazioni i = new Impostazioni();
        System.out.println(i.Salva(g));
    }

}
