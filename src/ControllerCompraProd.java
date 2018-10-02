import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class ControllerCompraProd {
	public void AbreTela(String telafxml, String telacss,int vertical, int horizontal) {
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
	void Pesquisar(ActionEvent event) {
    	
		
    	AbreTela("frConsultaCliente.fxml","TelaMenu.css",800,400);

    }
	@FXML
	void Prosseguir(ActionEvent event) {
    	
		
    	AbreTela("frPagamento.fxml","TelaMenu.css",650,200);

    }
	
}
