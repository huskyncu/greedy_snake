package a10_109502517;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.image.Image;
import javafx.stage.Stage;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.BorderPane;

public class A10 extends Application{
	public static Stage currentStage;
	public static Scene menuScene;
	@Override
	public void start(Stage primaryStage) throws Exception{
		currentStage=primaryStage;
		Parent root=FXMLLoader.load(getClass().getResource("Menu.fxml"));
		menuScene=new Scene(root);
		currentStage.setTitle("GreedySnake");
		currentStage.setScene( menuScene);
		currentStage.show();
	}
	public static void main(String[] args) {
		launch(args); 
	}
}
