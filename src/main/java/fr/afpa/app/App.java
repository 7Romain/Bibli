package fr.afpa.app;

import fr.afpa.controllers.ControllerRechercherAdherent;
import fr.afpa.entites.Adherent;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
// Salut
public class App extends Application {
    public static void main(String[] args) {
        System.out.println("Hello World23!");

        System.out.println("Hello World23!");
        System.out.println("Hello World23!");

        Adherent jean = new Adherent(
                "1234567890",
                "Neymar",
                "Jean",
                "1 rue du four - 59000 Marmusots",
                "06.01.02.03.04",
                "2022-07-17");

        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/fxml/rechercherAdherent.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
}
