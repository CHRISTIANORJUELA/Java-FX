package ControllersPersons;

import grupo.demo3.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PersonsController {

    private Stage stage = new Stage();

    @FXML
    public void sendMonitor(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("viewsPersons/Monitor.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.setTitle("Persons Main");
            stage.setScene(scene);
            stage.show();
        }catch (IOException e){

        }
    }

    @FXML
    public void sendStudent(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("viewsPersons/Student.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.setTitle("Persons Main");
            stage.setScene(scene);
            stage.show();
        }catch (IOException e){

        }
    }

    @FXML
    public void sendTeacher(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("viewsPersons/Teacher.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.setTitle("Persons Main");
            stage.setScene(scene);
            stage.show();
        }catch (IOException e){

        }

    }

}
