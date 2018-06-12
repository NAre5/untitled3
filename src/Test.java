import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import Server.*;

public class Test{
    public static void main(String[] args) {
        Server server = new Server(5400,1000,new ServerStrategySolveSearchProblem());
        server.start();
        server.stop();
    }
}
