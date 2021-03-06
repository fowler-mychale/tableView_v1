package sample;

import animatefx.animation.FadeIn;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;


public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("ShopAtHome Dashboard");
        Image image = new Image("https://raw.githubusercontent.com/fowler-mychale/tableView_v1/master/src/sample/css/sah-icon.png");
        primaryStage.getIcons().add(image);
        primaryStage.setScene(new Scene(root, 1200, 575));
        new FadeIn(root).play();
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
