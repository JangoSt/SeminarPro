package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {
	public static Scene scene;
	public static Parent root;

	@Override
	public void start(Stage primaryStage) {
		try {
			Main.root = FXMLLoader.load(getClass().getResource("/view/View.fxml"));
			Main.scene = new Scene((Parent) root);
			//scene.setFill(Color.TRANSPARENT);
			primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
