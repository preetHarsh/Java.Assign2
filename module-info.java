module com.javafx.assignment2javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.javafx.assignment2javafx to javafx.fxml;
    exports com.javafx.assignment2javafx;
}