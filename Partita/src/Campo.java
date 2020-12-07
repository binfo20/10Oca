

public class Campo {
    Casella[] c = new Casella[64];

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

    public void doEffects(Casella[] c, Giocatore g){


    }
}
