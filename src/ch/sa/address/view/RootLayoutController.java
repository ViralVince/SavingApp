package ch.sa.address.view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import ch.sa.address.MainApp;

public class RootLayoutController {

	//FileChooser fc = new FileChooser();
	MainApp MA = new MainApp();

//	File file = new File("D:\test.yml");
//	YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);

	public void handleNew() throws IOException{
		//fc.showOpenDialog(MA.getPrimaryStage());

        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" +currentDir);
		File file = new File(currentDir+"/test.xml");
		FileWriter fw = new FileWriter(file);
	}


}
