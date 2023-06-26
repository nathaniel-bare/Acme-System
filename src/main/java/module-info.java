module com.example.acmesystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.acmesystem to javafx.fxml;
    exports com.example.acmesystem;
}