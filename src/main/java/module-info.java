module fr.afpa.app {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.afpa.app to javafx.fxml;
    opens fr.afpa.controllers;
    opens fr.afpa.entites;
    opens fr.afpa.outils;
    exports fr.afpa.app;
}