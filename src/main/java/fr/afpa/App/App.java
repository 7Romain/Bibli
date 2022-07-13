package fr.afpa.App;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

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
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/fxml/afficherAdherent.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
