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
