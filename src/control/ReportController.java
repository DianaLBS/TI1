package control;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import model.Function;
import model.User;

public class ReportController implements Initializable {
	@FXML
	private TextArea reportTA;

	public String generateReport() {
			String message = "---REPORT---";
			for (int i = 0; i < Function.functions.size(); i++) {
				message += "\n" + Function.functions.get(i).toString();
				for (int j = 0; j < User.getUsers().size(); j++) {
					if (Function.functions.get(i).getFilmName().equals(User.getUsers().get(j).getFunction())) {
						message += "\n" + User.getUsers().get(j).getName();
					}
				}
			}
			try {
				File file=new File("Report.txt");
					if(!file.exists()) {
						file.createNewFile();
					}
					
					FileOutputStream fos= new FileOutputStream(file);
					fos.write(message.getBytes());
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			return message;
			

		}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		String message=generateReport();
		reportTA.setText(message);
	}

}
