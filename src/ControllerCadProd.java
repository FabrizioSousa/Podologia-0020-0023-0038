import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class ControllerCadProd 
{
	
		
		
		
	public void AbreTela(String telafxml, String telacss,int vertical, int horizontal)
	{
		Stage primaryStage = new Stage();
    	Pane root;
		
		try {

			root = (Pane)FXMLLoader.load(getClass().getResource(telafxml));
	
			Scene scene = new Scene(root, vertical, horizontal);
			
			scene.getStylesheets().add(getClass().getResource(telacss).toExternalForm());
			
		
			primaryStage.setScene(scene);
			primaryStage.show();
			
    } catch (IOException e) {
	
		e.printStackTrace();
	}
		
	}
	@FXML
	void Pesquisar(ActionEvent event)
	{
    	
		
    	AbreTela("frConsultaProd.fxml","TelaMenu.css",700,400);

    }






}
