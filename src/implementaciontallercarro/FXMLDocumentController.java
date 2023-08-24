/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciontallercarro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.MenuBar;
import datos.Clientes;
import modelo.Cola;

/**
 *
 * @author nicolas.ramirez_ara
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label tiempoTotalL;
    @FXML
    private Label edadL;
    @FXML
    private Label tiempoTranscurridoL;
    @FXML
    private Label reporteL;
    
    @FXML
    private TextField tiempoTotalTXT;
    
    Cola<Clientes> colaClientes;
    
    @FXML
    private void iniciarClientes(ActionEvent event) {
         int tiempoEsperaC = tiempoTotalTXT();
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
