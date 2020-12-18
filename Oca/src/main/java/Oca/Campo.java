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
public class Campo {
    Casella[] c = new Casella[64];

    public void setC(Casella[] c) {
        this.c = c;
        c[6].tipo="Ponte";
        c[19].tipo="Locanda";
        c[31].tipo="Pozzo";
        c[42].tipo="Labirinto";
        c[52].tipo="Prigione";
        c[58].tipo="Scheletro";
        c[63].tipo="Arrivo";
    }

    public void doEffects(Giocatore g[],int j){
        switch(g[j].posizione){
        case 6: g[j].posizione=g[j].posizione-3;  break;
        case 19:   break;       
        case 31:   break;
        case 42:  g[j].posizione=39;  break;
        case 52:                    break;
        case 58: g[j].posizione=1;  break;
        case 63:   break;
        
        }

    }
}
