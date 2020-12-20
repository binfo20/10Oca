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
public class CasellaSpeciale extends Casella{

    boolean speciale=true;


    public void isSpeciale(){
        if(getTipo().equals("Normale"))speciale=true;
        else speciale=false;
    }

    public String setEffects(Giocatore g){
    if(speciale){
        switch(getTipo()){
        case "ponte": g.posizione=g.posizione-3;  break;
        case "locanda":   break;       
        case "pozzo":   break;
        case "labirinto":  g.posizione=39;  break;
        case "prigione":                    break;
        case "scheletro": g.posizione=1;  break;
        case "arrivo":   break;
        
        }
        
        
        
        //Scrivi tutti gli effetti (se la casella è ponte allora posizione giocatore diminuisce) <-- esempio
        }
    return "Nessun Effetto";
    }
}