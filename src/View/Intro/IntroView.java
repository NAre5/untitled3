package View.Intro;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

public class IntroView implements Initializable {
    private Media media;
//    private Media media = new Media("../resources/music/PokemonRedBlue(TrapRemix).mp3");
    private MediaPlayer mediaPlayer;
    public static Scene newOne;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        media = null;
        try {
            String mediaFilePath;
            mediaFilePath = ClassLoader.getSystemResource("music/PokemonRedBlue.mp3").toURI().toString();
//            mediaFilePath = Paths.get(ClassLoader.getSystemResource("PokemonRedBlue.mp3").toURI()).toString();
//            mediaFilePath = "../resources/music/PokemonRedBlue.mp3";
            media = new Media(mediaFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        //set loop infinity
    }

    //make this work
    public void KeyPressed(KeyEvent keyEvent) {
        System.out.println("beep beep I am a sheep");
//        mediaPlayer.setMute(true);
    }

    public void MC(MouseEvent mouseEvent) {
        System.out.println("beep beep I am a sheep");
        mediaPlayer.dispose();
        try {
            Parent mainPage = FXMLLoader.load(getClass().getResource("../Start/StartView.fxml"));
            newOne = new Scene(mainPage,800,700);
            Stage lol = new Stage();
            lol.setScene(newOne);
            lol.initModality(Modality.APPLICATION_MODAL);
            lol.show();
        }
        catch (Exception e){
            System.out.println();
        }

    }
}
