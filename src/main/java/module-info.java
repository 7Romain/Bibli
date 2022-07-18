module fr.afpa.App {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.afpa.App to javafx.fxml;
    opens fr.afpa.controllers;
    exports fr.afpa.App;
}