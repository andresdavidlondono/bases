/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_ejercicio;

import Control.ScreensController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Jhonny Londoño G
 */
public class App_Ejercicio extends Application {
    
    public static String screen1ID = "main";
    public static String screen1File = "/Vistas/Main.fxml";
    
    public static String screen2ID = "ingresar";
    public static String screen2File = "/Vistas/Ingresar.fxml";
    
    public static String screen3ID = "consultar";
    public static String screen3File = "/Vistas/Consultar,fxml";
    
    public static Stage stage1;

    
    
    
    
    @Override
    public void start(Stage stage) {
        
        ScreensController contenerdorScreens = new ScreensController();
        contenerdorScreens.loadScreen(App_Ejercicio.screen1ID, App_Ejercicio.screen1File);
        contenerdorScreens.loadScreen(App_Ejercicio.screen2ID, App_Ejercicio.screen2File);
        contenerdorScreens.loadScreen(App_Ejercicio.screen3ID, App_Ejercicio.screen3File);
        
        contenerdorScreens.setScreen(App_Ejercicio.screen1ID);
        
        Group root = new Group();
        root.getChildren().addAll(contenerdorScreens);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        App_Ejercicio.initStage(stage);
        
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
    private static void initStage(Stage stage) {
    
        App_Ejercicio.stage1 = stage;
    
    }
}
