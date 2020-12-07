import java.io.Serializable;

public class Giocatore implements Serializable {

    String nome;
    int posizione;
    boolean inGioco=true;

    public Giocatore(String nome, int posizione) {
        this.nome = nome;
        this.posizione = posizione;
    }

    public void SavePosizione() {

    }

    public void Spostati(int posizione){

    }

    public void Interrompi() {

    }

    @Override
    public String toString() {
        return "Giocatore{" +
                "nome='" + nome + '\'' +
                ", posizione=" + posizione +
                ", inGioco=" + inGioco +
                '}';
    }
}
