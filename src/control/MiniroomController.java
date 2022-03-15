package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import model.MovieTheater;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import main.Main;

public class MiniroomController implements Initializable {
	
        private int[]array=new int[28];
        private Button[] butons = new Button[28];
	    @FXML
	    private Button b1;

	    @FXML
	    private Button b10;

	    @FXML
	    private Button b11;

	    @FXML
	    private Button b12;

	    @FXML
	    private Button b13;

	    @FXML
	    private Button b14;

	    @FXML
	    private Button b15;

	    @FXML
	    private Button b16;

	    @FXML
	    private Button b17;

	    @FXML
	    private Button b18;

	    @FXML
	    private Button b19;

	    @FXML
	    private Button b2;

	    @FXML
	    private Button b20;

	    @FXML
	    private Button b21;

	    @FXML
	    private Button b22;

	    @FXML
	    private Button b23;

	    @FXML
	    private Button b24;

	    @FXML
	    private Button b25;

	    @FXML
	    private Button b26;

	    @FXML
	    private Button b27;

	    @FXML
	    private Button b28;

	    @FXML
	    private Button b3;

	    @FXML
	    private Button b4;

	    @FXML
	    private Button b5;

	    @FXML
	    private Button b6;

	    @FXML
	    private Button b7;

	    @FXML
	    private Button b8;

	    @FXML
	    private Button b9;

	    @FXML
	    void clickb1(ActionEvent event) {
        array[0]=1;
        b1.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb10(ActionEvent event) {
	    	array[9]=1;
	        b10.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb11(ActionEvent event) {
	    	array[10]=1;
	        b11.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb12(ActionEvent event) {
	    	array[11]=1;
	        b12.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb13(ActionEvent event) {
	    	array[12]=1;
	        b13.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb14(ActionEvent event) {
	    	array[13]=1;
	        b14.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb15(ActionEvent event) {
	    	array[14]=1;
	        b15.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb16(ActionEvent event) {
	    	array[15]=1;
	        b16.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb17(ActionEvent event) {
	    	array[16]=1;
	        b17.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb18(ActionEvent event) {
	    	array[17]=1;
	        b18.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb19(ActionEvent event) {
	    	array[18]=1;
	        b19.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb2(ActionEvent event) {
	    	array[1]=1;
	        b2.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb20(ActionEvent event) {
	    	array[19]=1;
	        b20.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb21(ActionEvent event) {
	    	array[20]=1;
	        b21.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb22(ActionEvent event) {
	    	array[21]=1;
	        b22.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb23(ActionEvent event) {
	    	array[22]=1;
	        b23.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb24(ActionEvent event) {
	    	array[23]=1;
	        b24.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb25(ActionEvent event) {
	    	array[24]=1;
	        b25.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb26(ActionEvent event) {
	    	array[25]=1;
	        b26.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb27(ActionEvent event) {
	    	array[26]=1;
	        b27.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb28(ActionEvent event) {
	    	array[27]=1;
	        b28.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb3(ActionEvent event) {
	    	array[2]=1;
	        b3.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb4(ActionEvent event) {
	    	array[3]=1;
	        b4.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb5(ActionEvent event) {
	    	array[4]=1;
	        b5.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb6(ActionEvent event) {
	    	array[5]=1;
	        b6.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb7(ActionEvent event) {
	    	array[6]=1;
	        b7.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb8(ActionEvent event) {
	    	array[7]=1;
	        b8.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	    @FXML
	    void clickb9(ActionEvent event) {
	    	array[8]=1;
	        b9.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
	    }

	


	private MovieTheater movietheater;
	public MiniroomController(MovieTheater movietheater){
		this.movietheater = movietheater;
		array = movietheater.getMatrixRoom();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		butons[0]=b1;
		butons[1]=b2;
		butons[2]=b3;
		butons[3]=b4;
		butons[4]=b5;
		butons[5]=b6;
		butons[6]=b7;
		butons[7]=b8;
		butons[8]=b9;
		butons[9]=b10;
		butons[10]=b11;
		butons[11]=b12;
		butons[12]=b13;
		butons[13]=b14;
		butons[14]=b15;
		butons[15]=b16;
		butons[16]=b17;
		butons[17]=b18;
		butons[18]=b19;
		butons[19]=b20;
		butons[20]=b21;
		butons[21]=b22;
		butons[22]=b23;
		butons[23]=b24;
		butons[24]=b25;
		butons[25]=b26;
		butons[26]=b27;
		butons[27]=b28;
		Button temp= new Button();
	  for(int i=0;i<array.length;i++) {
		  if(array[i]!=0) {
			 temp =butons[i];
			 temp.setStyle("-fx-background-radius: 150; -fx-background-color: blue;");
		  }
	  }
	}
	@FXML
    void clickRegister(ActionEvent event)throws Exception {
		 Alert alert = new Alert(Alert.AlertType.INFORMATION);
         alert.setHeaderText(null);
         alert.setTitle("PLACE SAVED");
         alert.setContentText("The place has been saved");
         alert.showAndWait();
         FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/MenuWindow.fxml"));		
			loader.setController(new MenuController(LoginController.getId()));
			Parent parent = (Parent) loader.load();
			
			Stage stage = new Stage();
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			
			stage.show();
			Stage stage2 = (Stage) b1.getScene().getWindow();
			stage2.close();
    }
	
}