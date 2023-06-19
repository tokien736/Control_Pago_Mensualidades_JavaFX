/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package mensualidad.control;

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
            primaryStage.setScene(scene);
            primaryStage.show();            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }        

    public static void main(String[] args) {
        launch();
    }


}



