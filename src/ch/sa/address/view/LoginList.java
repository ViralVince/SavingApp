package ch.sa.address.view;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LoginList {
	@XmlElement
	List<Login> ar = new ArrayList<Login>();

	public void addLogin(Login l){
		ar.add(l);
	}

	public List<Login> getList(){
		return ar;
	}



}