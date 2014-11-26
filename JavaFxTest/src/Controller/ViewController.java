package Controller;



import java.net.URL;
import java.util.ResourceBundle;

import javax.jws.soap.SOAPBinding.Style;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class ViewController implements Initializable {
	@FXML
	Button ViewBtnApplyStyle;
	@FXML
	ChoiceBox<String> ViewChoiceBox;
	@FXML 
	Label TESTO;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		// When Program starts this Method will be called first
		ViewChoiceBox.getItems().addAll("dark", "default");
		ViewChoiceBox.getSelectionModel().selectFirst();
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
	@FXML private void ViewBtnRoundButtonAction(ActionEvent event){
		//This Method toggels the View between round buttons or not
//		if(Main.scene.getStylesheets().contains("style/roundButton.css"))
//			Main.scene.getStylesheets().remove(Main.scene.getStylesheets().indexOf("style/roundButton.css"));
//		else 
			Main.scene.getStylesheets().add("style/roundButton.css");
		System.out.println("Button clicked");
	}

}
