package fr.afpa.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class ControllerAfficherExemplaire implements Initializable {

    @FXML
    private Button btnRetour;

    @FXML
    private Label lblBibliotheque;

    @FXML
    private Label lblCodeFiche;

    @FXML
    private Label lblCommentaires;

    @FXML
    private Label lblDispo;

    @FXML
    private Label lblEmplacement;

    @FXML
    private Label lblIsbn;

    @FXML
    private Label lblNumExemplaire;

    @FXML
    private Label lblRole;

    @FXML
    private Label lblTheme;

    @FXML
    private Label lblTitre;

    @FXML
    private Font x3;

    @FXML
    private Font x31;

    @FXML
    private Color x4;

    @FXML
    private Color x41;

    @FXML
    void modifierAdherent(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub

    }

}
