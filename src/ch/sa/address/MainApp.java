package ch.sa.address;

import java.io.File;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import ch.sa.address.view.LoginList;
import ch.sa.address.view.PasswordViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {



    private Stage primaryStage;
    private BorderPane rootLayout;



    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("SavingApp");

        PasswordViewController pvc = new PasswordViewController();

        initRootLayout();

        showPasswordOverview();
    }



    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the person overview inside the root layout.
     */
    public void showPasswordOverview() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/PasswordViewEdit.fxml"));
            AnchorPane passwordOverview = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(passwordOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void loadXML(){
    	 try {

    		 	String currentDir = System.getProperty("user.dir");
    		 	//System.out.println("Current dir using System:" +currentDir);
    		 	File file = new File(currentDir+"/filetest.xml");
    			JAXBContext jaxbContext = JAXBContext.newInstance(LoginList.class);

    			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    			LoginList logl = (LoginList) jaxbUnmarshaller.unmarshal(file);
    			System.out.println(logl);

    		  } catch (JAXBException e) {
    			e.printStackTrace();
    		  }

    }

    public static void saveXML(){
    	LoginList logl = new LoginList();
		  try {
			  String currentDir = System.getProperty("user.dir");
		      //System.out.println("Current dir using System:" +currentDir);
			  File file = new File(currentDir+"/filetest.xml");
			  JAXBContext jaxbContext = JAXBContext.newInstance(LoginList.class);
			  Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			  // output pretty printed
			  jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			  jaxbMarshaller.marshal(logl, file);
			  jaxbMarshaller.marshal(logl, System.out);

		      } catch (JAXBException e) {
		    	  e.printStackTrace();
		      }
	}

    public void readFileToUI(){



    }

    public static void main(String[] args) {
        launch(args);
    	saveXML();
    }
}
