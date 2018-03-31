package ch.sa.address.view;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class LoginList {

	ArrayList<Login> ar = new ArrayList<Login>();

	public void addLogin(Login l){
		ar.add(l);
	}

	public void createXML(Login l){
		

		  try {
			  String currentDir = System.getProperty("user.dir");
		      System.out.println("Current dir using System:" +currentDir);
			File file = new File(currentDir+"/filetest.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Login.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(l, file);
			jaxbMarshaller.marshal(l, System.out);

		      } catch (JAXBException e) {
			e.printStackTrace();
		      }
	}

}