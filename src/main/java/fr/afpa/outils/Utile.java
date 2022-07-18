package fr.afpa.outils;

import fr.afpa.entites.Theme;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
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

    public static ObservableList<Theme> lireTheme() {
        try {
            FileReader fileReader = new FileReader("src/main/resources/csv/lstThèmes");
            LineNumberReader lineNumberReader
                    = new LineNumberReader(fileReader);
            String ligneLue;
            String codeTheme;
            String theme;
            String description;
            ArrayList<Theme> listTheme = new ArrayList<>();
            do {
                ligneLue = lineNumberReader.readLine();
                if (ligneLue != null) {
                    codeTheme = ligneLue.substring(0, ligneLue.indexOf(","));
                    ligneLue = ligneLue.substring(ligneLue.indexOf(","));
                    theme = ligneLue.substring(0, ligneLue.indexOf(","));
                    description = ligneLue.substring(ligneLue.indexOf(","));
                    listTheme.add(new Theme(codeTheme, theme, description));
                }
            } while (ligneLue != null);

            ObservableList<Theme> data = FXCollections.observableArrayList(listTheme);
            return data;
        } catch (NullPointerException npe) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setHeaderText(npe.getMessage());
        } catch (FileNotFoundException fnfe) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setHeaderText(fnfe.getMessage());
            alert.setContentText("fichier non trouvé !");

        } catch (IOException ioe) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(e.getMessage());
            alert.setTitle("Erreur");
            System.out.println(e.getMessage());
        }
        return null;
    }
}