/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxoca;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


/**
 *
 * @author gramm
 */
public class FxOCA extends Application implements Initializable {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLGiocoDellOca.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @FXML
    private Circle g1 = new Circle();
    @FXML
    private Circle g2 = new Circle();
    @FXML
    private Circle g3 = new Circle();
    @FXML
    private Circle g4  = new Circle();
    @FXML
    private TextField G1 = new TextField("");
    @FXML
    private TextField G2 = new TextField("");
    @FXML
    private TextField G3 = new TextField("");
    @FXML
    private TextField G4 = new TextField("");
    @FXML
    private Label Schermo = new Label();
    @FXML
    private Rectangle dado1 = new Rectangle();
    @FXML
    private Rectangle dado2 = new Rectangle();
    @FXML
    private Rectangle dado3 = new Rectangle();
    @FXML
    private Rectangle dado4 = new Rectangle();
    @FXML
    private Rectangle dado5 = new Rectangle();
    @FXML
    private Rectangle dado6 = new Rectangle();

    private String[] nomi = new String[4];
    private String str=null;
    private int n_part=0;
    private double  g1x=0;
    private double  g1y=0;
    private double  g2x=35;
    private double  g2y=50;
    private double  g3x=90;
    private  double  g3y=20;
    private double  g4x=90;
    private double  g4y=50;
    private int dado;
    private int turno=1;
    private int pos1=1;
    private int pos2=1;
    private int pos3=1;
    private int pos4=1;
    @FXML
    private void onNameButtonPressed() throws IOException{
        n_part = 0;

        str = G1.getText();
        nomi[0]=str;

        str = G2.getText();
        nomi[1]=str;

        str = G3.getText();
        nomi[2]=str;

        str = G4.getText();
        nomi[3]=str;

        for(int i=0;i<4;i++) {
            if(!nomi[i].equals("")){
                n_part++;
            }
        }


        Schermo.setText("n partecipanti :" +  n_part);

    }

