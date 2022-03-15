package control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import main.Main;
public class MenuController implements Initializable {
	
	private String id;
	
	 @FXML
	    private Label nameL;

	    @FXML
	    void registerFunction(ActionEvent event) throws Exception{

	    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/RegisterFunctionWindow.fxml"));		
			loader.setController(new RegisterFunctionController());
			Parent parent = (Parent) loader.load();
			
			Stage stage = new Stage();
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			
			stage.show();
			Stage stage2 = (Stage) nameL.getScene().getWindow();
			stage2.close(); 
	    }
	    @FXML
	    void seeFunctions(ActionEvent event) {

	    	try {
				showFunctions();
				Stage stage = (Stage) nameL.getScene().getWindow();
				stage.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    public MenuController(String id) {
	    	this.id=id;
	    }
	    @FXML
	    void generateReport(ActionEvent event) throws Exception {
	    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/ReportController.fxml"));		
			loader.setController(new ReportController());
			Parent parent = (Parent) loader.load();
			
			Stage stage = new Stage();
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			
			stage.show();
	    }
	    
		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			nameL.setText("You are the user with ID: "+id);
		}
	    
		 public void showFunctions() throws Exception{
	    		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/FunctionsWindow.fxml"));		
				loader.setController(new FunctionsController());
				Parent parent = (Parent) loader.load();
				
				Stage stage = new Stage();
				Scene scene = new Scene(parent);
				stage.setScene(scene);
				
				stage.show();
	    	}
}
