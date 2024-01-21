package be.ehb.mocking.excercise3.documenten;

public interface IDocumentbeheerder {
	void addMedewerker(IMedewerker medewerker);

	void addDocument(Document document);

	boolean removeDocument(Document document);

} 
