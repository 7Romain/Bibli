package fr.afpa.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerRechercherAdherent implements Initializable {

    @FXML
    private Button btnRechercher;

    @FXML
    private TextField txtFIDAdherent;

    @FXML
    private Label lblTest;

    @FXML
    private Font x1;

    @FXML
    private Color x2;

    @FXML
    private Font x3;

    @FXML
    private Color x4;

    @FXML
    void rechercher(ActionEvent event) {
        rechercherAdherent();

    }

    private void rechercherAdherent(){
        lblTest.setText(txtFIDAdherent.getText());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}



