package view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class CMainApp implements Initializable{

	@FXML
	Button button;
	
	@FXML
	AnchorPane ocapacity;
	
	public MainApp mainapp;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
			ocapacity.setVisible(false);
	}
	
	@FXML
	private void c_btnLogin() {
		System.out.println("Hello");
	}
	
	public void setMainApp(MainApp mainapp) {
		this.mainapp = mainapp; 
	}

	
}