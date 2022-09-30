package ControllerRun;

import grupo.demo3.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    private Stage stage = new Stage();

    @FXML
    public void sendPag1(ActionEvent e){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("viewsPersons/Persons.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.setTitle("Persons Main");
            stage.setScene(scene);
            stage.show();
        }catch (IOException event){

        }

    }




    @FXML
    public void sendPag2(ActionEvent e){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("viewsLoad/loadMain.fxml"));
            System.out.println("ENtro pag 2");
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.setTitle("Student Part");
            stage.setScene(scene);
            stage.show();
        }catch (IOException event){

        }
    }

    @FXML
    public void sendPag3(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(""));
            System.out.println("ENtro pag 3");
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.setTitle("Student Part");
            stage.setScene(scene);
            stage.show();
        }catch (IOException event){

        }
    }
}