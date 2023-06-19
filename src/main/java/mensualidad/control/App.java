/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package mensualidad.control;

<<<<<<< HEAD
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import javafx.stage.Stage;

/**
 *
 * @author PC-Jose
 */
public class App extends Application {
    private Stage primaryStage;
    private BorderPane SildeBar;
    
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Mensualidad App");
        
        initSildeBar();
 
    }
    
    private void initSildeBar() {
        try {
            // Cargar el root layout el archivo file
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/mensualidad/vista/SildeBar.fxml"));
            SildeBar = (BorderPane) loader.load();

            //Visualizar la escena que contiene el root layout 
            Scene scene = new Scene(SildeBar);
=======
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class App extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Pagos De Mensualidad App");
        
        initSideBar();
 
    }
    private void initSideBar() {
        try {
            // Cargar el root layout el archivo file
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/mensualidad/vista/SideBar.fxml"));
            rootLayout = (BorderPane) loader.load();

            //Visualizar la escena que contiene el root layout 
            Scene scene = new Scene(rootLayout);
>>>>>>> frontend
            primaryStage.setScene(scene);
            primaryStage.show();            
        } catch (IOException e) {
            e.printStackTrace();
<<<<<<< HEAD
        }        
    }    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }


    
}
=======
        }
    }        

    public static void main(String[] args) {
        launch();
    }


}



>>>>>>> frontend
