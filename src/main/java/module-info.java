module com.example.filmz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.filmz to javafx.fxml;
    exports com.example.filmz;
}