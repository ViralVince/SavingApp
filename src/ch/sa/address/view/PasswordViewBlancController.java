package ch.sa.address.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PasswordViewBlancController {

	PasswordViewController pvc = new PasswordViewController();

	@FXML
	Button newButton = new Button();
	public void handleNew(){
		pvc.handleNew();
	}

}
