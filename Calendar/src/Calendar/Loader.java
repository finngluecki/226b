package Calendar;
import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Loader extends Application{
public static Stage mainStage;
	public static double x;
	public static double y;
	public static void main(String... args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("start.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("Project");
		primaryStage.centerOnScreen();
		primaryStage.setScene(scene);
		primaryStage.show();
		
		mainStage = primaryStage;
		x = mainStage.getX();
		y = mainStage.getY();
	}
	

	public static void loadScene(String name) {
		Parent parentToLoad = null;
		
		try {
			URL resourcePath = start.class.getResource(name + ".fxml");
			parentToLoad = FXMLLoader.load(resourcePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scene sceneToLoad = new Scene(parentToLoad);
		mainStage.setScene(sceneToLoad);
		mainStage.setY(y -= 74.5);
		mainStage.setX(x -=  190.5);
	}
}
