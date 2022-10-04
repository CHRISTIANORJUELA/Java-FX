package ControllerRun;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.Parent;
import javafx.scene.Node;


public class HelloController {

    private Stage stage;
    private Scene scene;
    private Parent root;



    public void sendPag1(ActionEvent e) throws IOException{
        root= FXMLLoader.load(getClass().getResource("viewsPersons/Persons.fxml"));
        // Quiero conectar con esa vista
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }




    public void sendPag2(ActionEvent e) throws IOException{
        this.root = FXMLLoader.load(this.getClass().getResource("viewsLoad/loadMain.fxml"));
        // Quiero conectar con esa vista
        this.stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        this.scene = new Scene(this.root);
        this.stage.setScene(this.scene);
        this.stage.show();
    }


    public void sendPag3() {
    }












    /*
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("viewsPersons/Persons.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.setTitle("Persons Main");
            stage.setScene(scene);
            stage.show();
        }catch (IOException event){

        }

         */
}
