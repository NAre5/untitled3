package View;

//import java.nio.file.Paths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
//        Media media = new Media(this.getClass().getResource("Start/PokemonRedBlue.mp3").toURI().toString());
////        Media media = new Media("file:///C:/Users/erant/IdeaProjects/untitled3/resources/music/PokemonRedBlue.mp3");
//        MediaPlayer mediaPlayer = new MediaPlayer(media);
//        mediaPlayer.setAutoPlay(true);
//        primaryStage.setTitle("My Application!");
//        Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
//        Scene scene = new Scene(root, 800, 700);
//        scene.getStylesheets().add(getClass().getResource("ViewStyle.css").toExternalForm());
//        primaryStage.setScene(scene);
//        primaryStage.show();
//        //Rise Servers
        primaryStage.setTitle("My Application!");
        Parent root = FXMLLoader.load(getClass().getResource("Start/Start.fxml"));
        Scene scene = new Scene(root, 800, 700);
//        scene.getStylesheets().add(getClass().getResource("StartStyle.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
        //Rise Servers

    }

    public static void main(String[] args) {
        launch(args);
    }
}
