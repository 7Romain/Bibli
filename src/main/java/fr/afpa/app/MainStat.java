package fr.afpa.app;

import fr.afpa.outils.Utile;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainStat extends Application {
    public static void main(String[] args) {
        launch();
    }

    /**
     * lancement de l'interface.
     *
     * @param stage
     */

    @Override
    public void start(final Stage stage) throws IOException {
        FXMLLoader fxmlLoader
                = new FXMLLoader(MainStat.class.getResource("/fxml/ConsulterStat.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 300);
        stage.setOnCloseRequest(event -> {
            event.consume();
            Utile.exitApp("Etes vous sùre ?");
        });
        stage.setTitle("La MÉGATHEQUE de Marmusots");
        stage.setScene(scene);
        stage.show();
    }
}
