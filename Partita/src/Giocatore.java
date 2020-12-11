import java.io.Serializable;
import java.util.*;

public class Giocatore implements Serializable {

    public String nome;
    public int posizione;
    public boolean inGioco=true;
    public String risposta;

    public Giocatore(String nome, int posizione) {
        this.nome = nome;
        this.posizione = posizione;
    }

    public void SavePosizione() {

    }

    public void Spostati(int posizione){

    }

    public void Interrompi(String risposta) {
        System.out.println("Vuoi interrompere e uscire dal gioco? Digita Si per uscire o No per continuare");
        risposta = in.nextString();
        if(risposta == "Si") {

        }
        else {
            System.out.println("Continua pure la partita");
        }

    }

    @Override
    public String toString() {
        return "Giocatore{" +
                "nome='" + nome + '\'' +
                ", posizione=" + posizione +
                '}';
    }
}
