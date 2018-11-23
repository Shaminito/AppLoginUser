package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CMainApp{

	@FXML
	Button button;
	
	public MainApp mainapp;
	
	@FXML
	private void c_btnLogin() {
		System.out.println("Hello");
	}
	
	public void setMainApp(MainApp mainapp) {
		this.mainapp = mainapp; 
	}

	
}