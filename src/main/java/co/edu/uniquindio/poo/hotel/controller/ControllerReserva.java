package co.edu.uniquindio.poo.hotel.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerReserva implements Initializable {
    @FXML
    private TextField textId;

    @FXML
    private Button btnReservar;

    @FXML
    private TextField textNombre;

    @FXML
    void guardarReserva(ActionEvent event){}
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