    @FXML
    private void onDadoButtonPressed() throws  IOException {
        dado = (int) (Math.random() * 6) + 1;
        Schermo.setText("Risultato dado:" + dado);
        double gx = 0, gy = 0;
        int pos = 0;
        switch (turno) {
            case 1:
                if (pos1 != 63) {
                    for (int i = 0; i < dado; i++) {
                        if (pos1 >= 1 && pos1 <= 8 || pos1 >= 28 && pos1 <= 34 || pos1 >= 48 && pos1 <= 52 || pos1 >= 60 && pos1 <= 63) {
                            g1x = g1.getCenterX() + 77;
                            g1.setCenterX(g1x);
                        }
                        if (pos1 >= 15 && pos1 <= 22 || pos1 >= 39 && pos1 <= 44 || pos1 >= 55 && pos1 <= 58) {
                            g1x = g1.getCenterX() - 77;
                            g1.setCenterX(g1x);
                        }
                        if (pos1 >= 9 && pos1 <= 14 || pos1 >= 35 && pos1 <= 38 || pos1 >= 53 && pos1 <= 54) {
                            g1y = g1.getCenterY() + 51;
                            g1.setCenterY(g1y);
                        }
                        if (pos1 >= 23 && pos1 <= 27 || pos1 >= 45 && pos1 <= 47 || pos1 == 59) {
                            g1y = g1.getCenterY() - 51;
                            g1.setCenterY(g1y);
                        }
                        pos1++;

                        if (pos1 == 63) {
                            break;
                        }
                    }
                }
                break;
            case 2:
                if(pos2 != 63) {
                    for (int i = 0; i < dado; i++) {
                        if (pos2 >= 1 && pos2 <= 8 || pos2 >= 28 && pos2 <= 34 || pos2 >= 48 && pos2 <= 52 || pos2 >= 60 && pos2 <= 63) {
                            g2x = g2.getCenterX() + 77;
                            g2.setCenterX(g2x);
                        }
                        if (pos2 >= 15 && pos2 <= 22 || pos2 >= 39 && pos2 <= 44 || pos2 >= 55 && pos2 <= 58) {
                            g2x = g2.getCenterX() - 77;
                            g2.setCenterX(g2x);
                        }
                        if (pos2 >= 9 && pos2 <= 14 || pos2 >= 35 && pos2 <= 38 || pos2 >= 53 && pos2 <= 54) {
                            g2y = g2.getCenterY() + 51;
                            g2.setCenterY(g2y);
                        }
                        if (pos2 >= 23 && pos2 <= 27 || pos2 >= 45 && pos2 <= 47 || pos2 == 59) {
                            g2y = g2.getCenterY() - 51;
                            g2.setCenterY(g2y);
                        }
                        pos2++;

                        if (pos2 == 63) {
                            break;
                        }
                    }
                    break;
                }
            case 3:
                if(pos3 != 63) {
                    for (int i = 0; i < dado; i++) {
                        if (pos3 >= 1 && pos3 <= 8 || pos3 >= 28 && pos3 <= 34 || pos3 >= 48 && pos3 <= 52 || pos3 >= 60 && pos3 <= 63) {
                            g3x = g3.getCenterX() + 77;
                            g3.setCenterX(g3x);
                        }
                        if (pos3 >= 15 && pos3 <= 22 || pos3 >= 39 && pos3 <= 44 || pos3 >= 55 && pos3 <= 58) {
                            g3x = g3.getCenterX() - 77;
                            g3.setCenterX(g3x);
                        }
                        if (pos3 >= 9 && pos3 <= 14 || pos3 >= 35 && pos3 <= 38 || pos3 >= 53 && pos3 <= 54) {
                            g3y = g3.getCenterY() + 51;
                            g3.setCenterY(g3y);
                        }
                        if (pos3 >= 23 && pos3 <= 27 || pos3 >= 45 && pos3 <= 47 || pos3 == 59) {
                            g3y = g3.getCenterY() - 51;
                            g3.setCenterY(g3y);
                        }
                        pos3++;

                        if (pos3 == 63) {
                            break;
                        }
                    }
                }
                break;
            case 4:
                if(pos4 != 63) {
                    for (int i = 0; i < dado; i++) {
                        if (pos4 >= 1 && pos4 <= 8 || pos4 >= 28 && pos4 <= 34 || pos4 >= 48 && pos4 <= 52 || pos4 >= 60 && pos4 <= 63) {
                            g4x = g4.getCenterX() + 77;
                            g4.setCenterX(g4x);
                        }
                        if (pos4 >= 15 && pos4 <= 22 || pos4 >= 39 && pos4 <= 44 || pos4 >= 55 && pos4 <= 58) {
                            g4x = g4.getCenterX() - 77;
                            g4.setCenterX(g4x);
                        }
                        if (pos4 >= 9 && pos4 <= 14 || pos4 >= 35 && pos4 <= 38 || pos4 >= 53 && pos4 <= 54) {
                            g4y = g4.getCenterY() + 51;
                            g4.setCenterY(g4y);
                        }
                        if (pos4 >= 23 && pos4 <= 27 || pos4 >= 45 && pos4 <= 47 || pos4 == 59) {
                            g4y = g4.getCenterY() - 51;
                            g4.setCenterY(g4y);
                        }
                        pos4++;

                        if (pos4 == 63) {
                            break;
                        }
                    }
                }
                break;
        }
        if(turno == n_part){
            turno = 1;
        }
        else turno++;


        /*switch(turno){
            case 1 :
                gx=g1x;
                gy=g1y;
                pos=pos1;
                break;
            case 2 :
                gx=g2x;
                gy=g2y;
                pos=pos2;
                break;
            case 3 :
                gx=g3x;
                gy=g3y;
                pos=pos3;
                break;
            case 4 :
                gx=g4x;
                gy=g4y;
                pos=pos4;
                break;
        }

        for(int i=0;i<dado;i++){
            if(pos>=1 && pos<=8 || pos>=28 && pos<=34 || pos>=48 && pos<=52 || pos>=60 && pos<=63){
                gx=gx+75;
            }
            else if(pos>=15 && pos<=22 || pos>=39 && pos<=44 || pos>=55 && pos<=58 ){
                gx=gx-75;
            }
            else if(pos>=9 && pos<=14 || pos>=35 && pos<=38 || pos>=53 && pos<=54 ){
                gy=gy+50;
            }
            else if(pos>=23 && pos<=27 || pos>=45 && pos<=47 || pos==59 ){
                gy=gy-50;
            }

            pos++;

            if (pos==63){
                break;
            }
        }
        switch(turno){
            case 1 :
                g1.setCenterX(g1.getCenterX()+75);
                break;
            case 2 :
                g2.setCenterX(g2x);
                g2.setCenterY(g2y);
                break;
            case 3 :
                g3.setCenterX(g3x);
                g3.setCenterY(g3y);
                break;
            case 4 :
                g4.setCenterX(g4x);
                g4.setCenterY(g4y);
                break;
        }
        switch(turno){
            case 1 :
                g1x=gx;
                g1y=gy;
                pos1=pos;
                break;
            case 2 :
                g2x=gx;
                g2y=gx;
                pos2=pos;
                break;
            case 3 :
                g3x=gx;
                g3y=gx;
                pos3=pos;
                break;
            case 4 :
                g4x=gx;
                g4y=gx;
                pos4=pos;
                break;
        }*/

        dado1.setOpacity(0);
        dado2.setOpacity(0);
        dado3.setOpacity(0);
        dado4.setOpacity(0);
        dado5.setOpacity(0);
        dado6.setOpacity(0);
        if (dado == 1) {
            dado1.setOpacity(1);
        } else if (dado == 2) {
            dado2.setOpacity(1);
        } else if (dado == 3) {
            dado3.setOpacity(1);
        } else if (dado == 4) {
            dado4.setOpacity(1);
        } else if (dado == 5) {
            dado5.setOpacity(1);
        } else {
            dado6.setOpacity(1);
        }
    }
    /**
     *** Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
