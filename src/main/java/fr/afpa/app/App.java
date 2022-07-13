package fr.afpa.app;

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
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        //System.out.println(App.class.getResource("/fxml/rechercherAdherent.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/fxml/rechercherAdherent.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
}
