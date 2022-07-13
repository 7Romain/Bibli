package fr.afpa.outils;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

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

}
