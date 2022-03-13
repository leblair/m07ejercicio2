module com.example.ejercicio2javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ejercicio2javafx to javafx.fxml;
    exports com.example.ejercicio2javafx;
}