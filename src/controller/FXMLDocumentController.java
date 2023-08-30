/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
 * @author daniel.santana codigo 2160550
 * @author nelson.duque codigo 2215922
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
    private WebView webview; //Permite tener un contenedor HTML
    
    WebEngine webEngine; //Permite agregar contenido al webview
    
    @FXML
    private void encolarClientes(ActionEvent event) {
        int tiempoEsperaC = Integer.parseInt(tiempoTotalTXT.getText());
     

        colaClientes.encolar(new Cliente (nombreD, modeloC, tiempoExperaC));
    }
    @FXML
    private void mostrarClientes(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
        mostrarTAxT.setText(colaClientes.toString());
       
    }
    @FXML
    private void mostrarClientesHTML(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
       String html = Tools.convertirColaAHtml(colaClientes);
       webEngine.loadContent(html);
       
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        colaClientes = new Cola<>();
        webEngine = webview1.getEngine(); //Aqui es en donde va a salir todo lo que se haga.
    }    
    
}
