/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oca;

/*
 *
 * @author gramm
 */
import java.io.Serializable;

public class Giocatore implements Serializable {

    private String nome;
    private int posizione;
    private boolean inGioco=true;
    private int turni=3;

    public Giocatore(String nome, int posizione) {
        this.nome = nome;
        this.posizione = posizione;
    }

    public void setInGioco(boolean inGioco) {
        this.inGioco = inGioco;
    }

    public boolean getInGioco(){
        return inGioco;
    }

    public int getPosizione() {
        return posizione;
    }

    public void setPosizione(int posizione) {
        this.posizione = posizione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void SavePosizione() {

    }

    public void Spostati(int posizione){
    this.posizione=posizione+this.posizione;
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
