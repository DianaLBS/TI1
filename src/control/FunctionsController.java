package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.Main;
import model.Function;
import model.MovieTheater;
import model.User;
public class FunctionsController implements Initializable{
	
	private MovieTheater movie;
	@FXML
    private Button b1;

    @FXML
    private Label date1;

    @FXML
    private Label hour1;

    @FXML
    private Label hour2;

    @FXML
    private Label hour3;

    @FXML
    private Label label1;

    @FXML
    private TextField searchTF;

    @FXML
    private Label FunctionSelectedL;
    
    @FXML
    private Label fSelectL;
    
    @FXML
    private Label idLabel;

    @FXML
    private TextField idTF;
    
    @FXML
    private Label nameLabel;

    @FXML
    private Button registerUserBtn;
    
    @FXML
    private TextField nameTF;
    @FXML
    void enterFunction(ActionEvent event) {
     fSelectL.setText("FUNCTION SELECTED :");
     FunctionSelectedL.setText(label1.getText());
     nameLabel.setText("NAME :");
     idLabel.setText("ID : ");
     idTF.setVisible(true);
     nameTF.setVisible(true);
     registerUserBtn.setVisible(true);
    }
    @FXML
    void registerUser(ActionEvent event) {
    	String name=nameTF.getText();
    	String id = idTF.getText();
    	int room=0;
    	User newUser= new User(name,id,FunctionSelectedL.getText());
    User.getUsers().add(newUser);
    Function fun = null;
    for (int i = 0; i < Function.functions.size();i++) {
    	if(Function.functions.get(i).getFilmName().equals(FunctionSelectedL.getText())) {
    		room = Function.functions.get(i).getRoom();
    		fun=Function.functions.get(i);
    	}
    	Function.saveJSON();
    	User.saveJSON();
	}
   String ok="";
    for (int i = 0; i < MovieTheater.getRooms().size(); i++) {
    	
		if(MovieTheater.getRooms().get(i).getFunction().getFilmName().equals(fun.getFilmName())) {
		    movie = MovieTheater.getRooms().get(i);
		    ok="truee";
			break;
		}
	}
 
    if(room==1) {
    	try {
			mapMiniroom(movie);
			Stage stage2 = (Stage) b1.getScene().getWindow();
			stage2.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }else if(room==2) {
    		try {
    			mapRoom(movie);
    			Stage stage2 = (Stage) b1.getScene().getWindow();
    			stage2.close();
    		} catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	
    }
    User.saveJSON();
    }
    @FXML
    void clickSearch(ActionEvent event) {
    	String fsearch = searchTF.getText();
    	boolean flag=false;
    	int pos=0;
        for (int i = 0; i < Function.functions.size(); i++) {
    		if(fsearch.equals(Function.functions.get(i).getFilmName())) {
    			flag=true;
    			pos=i;
    			break;
    		}
    	}
        if(flag==false) {
        	label1.setText("FUNCTION NOT FOUND");
			hour1.setVisible(false);
			date1.setVisible(false);
			b1.setVisible(false);
        }else {
        	label1.setText(fsearch);
			hour1.setText(Function.functions.get(pos).getHour());
			date1.setText(Function.functions.get(pos).getDate());
        }
        
    }
    @FXML
    void clickMenu(ActionEvent event)throws Exception {

    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/MenuWindow.fxml"));		
		loader.setController(new MenuController(LoginController.getId()));
		Parent parent = (Parent) loader.load();
		
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		
		stage.show();
		Stage stage2 = (Stage) searchTF.getScene().getWindow();
		stage2.close();
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		if(Function.functions.size()!=0) {
		if(Function.functions.size()>0) {
		label1.setText(Function.functions.get(0).getFilmName());
		hour1.setText(Function.functions.get(0).getHour());
		date1.setText(Function.functions.get(0).getDate());
		
			}
		}else {
		b1.setVisible(false);
		}
		idTF.setVisible(false);
		nameTF.setVisible(false);
		registerUserBtn.setVisible(false);
	}
	 public void mapMiniroom(MovieTheater movie) throws Exception{
 		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/MiniroomWindow.fxml"));		
			loader.setController(new MiniroomController(movie));
			Parent parent = (Parent) loader.load();
			
			Stage stage = new Stage();
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			
			stage.show();
 	}
	 public void mapRoom(MovieTheater movie) throws Exception{
 		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/RoomWindow.fxml"));		
			loader.setController(new RoomController(movie));
			Parent parent = (Parent) loader.load();
			
			Stage stage = new Stage();
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			
			stage.show();
 	}
}