import java.io.*;

public class Impostazioni implements Serializable {

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
        return "Riprende a giocare "+ g.toString() ;
    }

    public String Esci(){
        return "PARTITA FINITA";
    }
}
