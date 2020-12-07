

public class Campo {
    Casella[] c =new Casella[63];

    public void setC(Casella[] c) {
        this.c = c;
        c[6].tipo="ponte";
    }
}
