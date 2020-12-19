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
    int[] cTurni=new int[4];

    public void inizializza(){
    for (int i=0;i<4;i++){
    cTurni[i]=0;
    }
    }
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

    public void doEffects(Giocatore g[],int j,int nGiocatori){
        switch(g[j].posizione){
        case 6: g[j].posizione=g[j].posizione-3;  break;
        case 19:  Pause(g,j); break;       
        case 31:    Jail(g,j,nGiocatori); break;
        case 42:  g[j].posizione=39;  break;
        case 52:  Jail(g,j,nGiocatori);                 break;
        case 58: g[j].posizione=1;  break;
        case 63:   break;
        
        }
    }
        public void Jail(Giocatore g[],int j,int nGiocatori){
           for (int i=0;i<nGiocatori;i++){
               if(g[i].posizione==g[j].posizione && i!=j){
               g[i].inGioco=true;
               g[i].posizione++;
               }
            }
            
            
            
            
            
            
        }
        
        public void Pause(Giocatore g[],int j){
        cTurni[j]++;
        if( cTurni[j]==3){
        g[j].inGioco=true;
        cTurni[j]=0;       
        }
        cTurni[j]++;
        
     
       
                        }
        
        
        
        
        
    
}
