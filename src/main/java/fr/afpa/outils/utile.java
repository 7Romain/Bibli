package fr.afpa.outils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class Utile {

    private Utile() {
    }

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

    public static LocalDateTime getDateTime() {
        return LocalDateTime.now();

    }

    public static String getDateTimeString() {
        final String DATE_FORMATTER_JOUR = "dd/MM/yyyy";
        final String DATE_FORMATTER_HEURE = "HH'h'mm";
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatterJ = DateTimeFormatter.ofPattern(DATE_FORMATTER_JOUR);
        DateTimeFormatter formatterH = DateTimeFormatter.ofPattern(DATE_FORMATTER_HEURE);
        String formatDateTimeJ = localDateTime.format(formatterJ);
        String formatDateTimeH = localDateTime.format(formatterH);
        return String.format("Le %s à %s ", formatDateTimeJ, formatDateTimeH);

    }

}
