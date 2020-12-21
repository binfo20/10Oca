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
import java.io.*;
import java.util.ArrayList;

public class Impostazioni implements Serializable{

    /**
     Funzione Salva
     Parametro Giocatore g
     Variabile di ritorno String
     Crea un file.dat chiamato col nome del giocatore
    */
    public String Salva(Giocatore g){
        ObjectOutputStream output =null;
        try{
            output = new ObjectOutputStream(new FileOutputStream("Giocatore "+g.getNome()+".dat"));
        }
        catch(FileNotFoundException e){

        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            output.writeObject(g);
        }catch(IOException e1){
            e1.printStackTrace();
        }
        try {
            output.close();
        }catch (IOException e2){
            e2.printStackTrace();
        }
        return "Salvo "+ g.toString() ;
    }

    /**
     Funzione Riprendi
     Parametro Giocatore g
     Variabile di ritorno String
     Riprende un file.dat chiamato col nome del giocatore
     */
    public String Riprendi(Giocatore g){
        ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream(new FileInputStream("Giocatore "+g.getNome()+".dat"));
        }catch(FileNotFoundException e){

        } catch (IOException e) {
            e.printStackTrace();
        }
        g = null;
        try{
            g = (Giocatore) ois.readObject();
        }catch(IOException e1){

        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        g.setInGioco(true);
        return "Riprende a giocare "+ g.toString() ;
    }

    /**
     Funzione Esci
     Variabile di ritorno String
     Finisce la partita //da finire, aspetto le altre classi per le prove
     */
    public String Esci(ArrayList <Giocatore> g, Giocatore giocatore){
        for(int i=0;i<4;i++) {
            giocatore.setInGioco(false);
            if (g.get(i) != null) g.set(i, giocatore).setInGioco(false);
        }
        return "PARTITA FINITA";
    }
}
