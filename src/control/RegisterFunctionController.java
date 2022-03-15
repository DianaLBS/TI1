package control;

import exception.DateMovieException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.Main;
import model.Function;
import model.MovieTheater;
public class RegisterFunctionController {

	  private int roomNum;
	  @FXML
	    private DatePicker datePick;

	  @FXML
	    private Label durationL;

	    @FXML
	    private TextField filmNameTF;

	    @FXML
	    private TextField hourTF;

	    @FXML
	    private Label numberRoom;

	    @FXML
	    private Label room;
	    @FXML
	    void FiveM(ActionEvent event) {
           durationL.setText("3:30");
	    }

	    @FXML
	    void FourM(ActionEvent event) {
           durationL.setText("3:00");
	    }

	    @FXML
	    void ThreeM(ActionEvent event) {
	    	durationL.setText("2:30");
	    }
	    @FXML
	    void oneM(ActionEvent event) {
	    	durationL.setText("1:30");
	    }

	    @FXML
	    void twoM(ActionEvent event) {
	    	durationL.setText("2:00");
	    }
	    @FXML
	    void clickMiniRoom(ActionEvent event) {
         roomNum=1;
         room.setText("MINIROOM");
         numberRoom.setText("ROOM : 1");
	    }

	    @FXML
	    void clickMovieRoom(ActionEvent event) {
        roomNum=2;
        room.setText("MOVIEROOM");
        numberRoom.setText("ROOM : 2");
	    }


	    @FXML
	    void actionRegister(ActionEvent event) {
        String date =(String.valueOf(datePick.getValue()));
        String duration = durationL.getText();
        String filmName = filmNameTF.getText();
        String hour = hourTF.getText();
        Function function = new Function(date,duration,filmName,hour,roomNum);
        
        boolean s;
        try {
	        if(function.search(function)==true) {
	        	s=true;
	        	Function.functions.add(function);
	        	 Alert alert = new Alert(Alert.AlertType.INFORMATION);
	             alert.setHeaderText(null);
	             alert.setTitle("FUNCTION INFORMATION");
	             alert.setContentText("The function has been saved");
	             alert.showAndWait();
	             if(function.getRoom()==1) {
	            int[]matrix = new int[28];
	             MovieTheater room = new MovieTheater(matrix,function);
	             MovieTheater.getRooms().add(room);
	             }else {
	            	 int[]matrix = new int[42];
	            	 MovieTheater room = new MovieTheater(matrix,function);
	            	 MovieTheater.getRooms().add(room);
	             }
	        }else {
	        	s=false;
	        }
	        excep(s);
	        
        }catch(DateMovieException ex){
        	Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("THE FUNCTION CAN'T BE REGISTERED");
            alert.setContentText("THERE IS ALREADY A FUNCTION AT THAT SCHEDULE");
            alert.showAndWait();
        }
        Function.saveJSON(); 
	    }
	    @FXML
	    void actionMenu(ActionEvent event) {

	    	try {
				showMenu(LoginController.getId());
				Stage stage = (Stage) hourTF.getScene().getWindow();
				stage.close(); 
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    public void showMenu(String id) throws Exception{
    		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/MenuWindow.fxml"));		
			loader.setController(new MenuController(id));
			Parent parent = (Parent) loader.load();
			
			Stage stage = new Stage();
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			
			stage.show();
    	}
	    
	    public void excep(boolean s) throws DateMovieException {
	    	if(s!=true) {
	    		throw new DateMovieException("THERE IS ALREADY A FUNCTION AT THAT SCHEDULE");
	    	}
	    }
}
