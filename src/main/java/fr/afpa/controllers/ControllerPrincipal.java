package fr.afpa.controllers;

import fr.afpa.App.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerPrincipal {

    @FXML
    private Button btnEmprunt;
    @FXML
    private Button btnFonds;
    @FXML
    private Button btnStat;
    @FXML
    private MenuItem itmAbout;
    @FXML
    private MenuBar menuBar;
    private Stage stage;
    private Scene scene;

    @FXML
    void ouvrirPageEmprunt(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/fxml/afficherAdherent.fxml"));
        stage = (Stage) (menuBar.getScene().getWindow());
        scene = new Scene(fxmlLoader.load());
        stage.setTitle("Emprunter");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void ouvrirPageFonds(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/fxml/afficherAdherent.fxml"));
        stage = (Stage) (menuBar.getScene().getWindow());
        scene = new Scene(fxmlLoader.load());
        stage.setTitle("Consulter le fonds");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void ouvrirPageStats(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/fxml/afficherAdherent.fxml"));
        stage = (Stage) (menuBar.getScene().getWindow());
        scene = new Scene(fxmlLoader.load());
        stage.setTitle("Statistiques");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openAbout(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("A propos");
        alert.setHeaderText("A propos de l'application");
        alert.setContentText("L'appli Mégathèque a été réalisée par Romain Benejam, Jérôme Chaput, Damien Gruffeille et Julien Jégo à l'Afpa de Beaumont.\rElle est vachement bien.\r© Afpa 2022 ");
        alert.showAndWait();
    }

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

}

