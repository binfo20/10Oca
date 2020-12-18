/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolatrice;

/**
 *
 * @author gramm
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Fxcontrollo implements Initializable {
    
    @FXML private TextField operando1;
    @FXML private TextField operando2;
    @FXML private Label risultato;
    @FXML private Label operazione;
          private String ris;
    
    @FXML
    private void onCleanButtonPressed() {
        operando1.setText("");
        operando2.setText("");
        risultato.setText("");
    }
    
    @FXML
    private void onAdditionButtonPressed(){ 
        ris = Integer.toString(getO1()+getO2()); 
        operazione.setText("+");
    }
    
    @FXML
    private void onSubtractionButtonPressed(){ 
        ris = Integer.toString(getO1()-getO2()); 
        operazione.setText("-");
    }
    
    @FXML
    private void onMultiplicationButtonPressed(){ 
        ris = Integer.toString(getO1()*getO2()); 
        operazione.setText("X");
    }
    
    @FXML
    private void onDivisionButtonPressed(){ 
        ris = Integer.toString(getO1()/getO2()); 
        operazione.setText(":");
    }
    
    @FXML 
    private void onEqualButtonPressed(){ risultato.setText("Risultato = " + ris); }
    
    private int getO1(){ return Integer.parseInt(operando1.getText()); }
    private int getO2(){ return Integer.parseInt(operando2.getText()); }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
