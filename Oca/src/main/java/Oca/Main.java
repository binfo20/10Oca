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
import static java.lang.System.out;
import java.util.Scanner;












/***
 * MI pare andiamo bene.
 * Manca il javadoc --> Messo
 * Togliete i file .class dal controllo di git, � inutile e spreca banda
 * (cfr. gitignore)
 * Riguardardate l'idea "CasellaSpeciale". Al momento non c'� tanto,
 * serve solo a marcare la sua esistenza (e potete usare .getClass() senza
 * creare il metodo isSpeciale()
 */

public class Main {
    Giocatore classifica[] = new Giocatore[4]; /**classifica dei giocatori*/
    boolean Gioco=true; /**Effettuo dei controlli tramite questa variabile*/

    public boolean isGioco() {
        return Gioco;
    }

    public void setGioco(boolean gioco) {
        Gioco = gioco;
    }

    public void setClassifica(Giocatore[] classifica) {
        this.classifica = classifica;
    }

    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        /**
         * Per ora il main crea un giocatore ed un dado, lo lancia,
         * le impostazioni salvano il giocatore e lo riprendono
         * */
        int nGiocatori;
        String nom;
         String risposta=" ";
         boolean controll=false;
        Giocatore [] g = new Giocatore[4];
        System.out.println("Quanti giocatori partecipano?");
        nGiocatori=in.nextInt();
        for(int i=0;i<nGiocatori;i++){
        System.out.println("Inserisci il nome del  partecipante");
                  nom=in.next();
                  g[i] = new Giocatore(nom,1);
        }
        Dado d = new Dado();
        Campo tab= new Campo();
        while( controll=false  ){
        for(int j=0;j<nGiocatori;j++){
            
          if (g[j].inGioco==false){
          tab.doEffects(g, j,nGiocatori);
          }
          else{
         System.out.println("vuoi continuare? si/no"); 
         while(risposta != "si" && risposta != "no"){
         System.out.println("Inserisci la risposta, si o no?"); 
         risposta=in.next();
         }
         if (risposta == "no"){
         g[j].Interrompi();
         break;
        }
        d.lancia();
        out.println(d.toString());
        g[j].Spostati(d.risultato);
        if(g[j].posizione==31 || g[j].posizione==52){
         g[j].inGioco=false;   
        }
        tab.doEffects(g, j,nGiocatori);
        
        
        
        if(g[j].posizione<=63){
        break;    
        }
        
          }
        }
        for(int l=0; l<nGiocatori;l++){
        if(g[l].posizione<=63){
        System.out.println(g[l].nome + "Hai vinto!"); 
        controll=true;  
        }    
        }
       
        }
        Impostazioni i = new Impostazioni();
      //  out.println(i.Salva(g[0]));
      //  out.println(i.Salva(g[1]));
       // out.println(i.Riprendi(g[0]));
      //  out.println(i.Riprendi(g[1]));
      //  out.println(i.Esci(g));
    }

}