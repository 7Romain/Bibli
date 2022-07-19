package fr.afpa.controllers;

import fr.afpa.app.App;
import fr.afpa.entites.Livre;
import fr.afpa.entites.Theme;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

import static fr.afpa.outils.Utile.*;

/**
 * Controller de la fiche de stat.
 */
public class ControllerStat implements Initializable {
    /**
     * Constante de "Tableau par thème".
     */
    private static final String TAB_Theme = "Tableau par thème";
    /**
     * Constante de "Tableau par livre".
     */
    private static final String TAB_LIVRE = "Tableau par livre";
    /**
     * Constante de "Graphique par thème".
     */
    private static final String GRAF_THEME = "Graphique par thème";
    /**
     * The Menu bar.
     */
    @FXML
    public MenuBar menuBar;
    /**
     * bouton pour retourner au menu principal.
     */
    @FXML
    private Button btnMenuPrincipal;
    /**
     * combo box pour choisir la vue .
     */
    @FXML
    private ComboBox cbxVue;
    /**
     * combo box pour choisir l'année .
     */
    @FXML
    private ComboBox cbxAnnee;
    /**
     * combo box pour choisir la bibliotheque .
     */
    @FXML
    private ComboBox cbxBib;
    /**
     * label du titre de la recherche.
     */
    @FXML
    private Label lblTitre;
    /**
     * label date bas de page.
     */
    @FXML
    private Label lblDate;
    /**
     * label role en bas de page.
     */
    @FXML
    private Label lblRole;
    /**
     * bouton annuler.
     */
    @FXML
    private Button btnAnnuler;
    /**
     * bouton imprimer.
     */
    @FXML
    private Button btnImprimer;
    /**
     * bouton valider en bas.
     */
    @FXML
    private Button btnValiderBot;
    /**
     * bouton valider en haut.
     */
    @FXML
    private Button btnValiderTop;
    /**
     * pane contnant le résultat.
     */
    @FXML
    private AnchorPane panResu;

    /**
     * tableau de theme
     */
    @FXML
    private TableView<Theme> tabTheme;
    /**
     * colonne de code de theme.
     */
    @FXML
    private TableColumn colCodeTheme;
    /**
     * colonne de theme.
     */
    @FXML
    private TableColumn colTheme;
    /**
     * colonne de description de theme.
     */
    @FXML
    private TableColumn colDescription;
    /**
     * colonne de nombre d'emprunt par theme.
     */
    @FXML
    private TableColumn colNbEmpruntTheme;

    /**
     * tableau de livre .
     */
    @FXML
    private TableView tabLivres;
    /**
     * colonne de l'isbn du livre.
     */
    @FXML
    private TableColumn colISBN;
    /**
     * colonne du titre du livre.
     */
    @FXML
    private TableColumn ColTitre;
    /**
     * colonne de l'auteur du livre.
     */
    @FXML
    private TableColumn ColAuteur;
    /**
     * colonne du theme du livre.
     */
    @FXML
    private TableColumn colThemeLivre;
    /**
     * colonne du nombre d'exemplaire du livre.
     */
    @FXML
    private TableColumn colNbExemplaire;
    /**
     * colonne du nombre d'emprunt du livre.
     */
    @FXML
    private TableColumn colNbEmpruntLivre;

