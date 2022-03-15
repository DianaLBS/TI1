package main;


import control.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Function;
import model.User;



public class Main extends Application{

	public static void main(String[] args) {
		Function.loadJSON();
		User.loadJSON();
		// TODO Auto-generated method stub
    launch();
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/LoginWindow.fxml"));		
		loader.setController(new LoginController());
		Parent parent = (Parent) loader.load();
		
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		
		stage.show();
	}

}
