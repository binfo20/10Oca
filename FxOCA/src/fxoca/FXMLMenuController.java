/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxoca;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author gramm
 */
public class FXMLMenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML private TextField giocatore1;
    @FXML private TextField giocatore2;
    @FXML private TextField giocatore3;
    @FXML private TextField giocatore4;
    @FXML private Label controllo;
          
    @FXML
    private void onSaveButtonPressed() {
    controllo.setText("Salva");    
    }
    @FXML
    private void onGameButtonPressed() {
     controllo.setText("tabellone"); 
    }
    @FXML
    private void onRescueButtonPressed() {
    controllo.setText("menù salvataggi");    
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    
}
