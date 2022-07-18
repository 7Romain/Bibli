package fr.afpa.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerRechercherAdherent implements Initializable {

    @FXML
    private Button btnConsulterFicheAdherent;

    @FXML
    private Button btnMenuPrincipal;

    @FXML
    private Button btnRechercherAdherent;

    @FXML
    private Button btnValiderAdherent;

    @FXML
    private Label lblCotisationAJour;

    @FXML
    private Label lblDateFinCotisation;

    @FXML
    private Label lblNom;

    @FXML
    private Label lblPrenom;

    @FXML
    private Label lblRole;

    @FXML
    private TitledPane titledPaneAdherent;

    @FXML
    private TextField txtFIDAdherent;

    @FXML
    private Font x3;

    @FXML
    private Color x4;

    @FXML
    void activerBoutons(final InputMethodEvent event) {

    }

    @FXML
    void onClickMenuPrincipal(final MouseEvent event) {

    }

    @FXML
    void rechercherAdherent(final ActionEvent event) {
        //rechercherAdherent();

    }

    @FXML
    void validerAdherent(final ActionEvent event) {

    }

    @Override
    public void initialize(final URL location, final ResourceBundle resources) {
        btnRechercherAdherent.setDisable(true);
        btnConsulterFicheAdherent.setDisable(true);
        btnValiderAdherent.setDisable(true);

    }
}



