package program.retromedia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import program.retromedia.controller.DataBaseController;

import java.io.IOException;

public class WindownApplication extends Application {
    DataBaseController dbController = new DataBaseController();
    ConfigurationScene confStage = new ConfigurationScene();

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(WindownApplication.class.getResource("views/windown-main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
        confStage.DraggerScreen(scene,stage);

        dbController.CreateFileDb();
    }

    public static void main(String[] args) {
        launch();
    }
}