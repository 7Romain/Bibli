
// /**
//  * Hello world!
//  *
//  */
// // Salut
// public class App extends Application {
//     public static void main(String[] args) {
//         System.out.println("Hello World23!");
//         launch(args);

//     }

//     @Override
//     public void start(Stage primaryStage) throws Exception {
//         System.out.println(App.class.getResource("/fxml/afficherAdherent.fxml"));
//         Parent root = FXMLLoader.load(App.class.getResource("/fxml/afficherAdherent.fxml"));
//         Scene scene = new Scene(root);
//         primaryStage.setScene(scene);
//         primaryStage.show();

//     }
// }
package fr.afpa.app;

import java.io.IOException;

import fr.afpa.outils.Utile;
//import fr.afpa.outils.Utile;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        System.out.println(App.class.getResource("/fxml/afficherAdherent.fxml"));
        launch();
    }

    /**
     * lancement de l'interface.
     *
     * @param stage
     */

    @Override
    public void start(final Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/fxml/afficherAdherent.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setOnCloseRequest(event -> {
            event.consume();
            Utile.exitApp("Etes vous sûre ?");
        });
        stage.setTitle("La MÉGATHEQUE de Marmusots");
        stage.setScene(scene);
        stage.show();

    }
}
