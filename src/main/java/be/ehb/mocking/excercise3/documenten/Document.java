package be.ehb.mocking.excercise3.documenten;

public class Document {
	private String titel;
	private String path;
	
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Document(String titel) {
		super();
		this.titel = titel;
	}
	public String getTitel() { 
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titel == null) ? 0 : titel.hashCode());
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
		Document other = (Document) obj;
		if (titel == null) {
			if (other.titel != null)
				return false;
		} else if (!titel.equals(other.titel))
			return false;
		return true;
	}
	
}
