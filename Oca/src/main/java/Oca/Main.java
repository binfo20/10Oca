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

import java.util.ArrayList;
import java.util.Scanner;


/***
 * MI pare andiamo bene.
 * Manca il javadoc --> Messo
 * Togliete i file .class dal controllo di git, è inutile e spreca banda
 * (cfr. gitignore)
 * Riguardardate l'idea "CasellaSpeciale". Al momento non c'è tanto,
 * serve solo a marcare la sua esistenza (e potete usare .getClass() senza
 * creare il metodo isSpeciale()
 */

public class Main {
    ArrayList <Giocatore> classifica = new ArrayList<>(4); /**classifica dei giocatori*/
    private boolean Gioco=true; /**Effettuo dei controlli tramite questa variabile*/

    public boolean isGioco() {
        return Gioco;
    }

    public void setGioco(boolean gioco) {
        Gioco = gioco;
    }

    public void setClassifica(ArrayList <Giocatore> classifica) {
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
        String risposta;
        boolean controll=false;
        Giocatore giocatore;
        ArrayList <Giocatore> g= new ArrayList <>(4);
        System.out.println("Quanti giocatori partecipano?");
        nGiocatori=in.nextInt();
        for(int i=0;i<nGiocatori;i++){
            System.out.println("Inserisci il nome del  partecipante");
            nom=in.next();
            giocatore = new Giocatore(nom, 1);
            g.add(giocatore);
        }
        Dado d = new Dado();
        Campo tab= new Campo();
        tab.inizializzaCTurni();
        while(!controll){
        for(int j=0;j<nGiocatori;j++){
            Giocatore giocatoreCopia = new Giocatore(g.get(j).getNome(), g.get(j).getPosizione());
            giocatoreCopia.setInGioco(g.get(j).getInGioco());
          if (!g.get(j).getInGioco()){
             System.out.println(g.get(j).getNome() + " sei nella casella : "+g.get(j).getPosizione());
          tab.doEffects(g,giocatoreCopia,j,nGiocatori);
          }
          else{
               System.out.println(g.get(j).getNome() + " sei nella casella : "+g.get(j).getPosizione());
              System.out.println("vuoi continuare? si/no");
              risposta=in.next();
              while(!risposta.equalsIgnoreCase("si") && !risposta.equalsIgnoreCase("no")){
                System.out.println("Risposta non chiara, si o no?");
                risposta=in.next();
         }
         if (risposta.equalsIgnoreCase("no")){
             g.get(j).Interrompi();
             break;
        }
        d.lancia();
        out.println(d.toString());
        g.get(j).Spostati(d.getRisultato());
        if(g.get(j).getPosizione()==31 || g.get(j).getPosizione()==52){
         g.set(j,giocatoreCopia).setInGioco(false);
        }
        tab.doEffects(g,giocatoreCopia,j,nGiocatori);
        
        
        
        if(g.get(j).getPosizione()>=63){
        break;    
        }

          }
        }
        for(int l=0; l<nGiocatori;l++){
        if(g.get(l).getPosizione()>=63){
        System.out.println(g.get(l).getNome() + " hai vinto!");
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