/**
 * 13/07/2022.
 *
 * @author
 */

module fr.afpa.app {
    requires javafx.controls;
    requires javafx.fxml;

    opens fr.afpa.app to javafx.fxml;
    opens fr.afpa.controllers;

    exports fr.afpa.app;
}
