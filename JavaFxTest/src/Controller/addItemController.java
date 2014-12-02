package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;

public class addItemController {
	@FXML
	ImageView ImageViewDragDrop;

    @FXML
    void ImagViewOnDragEntered(DragEvent event) {
    	Dragboard db = event.getDragboard();
    	ImageViewDragDrop.setImage(db.getImage());
    }
	
}
