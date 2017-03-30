/**
 *
 * IMPORTANT NOTE FROM AUTHOR OF PROGRAM!!! PLEASE READ TO THE END
 *
 * I DID NOT MAKE THIS CLASS. INTELIJ IDEA MADE IT BY DEFAULT. DO NOT MESS WITH ANYTHING IN THIS FILE EXCEPT FOR THE WIDTH AND HEIGHT OF THE WINDOW, AND THE TITLE
 * I CHANGED THE WIDTH TO '525' AND THE HEIGHT TO '800' SINCE THE DEFAULT WINDOW SIZE IS TOO SMALL
 * I CHANGED THE TITLE TO 'Random Card Generator'
 *
 * AGAIN, DO NOT TOUCH ANYTHING IN THIS CLASS EXCEPT FOR THE WINDOW SIZE AND TITLE.
 *
 */


package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Random Card Generator");
        primaryStage.setScene(new Scene(root, 525, 800));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
