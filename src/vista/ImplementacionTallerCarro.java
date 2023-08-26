/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 *
 * @author nicolas.ramirez_ara
 * @daniel.santana codigo 2160550
 */
public class ImplementacionTallerCarro extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Crear un WebView
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();

        // Cargar el contenido HTML
        String htmlContent = "<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "<title>Tabla HTML en JavaFX</title>"
                + "</head>"
                + "<body>"
                + "<h1>Ejemplo de tabla HTML en JavaFX</h1>"
                + "<table border='1'>"
                + "<tr>"
                + "<th>Encabezado 1</th>"
                + "<th>Encabezado 2</th>"
                + "<th>Encabezado 3</th>"
                + "</tr>"
                + "<tr>"
                + "<td>Dato 1</td>"
                + "<td>Dato 2</td>"
                + "<td>Dato 3</td>"
                + "</tr>"
                + "<tr>"
                + "<td>Dato 4</td>"
                + "<td>Dato 5</td>"
                + "<td>Dato 6</td>"
                + "</tr>"
                + "</table>"
                + "</body>"
                + "</html>";

        webEngine.loadContent(htmlContent);

        // Crear una escena con el WebView
        StackPane root = new StackPane();
        root.getChildren().add(webView);
        Scene scene = new Scene(root, 800, 600);

        // Configurar la ventana principal
        stage.setTitle("Tabla HTML en JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}