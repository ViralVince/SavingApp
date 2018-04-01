package ch.sa.address.view;

import ch.sa.address.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class PasswordViewEditController {
	@FXML
	TextField name;
	@FXML
	TextField username;
	@FXML
	TextField webside;
	@FXML
	TextField password;

	 private Stage dialogStage;

	public void onSaveButton(){

		Login login = new Login();
		if(!name.getText().isEmpty() && !webside.getText().isEmpty() && !username.getText().isEmpty() && !password.getText().isEmpty()){

		login.setName(name.getText());
		login.setPassword(password.getText());
		login.setUsername(username.getText());
		login.setWebside(webside.getText());

		LoginList logl = new LoginList();
		logl.addLogin(login);
		MainApp.saveXML();
		} else {
			Alert alert = new Alert(AlertType.ERROR);
            alert.initOwner(dialogStage);
            alert.setTitle("Inkorrekte Eingabe");
            alert.setHeaderText("Bitte verbessern Sie Ihre Fehler");
            alert.showAndWait();
		}
	}
}
