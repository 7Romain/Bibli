package fr.afpa.controllers;

import fr.afpa.app.App;
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

import static fr.afpa.outils.Utile.lireBib;
import static fr.afpa.outils.Utile.lireTheme;

/**
 * The type Controller stat.
 */
public class ControllerStat implements Initializable {
    private static final String TAB_Theme = "Tableau par thème";
    private static final String TAB_LIVRE = "Tableau par livre";
    private static final String GRAF_THEME = "Graphique par thème";

    @FXML
    private TableColumn colDescription;

    @FXML
    private ComboBox cbxVue;
    @FXML
    private Button btnMenuPrincipal;
    @FXML
    private ComboBox cbxAnnee;
    @FXML
    private Label lblTitre;
    @FXML
    private ComboBox cbxBib;
    @FXML
    private Button btnAnnuler;
    @FXML
    private Button btnImprimer;
    @FXML
    private TableView<Theme> tabTheme;
    @FXML
    private Button btnValiderBot;
    @FXML
    private Button btnValiderTop;
    @FXML
    private Label lblRole;
    @FXML
    private AnchorPane panResu;
    @FXML
    private TableView tabLivres;
    @FXML
    private Label lblDate;
    @FXML
    private TableColumn colCodeTheme;
    @FXML
    private TableColumn colTheme;
    @FXML
    private TableColumn colNbEmpruntLivre;
    @FXML
    private TableColumn ColTitre;
    @FXML
    private TableColumn colISBN;
    @FXML
    private TableColumn colNbExemplaire;
    @FXML
    private TableColumn ColAuteur;
    @FXML
    private TableColumn colNbEmpruntTheme;
    @FXML
    private TableColumn colThemeLivre;
    @FXML
    private MenuBar menuBar;

    /**
     * On click valider.
     * rend visible les boutons voulus et le paneau de résultat
     * rend invisible les boutons non voulus
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
            }
            case GRAF_THEME -> {
                tabLivres.setVisible(false);
                tabTheme.setVisible(false);
            }

        }
    }

    /**
     * On click menu principal.
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
     */
    @FXML
    public void onClickPrint() {
    }
}
