import java.util.ArrayList;


public class Campo {
    ArrayList <Casella> c = new ArrayList<Casella>(64);

    public void setC(ArrayList <Casella> c) {
        this.c = c;
        c.set(6,);
        c[19].tipo="Locanda";
        c[31].tipo="Pozzo";
        c[42].tipo="Labirinto";
        c[52].tipo="Prigione";
        c[58].tipo="Scheletro";
        c[63].tipo="Arrivo";
    }

    public void doEffects(Casella[] c, Giocatore g){


    }
}
