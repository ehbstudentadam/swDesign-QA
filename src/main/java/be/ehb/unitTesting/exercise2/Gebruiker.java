package be.ehb.unitTesting.exercise2;

public class Gebruiker {
	private String naam;
	private String voornaam;
	private int leeftijd;
	
	public Gebruiker(){
		naam = "";
		voornaam = "";
		leeftijd = 18;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getVoornaam() {
		return voornaam;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	public int getLeeftijd() {
		return leeftijd;
	}
	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}
	
}
