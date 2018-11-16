package view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApp extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginUser.fxml"));
		
		AnchorPane pane = loader.load();
		
		CMainApp controller = new CMainApp();
		controller.setMainApp(this);
		
		primaryStage.setTitle("AppLoginUser");
		primaryStage.setScene(new Scene(pane));
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
