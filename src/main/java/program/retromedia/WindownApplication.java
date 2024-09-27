package program.retromedia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class WindownApplication extends Application {
    private double axisX, axisY;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(WindownApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();

        scene.setOnMousePressed(mouseEvent -> {
            axisX = mouseEvent.getSceneX();
            axisY = mouseEvent.getSceneY();
        });
        scene.setOnMouseDragged(mouseEvent -> {
            stage.setX(mouseEvent.getScreenX() - axisX);
            stage.setY(mouseEvent.getScreenY() - axisY);
        });
    }

    public static void main(String[] args) {
        launch();
    }
}