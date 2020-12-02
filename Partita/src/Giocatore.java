import java.io.Serializable;

public class Giocatore implements Serializable {

    String nome;

    public Giocatore(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Giocatore{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
