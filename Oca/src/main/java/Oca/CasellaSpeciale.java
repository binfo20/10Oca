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

    private boolean speciale=true;


    public void isSpeciale(){
        if(getTipo().equals("Normale"))speciale=false;
        else speciale=true;
    }

   /* public String setEffects(Giocatore g , int j){
    if(speciale){
        switch(getTipo()){
        case "ponte": g.setPosizione(g.getPosizione()-3);  break;
        case "locanda":   break;       
        case "pozzo":   break;
        case "labirinto":  g.setPosizione(39);  break;
        case "prigione":                    break;
        case "scheletro": g.setPosizione(1);  break;
        case "arrivo":   break;
        
        }
    }
    }
*/
        public String ShowEffects(Giocatore g){
            String str="";
            int pos=g.getPosizione();
            switch(pos){
        case  6: str="Sei caduto dal ponte"; break;
        case 19: str="Ti fermi alla locanda";  break;       
        case 31: str="Cadi nel pozzo"; break;
        case 52: str="Ti perdi nel labirinto"; break;
        case 42: str="Sei stato catturato";  break;
        case 58: str="Lo scheletro ti spaventa a morte";  break;
        case 63 :str="Hai vinto";  break;
            }
            return str;
        }
        
        
        
        //Scrivi tutti gli effetti (se la casella è ponte allora posizione giocatore diminuisce) <-- esempio
        }
    
    
