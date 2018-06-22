package co.edureka.model;

public class User {

	// Attributes
	public int uid;
	public String name;
	public String email;
	public String password;
	
	public User(){
		
	}
	
	public User(int uid, String name, String email, String password) {
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public boolean validate(){
		if(name.isEmpty() || email.isEmpty() || password.isEmpty())
			return false;
		else 
			return true;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}