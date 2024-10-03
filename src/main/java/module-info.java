module program.retromedia {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires org.controlsfx.controls;

    opens program.retromedia to javafx.fxml;
    exports program.retromedia;
    exports program.retromedia.controller;
    opens program.retromedia.controller to javafx.fxml;
}