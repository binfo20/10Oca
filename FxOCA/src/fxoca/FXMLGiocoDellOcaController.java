/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxoca;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author gramm
 */
public class FXMLGiocoDellOcaController implements Initializable {

    
   @FXML private TextField G1;
   @FXML private TextField G2;
   @FXML private TextField G3;
   @FXML private TextField G4;
   @FXML private Label Schermo;
   String[] nomi = new String[4];
   String str;
   
    @FXML
      private void onNameButtonPressed() throws IOException{
       str = G1.getText(); 
       nomi[0]=str;
        
       str = G2.getText(); 
       nomi[1]=str;
        
       str = G3.getText(); 
       nomi[2]=str;
        
       str = G4.getText(); 
       nomi[3]=str;
     
    }
    
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
