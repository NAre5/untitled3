package View.Start;

import javafx.fxml.Initializable;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class StartViewModel implements Initializable {
    private Media media;
//    private Media media = new Media("../resources/music/PokemonRedBlue(TrapRemix).mp3");
    private MediaPlayer mediaPlayer;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        media = null;
        try {
            media = new Media(this.getClass().getResource("PokemonRedBlue.mp3").toURI().toString());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
    }

    public void KeyPresset(KeyEvent keyEvent) {
        System.out.println("beep beep I am a sheep");
//        mediaPlayer.setMute(true);
    }

    public void MC(MouseEvent mouseEvent) {
        System.out.println("beep beep I am a sheep");
        mediaPlayer.dispose();
    }
}
