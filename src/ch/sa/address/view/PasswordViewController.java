package ch.sa.address.view;


import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

import ch.sa.address.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class PasswordViewController {

	@FXML
    private TableColumn<String ,String> loginColumn;

	@FXML
	private TextField passwordTextField;

	@FXML
	private TextField usernameTextField;

	@FXML
	private Button RevealButton;

	@FXML
	private Button CopyButton;

	@FXML
	private Button EnlargeButton;

	@FXML
	private Button newLoginButton;

	@FXML
	private Button editButton;

	@FXML
	private Button deleteButton;

	@FXML
	private Hyperlink websideLink;

	private MainApp mainApp;

	public PasswordViewController() {
    }


	@FXML
    private void initialize() {
		passwordTextField.setText("********");
		websideLink.setText("youtube.com");
    }

	public void handleRevealPassword(){
		if(RevealButton.getText().equals("Reveal")){
		passwordTextField.setText("Passwort");
		RevealButton.setText("Hide");
		} else {
			passwordTextField.setText("********");
			RevealButton.setText("Reveal");
		}
	}

	public void handleCopyButton(){
		String myString = passwordTextField.getText();
		StringSelection stringSelection = new StringSelection(myString);
		Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
		clpbrd.setContents(stringSelection, null);

	}

	@FXML
	public void openWebside(){
		Runtime rt = Runtime.getRuntime();
        String url = websideLink.getText();
        try {
			rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}


