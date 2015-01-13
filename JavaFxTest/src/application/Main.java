package application;

import java.util.Random;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Point3D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class Main extends Application {
	public static Scene scene;
	public static Parent root;
	Random r = new Random();
	double d;
	
	@Override
	public void start(Stage primaryStage) {

		try {
			Main.root = FXMLLoader.load(getClass().getResource(
					"/view/View.fxml"));
			Main.scene = new Scene((Parent) root);
	
			
//			Timeline timeline = new Timeline();
//			root.rotationAxisProperty().set(new Point3D(1, 1, 0));
//			timeline.getKeyFrames().addAll(new KeyFrame(new Duration(20000), // set duration to 40sek 
//							new KeyValue(root.rotateProperty(),	360)));
//			timeline.play();
			
			primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
