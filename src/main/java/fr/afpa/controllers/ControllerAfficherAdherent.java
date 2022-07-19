package fr.afpa.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.stream.BaseStream;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * The type Controller afficher adherent.
 */
public class ControllerAfficherAdherent implements Initializable {

    /**
     * The Stage.
     */
    Stage stage;
    @FXML
    private Button btnImpreimerTicket;
    @FXML
    private Button btnModifier;
    @FXML
    private Button btnRetour;
    @FXML
    private Label lblAdresse;
    @FXML
    private Label lblNbPretEnCours;
    @FXML
    private Label lblNom;
    @FXML
    private Label lblNumAdherent;
    @FXML
    private Label lblPrenom;
    @FXML
    private Label lblPretRetard;
    @FXML
    private Label lblRole;
    @FXML
    private Label lblTel;
    @FXML
    private TableView<?> tblPretEnCours;
    @FXML
    private Font x3;
    @FXML
    private Font x31;
    @FXML
    private Color x4;
    @FXML
    private Color x41;

    /**
     * Imprimer ticket.
     *
     * @param event the event
     */
    @FXML
    void imprimerTicket(ActionEvent event) {
        imprimer();

    }

    /**
     * Modifier adherent.
     *
     * @param event the event
     */
    @FXML
    void modifierAdherent(ActionEvent event) {

    }

    /**
     * Retour vers rechercher adherent.
     *
     * @param event the event
     */
    @FXML
    void retourVersRechercherAdherent(ActionEvent event) {

    }

    private void imprimer() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/fxml/impressionTicket.fxml"));

            Scene scene2 = new Scene(fxmlLoader.load());
            Stage stage2 = new Stage();
            stage2.setTitle("Imprimer");
            stage2.setScene(scene2);
            stage2.initModality(Modality.APPLICATION_MODAL);
            stage2.initOwner(stage);

            stage2.show();

        } catch (IOException e) {
            System.out.println("impossible d'ouvrir la fenetre");
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
