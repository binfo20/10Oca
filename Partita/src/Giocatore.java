import java.io.Serializable;

public class Giocatore implements Serializable {

    public String nome;
    public int posizione;
    public boolean inGioco=true;

    public Giocatore(String nome, int posizione) {
        this.nome = nome;
        this.posizione = posizione;
    }

    public void SavePosizione() {

    }

    public void Spostati(int posizione){

    }

    public void Interrompi( ) {
    inGioco = false;
    }

    @Override
    public String toString() {
        return "Giocatore{" +
                "nome='" + nome + '\'' +
                ", posizione=" + posizione +
                '}';
    }
}
