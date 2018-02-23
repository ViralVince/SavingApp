package ch.sa.address.view;


import ch.sa.address.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class PasswordViewController {

	@FXML
    private TableColumn<String ,String> loginColumn;

	@FXML
	private TextField passwordField;

	@FXML
	private Button RevealButton;

	@FXML
	private Button CopyButton;

	@FXML
	private Button EnlargeButton;

	@FXML
	private Button newLoginButton;

	private MainApp mainApp;

	public PasswordViewController() {
    }
	@FXML
	public void setupPasswordViewScene(){


	}

	@FXML
    private void initialize() {
		passwordField.setText("********");
		//
    }

	public void handleRevealPassword(){
		if(RevealButton.getText().equals("Reveal")){
		passwordField.setText("Passwort");
		RevealButton.setText("Hide");
		} else {
			passwordField.setText("********");
			RevealButton.setText("Reveal");
		}
	}
	public void editScene(){

    }

}
