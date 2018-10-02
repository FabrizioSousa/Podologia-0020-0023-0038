import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainApp extends Application
{

	@Override
	public void start(Stage primaryStage) {
		
		Pane root;
		
		try {
		
			root = (Pane)FXMLLoader.load(getClass().getResource("frMenu.fxml"));
			
		
			Scene scene = new Scene(root, 600, 400);
			
		
			scene.getStylesheets().add(getClass().getResource("TelaMenu.css").toExternalForm());
			
		
			primaryStage.setScene(scene);
			primaryStage.show();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	
	
	
	public static void main(String[] args)
	{
		launch(args);

	}

}
