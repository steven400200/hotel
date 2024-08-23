module co.edu.uniquindio.poo.hotel {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.hotel to javafx.fxml;
    exports co.edu.uniquindio.poo.hotel;
}