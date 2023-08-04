module com.games.games {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.games.games to javafx.fxml;
    exports com.games.games;
}