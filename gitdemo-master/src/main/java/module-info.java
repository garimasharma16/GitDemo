module com.example.practicegit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practicegit to javafx.fxml;
    exports com.example.practicegit;
}