/**
 * 13/07/2022.
 *
 * @author
 */

module fr.afpa.app {
    requires javafx.controls;
    requires javafx.fxml;

    opens fr.afpa.App to javafx.fxml;
    opens fr.afpa.controllers;
    opens fr.afpa.entites;

    exports fr.afpa.App;
}
