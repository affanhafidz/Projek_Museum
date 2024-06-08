module com.example.projek_musem {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.projek_musem to javafx.fxml;
    exports com.example.projek_musem;
}