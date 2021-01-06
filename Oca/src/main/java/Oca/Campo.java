/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oca;
import java.util.ArrayList;
/**
 *
 * @author gramm
 */
public class Campo {
    ArrayList <Casella> c = new ArrayList <>(64);
    ArrayList <Integer> cTurni=new ArrayList <>(0);

    public void inizializzaCTurni() {
        for (int i = 0; i<4 ; i++) {
            cTurni.add(0);
        }
    }
    public void inizializzaC(){
        for (int i = 0; i < c.toArray().length; i++) {
            Casella casella = new Casella();
            casella.setTipo("Normale");
            c.add(casella);
        }
    }
    public void setC(ArrayList <Casella> c) {
        this.c = c;
        Casella casella = new Casella();
        c.set(6,casella).setTipo("Ponte");
        //c.set(19,casella).setTipo("Locanda");
        c.set(31,casella).setTipo("Pozzo");
        c.set(42,casella).setTipo("Labirinto");
        c.set(52,casella).setTipo("Prigione");
        c.set(58,casella).setTipo("Scheletro");
        c.set(63,casella).setTipo("Arrivo");
    }

     public String ShowEffects(int a){
            String str="";
            int pos=a;
            switch(pos){
        case  6: str="Sei caduto dal ponte"; break;
        //case 19: str="Ti fermi alla locanda";  break;
        case 31: str="Cadi nel pozzo"; break;
        case 52: str="Ti perdi nel labirinto"; break;
        case 42: str="Sei stato catturato";  break;
        case 58: str="Lo scheletro ti spaventa a morte";  break;
        case 63 :str="Hai vinto";  break;
            }
            return str;
        }
     
    public void doEffects(ArrayList<Giocatore> g, Giocatore giocatoreCopia, int j,int nGiocatori){
        switch(g.get(j).getPosizione()){
        case 6: g.get(j).setPosizione(g.get(j).getPosizione()-3);  break;
        //case 19:  Pause(g,giocatoreCopia,j); break;
        case 31: Jail(g,giocatoreCopia,j, nGiocatori);
        case 52: Jail(g,giocatoreCopia,j,nGiocatori); break;
        case 42:  giocatoreCopia.setPosizione(39);  g.set(j, giocatoreCopia);  break;
        case 58:  giocatoreCopia.setPosizione(1); g.set(j,giocatoreCopia);  break;
        case 63:   break;
        
        }
    }
        public void Jail(ArrayList <Giocatore> g, Giocatore giocatore, int j,int nGiocatori){

            for (int i=0;i<nGiocatori;i++){
               if(g.get(i).getPosizione()==g.get(j).getPosizione() && i!=j){
                   int temp;
                   g.set(i,giocatore).setInGioco(true);
                   temp = giocatore.getPosizione();
                   temp ++;
                   g.set(i,giocatore).setPosizione(temp);
               }
            }
      
        }
        
        public void Pause(ArrayList <Giocatore> g, Giocatore giocatore,int j){
        g.set(j, giocatore).setInGioco(false);
        int temp;
        System.out.println("turno bloccato"+cTurni.get(j));
        cTurni.set(j,cTurni.get(j)+1);
       // temp++;
       // cTurni.set(j, temp);
        if( cTurni.get(j)==3){
        g.set(j, giocatore).setInGioco(true);
        cTurni.set(j, 0);
        }
        else{ 
        }
        //temp = cTurni.get(j);
        //temp++;
        //cTurni.set(j, temp);
        }

}