    /**
     * On click valider.
     * rend visible les boutons voulus et le paneau de résultat
     * rempli selon le choix de vue le tableau correspondant
     */
    @FXML
    public void onClickValider() {
        lblTitre.setText(String.format("%s pour %s : %s", cbxBib.getValue(), cbxAnnee.getValue(), cbxVue.getValue()));
        panResu.setVisible(true);
        btnImprimer.setVisible(true);
        btnAnnuler.setVisible(true);
        btnValiderTop.setVisible(true);

        String vue = (String) cbxVue.getValue();
        switch (vue) {
            case TAB_Theme -> {
                tabTheme.setVisible(true);
                tabLivres.setVisible(false);
                ObservableList<Theme> listTheme = lireTheme();
                colCodeTheme.setCellValueFactory(new PropertyValueFactory<Theme, String>("codeTheme"));
                colTheme.setCellValueFactory(new PropertyValueFactory<Theme, String>("theme"));
                colDescription.setCellValueFactory(new PropertyValueFactory<Theme, String>("descripTheme"));
                colNbEmpruntTheme.setCellValueFactory(new PropertyValueFactory<Theme, String>("nbEmprunt"));
                tabTheme.setItems(listTheme);
            }
            case TAB_LIVRE -> {
                tabLivres.setVisible(true);
                tabTheme.setVisible(false);
                ObservableList<Livre> listLivre = lireLivre();
                colISBN.setCellValueFactory(new PropertyValueFactory<Theme, String>("IsbnLivre"));
                ColTitre.setCellValueFactory(new PropertyValueFactory<Theme, String>("titreLivre"));
                ColAuteur.setCellValueFactory(new PropertyValueFactory<Theme, String>("auteur"));
                colThemeLivre.setCellValueFactory(new PropertyValueFactory<Theme, String>("codTheme"));
                colNbExemplaire.setCellValueFactory(new PropertyValueFactory<Theme, String>("nbExemplaire"));
                colNbEmpruntLivre.setCellValueFactory(new PropertyValueFactory<Theme, String>("nbEmprunt"));
                tabLivres.setItems(listLivre);
            }
            case GRAF_THEME -> {
                tabLivres.setVisible(false);
                tabTheme.setVisible(false);
            }
        }
    }

    /**
     * On click menu principal.
     * retour au menu principal
     *
     * @throws IOException the io exception
     */
    @FXML
    public void onClickMenuPrincipal() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/fxml/menuPrincipal.fxml"));
        Stage stage = (Stage) (menuBar.getScene().getWindow());
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Emprunter");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * initialise la page.
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        init();
    }

    /**
     * initialise les Combo box;
     * avec la list des bibliothèque grace a l'appel de la fonction lireBib() dans la classe Utile
     * avec les 5 dernieres années (presente incluse)
     * avec les types de vue possibles
     * rend visible les boutons voulus
     * rend invisible les boutons non voulus
     */
    private void init() {
        ArrayList<String> lstBib = lireBib();
        cbxBib.getItems().addAll(lstBib);
        cbxBib.setValue(cbxBib.getItems().get(0));

        int anneeEnCour = LocalDate.now().getYear();
        ArrayList<Integer> lstAnnee = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            lstAnnee.add(anneeEnCour - i);
        }
        cbxAnnee.getItems().addAll(lstAnnee);
        cbxAnnee.setValue(cbxAnnee.getItems().get(0));

        ArrayList<String> lstVue = new ArrayList<>();
        lstVue.add(TAB_Theme);
        lstVue.add(TAB_LIVRE);
        lstVue.add(GRAF_THEME);
        cbxVue.getItems().addAll(lstVue);
        cbxVue.setValue(cbxVue.getItems().get(0));

        panResu.setVisible(false);
        btnImprimer.setVisible(false);
        btnAnnuler.setVisible(false);
        btnValiderTop.setVisible(false);
        tabTheme.setVisible(false);
        tabLivres.setVisible(false);
        lblDate.setText(String.valueOf(LocalDate.now()));

    }

    /**
     * On click annuler.
     * rend visible les boutons voulus
     * rend invisible les boutons non voulus
     */
    @FXML
    public void onClickAnnuler() {
        panResu.setVisible(false);
        btnImprimer.setVisible(false);
        btnAnnuler.setVisible(false);
        btnValiderTop.setVisible(false);
    }

    /**
     * On click print.
     *
     * @TODO à faire
     */
    @FXML
    public void onClickPrint() {
    }
}
