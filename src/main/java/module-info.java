module com.example.weatherfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.example.weatherfx to javafx.fxml;
    exports com.example.weatherfx;
    exports com.example.weatherfx.visualcrossingCite;
    opens com.example.weatherfx.visualcrossingCite to javafx.fxml;
}