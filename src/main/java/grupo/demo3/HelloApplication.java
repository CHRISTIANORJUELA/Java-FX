package grupo.demo3;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.Parent;
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage)  {
            try {
                Parent root= FXMLLoader.load(getClass().getResource("seeFirst.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }catch (Exception e){

            }
    }

    public static void main(String[] args) {
        launch();
    }
}



/*
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("seeFirst.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Pag Main");
        stage.setScene(scene);
        stage.show();

         */




