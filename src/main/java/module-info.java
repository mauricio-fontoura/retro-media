module program.retromedia.retromedia {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires org.controlsfx.controls;

    opens program.retromedia to javafx.fxml;
    exports program.retromedia;
}