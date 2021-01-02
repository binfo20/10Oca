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
import javafx.stage.Stage;
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
          
    
    //public static String[] nomi = new String[4];
   // String str;
    
    @FXML
    private void onSaveButtonPressed() {
    controllo.setText("Salva");    
    }
    @FXML
      private void onGameButtonPressed(ActionEvent event) throws IOException{
        Parent mia_home=FXMLLoader.load(getClass().getResource("FXMLTabellone.fxml"));
        Scene scene_home= new Scene(mia_home);
        Stage app_home = (Stage)((Node)event.getSource()).getScene().getWindow();
        app_home.setScene(scene_home);
        app_home.show();
     
    }
      
    @FXML
    private void onRescueButtonPressed() {
    controllo.setText("menù salvataggi");    
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
     //str = giocatore1.getText(); 
       // nomi[0]=str;
        
        //str = giocatore2.getText(); 
       // nomi[1]=str;
        
        //str = giocatore3.getText(); 
        //nomi[2]=str;
        
        //str = giocatore4.getText(); 
       // nomi[3]=str;
}
