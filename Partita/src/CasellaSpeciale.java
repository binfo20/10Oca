

public class CasellaSpeciale extends Casella{

    boolean speciale;


    public void isSpeciale(){
        if(tipo!="Normale")speciale=true;
        else speciale=false;
    }

    public String setEffects(Giocatore g){
    if(speciale == true){
        //Scrivi tutti gli effetti (se la casella è ponte allora posizione giocatore diminuisce) <-- esempio
        }
    return "Nessun Effetto";
    }
}
