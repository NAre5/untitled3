import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Test extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Media media = new Media(getClass().getResource("music/PokemonRedBlue.mp3").toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
    }
}
