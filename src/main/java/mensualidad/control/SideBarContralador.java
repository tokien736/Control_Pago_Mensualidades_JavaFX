package mensualidad.control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author PC-Jose
 */
public class SideBarContralador implements Initializable{

    @FXML
    private BorderPane bp;
    @FXML
    private AnchorPane ap;
    public void initialize(URL url, ResourceBundle rb){
        
    }

    @FXML
    private void estudiantes(MouseEvent event) {
        bp.setCenter(ap);
    }

    @FXML
    private void pago(MouseEvent event) {
        cargarPaginas("pagos");
    }

    @FXML
    private void reporte(MouseEvent event) {
        cargarPaginas("reportes");
        
    }

    @FXML
    private void configuraciones(MouseEvent event) {
        cargarPaginas("configuraciones");
        
    }

    @FXML
    private void cerrarSesion(MouseEvent event) {
    }
    
    private void cargarPaginas(String page){
        Parent root = null;
        try{
            root = FXMLLoader.load(getClass().getResource("/mensualidad/vista/" + page + ".fxml"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
        bp.setCenter(root);
    }    
}
