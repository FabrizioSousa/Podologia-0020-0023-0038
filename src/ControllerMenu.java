import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ControllerMenu {

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
	    void GerenciarProduto(ActionEvent event) {
	    	
	    	AbreTela("frCadProd.fxml","TelaMenu.css",600,250);

	    }

	    @FXML
	    void GerenciarClientes(ActionEvent event) {
	    	AbreTela("frCadCliente.fxml","TelaMenu.css",600,250);
	    }

	    @FXML
	    void GerenciarConsultas(ActionEvent event) {	
	    	AbreTela("frCadConsulta.fxml","TelaMenu.css",400,282);
	    }

	    @FXML
	    void GerenciarFornecedores(ActionEvent event) {
	    	AbreTela("frCadForn.fxml","TelaMenu.css",600,300);
	    	
	    }

	    @FXML
	    void GerenciarProcs(ActionEvent event) {
	    	AbreTela("frCadProc.fxml","TelaMenu.css",450,300);
	    	
	    }
	    @FXML
	    void GerenciarTratamentos(ActionEvent event) {
	    	AbreTela("frCadTratamento.fxml","TelaMenu.css",600,300);
	    	
	    }
	    @FXML
	    void ComprarProdutos(ActionEvent event) {
	    	AbreTela("frCompraProd.fxml","TelaMenu.css",700,550);
	    	
	    }
	    @FXML
	    void VerEstoque(ActionEvent event) {
	    	AbreTela("frConsultaProd.fxml","TelaMenu.css",700,400);
	    	
	    }
	    
	    
}

