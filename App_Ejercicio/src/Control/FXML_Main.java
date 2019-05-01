
package Control;

import app_ejercicio.App_Ejercicio;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class FXML_Main implements Initializable, ControlledScreen {

    @FXML
    ImageView imagen;
    
    @FXML
    Button Bingresar;
    @FXML
    Button Bconsultar;
    
    @FXML
    Label App_Ejercicio;
    
    ScreensController myController;
        
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       imagen.setImage(new Image("/fondo/ejercicios.jpg"));
    }    

    @Override
    public void setScreenParent(ScreensController screenPage) {
    
        myController = screenPage;
    
    }
    
    @FXML
    public void setScreenAdd(ActionEvent event){
        myController.setScreen(App_Ejercicio.screen2ID);
    }

    @FXML
    public void setScreenSelect(ActionEvent event){
        myController.setScreen(App_Ejercicio.screen3ID);
    }
   
    
    
    
}
