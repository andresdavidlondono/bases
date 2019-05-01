/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.ConnectBD;
import app_ejercicio.App_Ejercicio;
import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhonny Londoño G
 */
public class FXML_Ingresar {
    
    
    //LABEL
    @FXML
    Label Lusuario;    
    @FXML
    Label Lcontraseña;    
    @FXML
    Label Lnombre1;    
    @FXML
    Label Lnombre2;    
    @FXML
    Label Lapellido1;    
    @FXML
    Label Lapellido2;    
    @FXML
    Label Ltelefono;    
    @FXML
    Label Lcorreo;    
    @FXML
    Label Lestatura;    
    @FXML
    Label Lpeso;    
    @FXML
    Label Ledad;
    
    //BOTONES
    @FXML
    Button Bingresar;
    @FXML
    Button Bvolver;
    
    //TEXTFIELDS
    
    @FXML
    TextField Tusuario;
    @FXML
    TextField Tcontraseña;
    @FXML
    TextField Tnombre1;
    @FXML
    TextField Tnombre2;
    @FXML
    TextField Tapellido1;
    @FXML
    TextField Tapellido2;
    @FXML
    TextField Ttelefono;
    @FXML
    TextField Tcorreo;
    @FXML
    TextField Testatura;
    @FXML
    TextField Tpeso;
    @FXML
    TextField Tedad;
    
    
    ConnectBD connectbd;
    boolean conexion;
    boolean ingresar;
    
    ScreensController myController;
    
     
    public void initialize(URL url, ResourceBundle rb) {
       
        connectbd = new ConnectBD();
    }
    
    
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }
    
    
    public void BInsertar (ActionEvent Event) throws IOException{
        boolean n;
        
        n = false;
        
        if(n == true){
            conexion = connectbd.crearConexion();
            System.out.println(conexion);
            ingresar = connectbd.ejecutarSQL("INSERT INTO Cuenta values('" + Tusuario.getText() + 
                    "','" + Tcontraseña.getText() + "','" + Tnombre1.getText() + "','" + Tnombre2.getText() +
                    "','" + Tapellido1.getText() + "','" + Tapellido2.getText() + "','" + Ttelefono.getText() +
                    "','" + Tcorreo.getText() + "','" + Testatura.getText() + "','" + Tpeso.getText() + "','" + Tedad.getText() + "');");
            if(ingresar){
                JOptionPane.showMessageDialog(null, "La informacion fue insertada con exito.");
                limpiarCampos();
                myController.setScreen(App_Ejercicio.screen1ID);
            }else{
                JOptionPane.showMessageDialog(null, "La informacion no pudo ser insertada.\n" + "Verifique los datos.");
            }
                    
                    
        }
        
    }

    private void limpiarCampos() {
       
        Tusuario.setText("");
        Tcontraseña.setText("");
        Tnombre1.setText("");
        Tnombre2.setText("");
        Tapellido1.setText("");
        Tapellido2.setText("");
        Ttelefono.setText("");
        Tcorreo.setText("");
        Testatura.setText("");
        Tpeso.setText("");
        Tedad.setText("");
       }
    
    
}
