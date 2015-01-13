package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.ImageIcon;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Point3D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import application.Main;


public class ViewController implements Initializable {
	@FXML
	Button ViewBtnApplyStyle;
	@FXML
	ChoiceBox<String> ViewChoiceBox;
	@FXML
	TableView tableView;
	@FXML
	Label TESTO;
	@FXML
	private Label labelMovedItem;
	@FXML
	private Label labelDegree;
    @FXML
    private ScrollBar scrollBarRotateLabel;
    
    /*CubeView*/
    @FXML
    private Box BoxRotate;
    @FXML
    private ScrollBar scrollBarBoxHor;
    @FXML
    private ScrollBar scrollBarBoxVer;
    
	boolean round = false;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// When Program starts this Method will be called first
		
		ViewChoiceBox.getItems().addAll("dark", "default");
		ViewChoiceBox.getSelectionModel().selectFirst();
		
		final PhongMaterial appMaterial = new PhongMaterial();
		Image image = new Image("image/javafx_logo.png"); 
		appMaterial.setDiffuseMap(image);
		appMaterial.setDiffuseColor(Color.ALICEBLUE);
        BoxRotate.setMaterial(appMaterial);
		
		/*Rotate Label*/


		/*Rotate Box*/
     
        scrollBarBoxHor.valueProperty().addListener((listener)->{
		BoxRotate.getTransforms().add(
				new Rotate((double) scrollBarBoxHor.getValue(),Rotate.Z_AXIS));
				scrollBarBoxHor.setValue(0);		
		});
				
        scrollBarBoxVer.valueProperty().addListener((listener)->{
			BoxRotate.getTransforms().add(
					new Rotate((double) scrollBarBoxVer.getValue(),Rotate.Y_AXIS));
			scrollBarBoxVer.setValue(0);
		
	});
		
		
	}

	@FXML
	private void ViewBtnApplyStyleOnAction(ActionEvent event) {
		switch (ViewChoiceBox.getSelectionModel().getSelectedIndex()) {
		case 0:
			Main.scene.getStylesheets().add("style/dark.css");
			TESTO.setText("Dark Theme!");
			break;
		case 1:
			Main.scene.getStylesheets().clear();
			TESTO.setText("Default Theme!");
			break;
		default:
			break;
		}

	}

	@FXML
	private void ViewBtnRoundButtonAction(ActionEvent event) {
		if (!round) {
			Main.scene.getStylesheets().addAll("style/roundButton.css");
			round = true;
		} else {
			Main.scene.getStylesheets().removeAll("style/roundButton.css");
			round = false;
		}
	}

	@FXML
	void addDataOnAction(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource(
				"/view/addItem.fxml"));

		Stage window = new Stage();
		window.setScene(new Scene(root));
		window.show();
	}
	

}
