module com.example.javafxtp4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.javafxtp4 to javafx.fxml;
    exports com.example.javafxtp4;
}