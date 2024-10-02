package program.retromedia;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class ConfigurationScene {

    private double axisX, axisY;

    public void DraggerScreen (Scene scene, Stage stage) {
            scene.setOnMousePressed(mouseEvent -> {
                axisX = mouseEvent.getSceneX();
                axisY = mouseEvent.getSceneY();
            });
            scene.setOnMouseDragged(mouseEvent -> {
                stage.setX(mouseEvent.getScreenX() - axisX);
                stage.setY( mouseEvent.getScreenY() - axisY);
            });
        }
    }

