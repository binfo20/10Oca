import java.io.*;

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
            output = new ObjectOutputStream(new FileOutputStream("Giocatore "+g.nome+".dat"));
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
            ois = new ObjectInputStream(new FileInputStream("Giocatore "+g.nome+".dat"));
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
        g.inGioco=true;
        return "Riprende a giocare "+ g.toString() ;
    }

    /**
     Funzione Esci
     Variabile di ritorno String
     Finisce la partita //da finire, aspetto le altre classi per le prove
     */
    public String Esci(Giocatore[] g){
        for(int i=0;i<4;i++)if(g[i]!=null)g[i].inGioco=false;
        return "PARTITA FINITA";
    }
}
