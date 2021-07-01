package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Runs  the window user using sample.fxml
 * @author Nisarg Patel, Yash Patel
 */
public class Main extends Application {

    /**
     * Sets the scene of the primary stage.
     * @param primaryStage the stage where the scene is depicted
     * @throws Exception if there is any error
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("My Pizza Store");
        primaryStage.setScene(new Scene(root, 465, 560));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
