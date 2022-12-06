package a10_109502517;

import java.io.IOException;

import javafx.event.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class MenuController {

    @FXML
    private Text walk;

    @FXML
    private Button start;

    @FXML
    private Button exit;
    
    @FXML
    void pressStart(ActionEvent event) throws IOException {
    	Parent maze=FXMLLoader.load(getClass().getResource("GreedySnake.fxml"));
    	Scene mazeScene=new Scene(maze);
    	mazeScene.getRoot().requestFocus();
    	A10.currentStage.setScene(mazeScene);
    }

    @FXML
    void pressExit(ActionEvent event) {
    	A10.currentStage.close();
    }

}

