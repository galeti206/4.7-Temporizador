package es.ieslosmontecillos.appusotemporizador;

import es.ieslosmontecillos.componentes_galvezdiego.Temporizador;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class AppUsoTemporizadorController implements Initializable {

    @FXML
    private Temporizador temporizador;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        temporizador.play();
    }
}