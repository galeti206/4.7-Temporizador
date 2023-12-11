module es.ieslosmontecillos.appusotemporizador {
    requires javafx.controls;
    requires javafx.fxml;
    requires es.ieslosmontecillos.componentes_galvezdiego;

    opens es.ieslosmontecillos.appusotemporizador to javafx.fxml;
    exports es.ieslosmontecillos.appusotemporizador;
}