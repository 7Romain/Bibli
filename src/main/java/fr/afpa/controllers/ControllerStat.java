package fr.afpa.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import static fr.afpa.outils.Utile.lireBib;

public class ControllerStat implements Initializable {

    @FXML
    private ComboBox cbxVue;
    @FXML
    private Button btnMenuPrincipal;
    @FXML
    private ComboBox cbxAnnee;
    @FXML
    private ComboBox cbxBib;
    @FXML
    private Button btnValider;

    @FXML
    public void onClickValider() {
    }

    @FXML
    public void onClickMenuPrincipal() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        init();
    }

    private void init() {
        try {
            ArrayList<String> lstBib = lireBib();
            cbxBib.getItems().addAll(lstBib);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
