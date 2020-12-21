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
public class Dado {
    private short risultato;
    private short facce = 6;

    public short lancia(){
        risultato = (short)(Math.random() * facce + 1);
        return risultato;
    }

    public int getRisultato(){
     return risultato;   
    }
    
    @Override
    public String toString() {
        return "Dado{" +
                "risultato=" + risultato +
                '}';
    }
}
