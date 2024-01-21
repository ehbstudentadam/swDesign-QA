package be.ehb.unitTesting.exercise3.customassertions1;

public class Boek {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
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
		Boek other = (Boek) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}
	private String isbn;
	private String titel;
	private String auteur;
	private String uitgever;
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
	public String getUitgever() {
		return uitgever;
	}
	public void setUitgever(String uitgever) {
		this.uitgever = uitgever;
	}
	public Boek(String isbn, String titel, String auteur, String uitgever) {
		super();
		this.isbn = isbn;
		this.titel = titel;
		this.auteur = auteur;
		this.uitgever = uitgever;
	}
	
}
