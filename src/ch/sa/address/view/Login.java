package ch.sa.address.view;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Login {
	//Definiert Login und dessen funktionen

	String name;
	String website;
	String username;
	String password;

	public String getName(){
		return name;
	}
	public String getWebside(){
		return website;
	}
	public String getUsername(){
		return username;
	}
	public String getPassword(){
		return password;
	}


	@XmlElement
	public void setName(String arg){
		name = arg;
	}
	@XmlElement
	public void setWebside(String arg){
		website = arg;
	}
	@XmlElement
	public void setUsername(String arg){
		username = arg;
	}
	@XmlElement
	public void setPassword(String arg){
		password = arg;
	}


}
