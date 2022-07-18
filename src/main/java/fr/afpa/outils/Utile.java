package fr.afpa.outils;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.ArrayList;

public class Utile {

    public static void exitApp(String message) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Quitter ?");
        alert.setHeaderText(message);
        alert.setContentText("Êtes-vous sur de vouloir quitter l'application");

        if (alert.showAndWait().get() == ButtonType.OK) {
            System.exit(0);
        }

    }

    public static ArrayList<String> lireBib() {
        ArrayList<String> lstBib = new ArrayList<String>();
        lstBib.add("Toutes les Bibliotèques");
        lstBib.add("Bibliotèques de Marmusot");
        lstBib.add("Bibliotèques à la con");
        return lstBib;
    }

//    public static ArrayList<String> lireLivre() {
//
//    }

//    public static ArrayList<String> lireThème() {
//
//    }

}
