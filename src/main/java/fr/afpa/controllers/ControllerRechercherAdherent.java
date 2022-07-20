package fr.afpa.controllers;

import fr.afpa.app.App;
import fr.afpa.entites.Adherent;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
//import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TitledPane;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.ResourceBundle;

/**
 * The type Controller rechercher adherent.
 */
public class ControllerRechercherAdherent implements Initializable {

    /**
     * Bouton consulter fiche adhérent.
     */
    @FXML
    private Button btnConsulterFicheAdherent;

    /**
     * Bouton de retour au menu principal.
     */
    @FXML
    private Button btnMenuPrincipal;

    /**
     * Bouton permettant de rechercher l'adhérent.
     */
    @FXML
    private Button btnRechercherAdherent;

    /**
     * Bouton permettant de valider l'adhérent.
     */
    @FXML
    private Button btnValiderAdherent;

    /**
     * Label affichant si la cotisation est à jour.
     */
    @FXML
    private Label lblCotisationAJour;

    /**
     * Label affichant la date de fin de cotisation.
     */
    @FXML
    private Label lblDateFinCotisation;

    /**
     * Label affichant le nom de l'adhérent.
     */
    @FXML
    private Label lblNomAdherent;

    /**
     * Label affichant le prénom de l'adhérent.
     */
    @FXML
    private Label lblPrenomAdherent;

    /**
     * Label affichant si le rôle de l'utilisateur.
     */
    @FXML
    private Label lblRole;

    /**
     * Label cotisation.
     */
    @FXML
    private Label lblCotisation;

    /**
     * Table des prêts en cours.
     */
    @FXML
    private TableView<String[]> tablePretsEnCours;

    /**
     * Colonne de l'auteur de la tablePretsEnCours.
     */
    @FXML
    private TableColumn<String[], String> columnAuteur;

    /**
     * Colonne Titre de la tablePretsEnCours.
     */
    @FXML
    private TableColumn<String[], String> columnTitre;

    /**
     * Colonne dateEmprunt de la tablePretsEnCours.
     */
    @FXML
    private TableColumn<String[], String> columnDateEmprunt;

    /**
     * TitlesPane de l'adhérent.
     */
    @FXML
    private TitledPane titledPaneAdherent;

    /**
     * Zone de saisie du numéro d'adhérent.
     */
    @FXML
    private TextField txtNumAdherent;

    /**
     * Menu Bar.
     */
    @FXML
    private MenuBar menuBar;

    /**
     * Font.
     */
    @FXML
    private Font x3;

    /**
     * Font.
     */
    @FXML
    private Color x4;

    /* Activation des boutons Recherche, Consulter la fiche de l'adhérent
    et Valider lorsqu'un numéro d'adhérent est saisi
    * */

    /**
     * Activer boutons.
     */
    @FXML
    void activerBoutons() {
        btnRechercherAdherent.setDisable(!idAdherentEstValide());
        btnConsulterFicheAdherent.setDisable(!idAdherentEstValide());
        btnValiderAdherent.setDisable(!idAdherentEstValide());
    }

    /**
     * Consulter fiche adherent.
     */
    @FXML
    void consulterFicheAdherent() {
        afficherFicheAdherent();
    }

    /**
     * On click menu principal.
     */
    @FXML
    void onClickMenuPrincipal() {

    }

    /**
     * Rechercher adherent.
     */
    @FXML
    void rechercherAdherent() {

        Adherent jean = new Adherent(
                "1234",
                "Neymar",
                "Jean",
                "1 rue du four - 59000 Marmusots",
                "06.01.02.03.04",
                "2022-07-17");

        afficherInfoAdherent(jean);

    }

    /**
     * Valider adherent.
     */
    @FXML
    void validerAdherent() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                App.class.getResource("/fxml/EmprunterLivre.fxml"));
        Stage stage = (Stage) (menuBar.getScene().getWindow());
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Menu principal");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(final URL location, final ResourceBundle resources) {

        btnRechercherAdherent.setDisable(true);
        btnConsulterFicheAdherent.setDisable(true);
        btnValiderAdherent.setDisable(true);
        lblCotisation.setVisible(false);
        lblDateFinCotisation.setVisible(false);

    }
    /**
     * Constante de longueur max du numéro d'adhérent
     */
    private static final int LONGUEUR_MAX_NUM_ADHERENT = 11;
    private boolean idAdherentEstValide() {
        return !txtNumAdherent.getText().equals("")
                && txtNumAdherent.getLength() < LONGUEUR_MAX_NUM_ADHERENT;
    }

    private boolean abonnementEstPerime(final Adherent adherent) {
        return LocalDate.parse(
                adherent.getPerimeLe()).isBefore(LocalDate.now());
    }

    private boolean numAdherentEstConnu(final Adherent adherent) {
        return txtNumAdherent.getText().equals(adherent.getNumAdherent());
    }

    private void afficherInfoAdherent(final Adherent adherent) {
        if (numAdherentEstConnu(adherent)) {
            lblNomAdherent.setText(adherent.getNomAdherent());
            lblPrenomAdherent.setText(adherent.getPrenomAdherent());
            creerTableauEmpruntsJean();

            if (abonnementEstPerime(adherent)) {
                lblCotisationAJour.setText("Non");
                lblCotisation.setVisible(true);
                lblDateFinCotisation.setVisible(true);
                lblDateFinCotisation.setText(adherent.getPerimeLe());
            } else {
                lblCotisationAJour.setText("Oui");
                lblCotisation.setVisible(false);
            }

        } else {
            String headerTxt = "Ce numéro d'adhérent est inconnu !";
            String contentTxt = "Merci de vérifier "
                    + "et saisir un nouveau numéro d'adhérent.";
            fenetreErreur(headerTxt, contentTxt);
            txtNumAdherent.setText("");
        }
    }
    private void fenetreErreur(final String headerTxt,
                               final String contentTxt) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Erreur !");
        alert.setHeaderText(headerTxt);
        alert.setContentText(contentTxt);
        alert.showAndWait();
    }

    /**
     * The Stage.
     */
    Stage stage;

    private void afficherFicheAdherent() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource(
                    "/fxml/afficherAdherent.fxml"));

            Scene scene2 = new Scene(fxmlLoader.load());
            Stage stage2 = new Stage();
            stage2.setScene(scene2);
            stage2.initModality(Modality.APPLICATION_MODAL);
            stage2.initOwner(stage);

            stage2.show();

        } catch (IOException e) {
            System.out.println("Impossible d'ouvrir la fenêtre !");
        }
    }

    private void creerTableauEmpruntsJean() {
        String[][] livresEmpruntes = {{"Java pour les nuls",
                "Barry Burd", "12/07/2022"},
                {"Un autre livre", "BB", "12/07/2022"}};
        ObservableList<String[]> data = FXCollections.observableArrayList();
        data.addAll(Arrays.asList(livresEmpruntes));

        for (int i = 0; i < livresEmpruntes.length; i++) {
            final int colNo = i;

            columnTitre.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(
                        final TableColumn.CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[colNo - 1]));
                }
            });
            columnAuteur.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(
                        final TableColumn.CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[colNo]));
                }
            });
            columnDateEmprunt.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(
                        final TableColumn.CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[colNo + 1]));
                }
            });
        }

        tablePretsEnCours.setItems(data);

    }
}




