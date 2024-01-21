package be.ehb.mocking.excercise3.documenten;

public interface IMedewerker {
	void documentAdded(Document document);

	void documentChanged(Document document);

	void documentRemoved(Document document);

	boolean voteForRemoval(Document document);
}
 