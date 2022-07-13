module fr.afpa.App {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.afpa.App to javafx.fxml;
    exports fr.afpa.App;
}