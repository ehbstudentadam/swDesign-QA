package be.ehb.mocking.excercise1;

public class Boek {
	private int id;
	private String titel;
	private String auteur;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public Boek() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Boek(int id, String titel, String auteur) {
		super();
		this.id = id;
		this.titel = titel;
		this.auteur = auteur;
	}
	
}
