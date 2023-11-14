module com.example.ud04poot01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ud04poot01 to javafx.fxml;
    exports com.example.ud04poot01;
}