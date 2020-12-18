/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oca;

/**
 *
 * @author gramm
 */
import java.io.Serializable;

public class Giocatore implements Serializable {

    public String nome;
    public int posizione;
    public boolean inGioco=true;
    public int turni=3;

    public Giocatore(String nome, int posizione) {
        this.nome = nome;
        this.posizione = posizione;
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
