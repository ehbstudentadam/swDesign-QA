package be.ehb.codeCoverage.exercise1;

public class User {
	private int userID;
	public User() {
		super();
	} 
	public User(int userID, String username, String name, String password) {
		super();
		this.userID = userID;
		this.username = username;
		this.name = name;
		this.password = password;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + userID;
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userID != other.userID)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	private String username;
	private String name;
	private String password;
	
	public String getGebruikersnaam() {
		return username;
	}
	public void setGebruikersnaam(String gebruikersnaam) {
		this.username = gebruikersnaam;
	}
	public String getNaam() {
		return name;
	}
	public void setNaam(String naam) {
		this.name = naam;
	}
	public String getPaswoord() {
		return password;
	}
	public void setPaswoord(String paswoord) {
		this.password = paswoord;
	}
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
}
