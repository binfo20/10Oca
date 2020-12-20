import java.io.Serializable;

public class Casella  implements Serializable {
    private String tipo = "Normale";

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String toString() {
        return "Casella{" +
                "tipo='" + tipo ;}
}

