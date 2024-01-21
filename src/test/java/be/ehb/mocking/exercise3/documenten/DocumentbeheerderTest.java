package be.ehb.mocking.exercise3.documenten;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;

import be.ehb.mocking.excercise3.documenten.Document;
import be.ehb.mocking.excercise3.documenten.Documentbeheerder;
import be.ehb.mocking.excercise3.documenten.IMedewerker;
import org.junit.Before;
import org.junit.Test;
 
public class DocumentbeheerderTest {

	private Documentbeheerder documentbeheerder;
	private Document document;
	private IMedewerker fakeMedewerker;

	@Before
	public void setup() {
		fakeMedewerker = createMock(IMedewerker.class);
		documentbeheerder = new Documentbeheerder();
		documentbeheerder.addMedewerker(fakeMedewerker);
		document = new Document("een document");
	}

	@Test
	public void testRemoveNonExistingDocument() {
		/// NIETS
		replay(fakeMedewerker);
		assertFalse(documentbeheerder.removeDocument(document));
	}

	@Test
	public void testAddDocument() {
		fakeMedewerker.documentAdded(document);
		replay(fakeMedewerker);
		documentbeheerder.addDocument(document);
		verify(fakeMedewerker);
	}

	@Test
	public void testAddDocumentFourTimes() {
		fakeMedewerker.documentAdded(document);
		fakeMedewerker.documentChanged(document);
		expectLastCall().times(3);
		replay(fakeMedewerker);
		documentbeheerder.addDocument(document);
		documentbeheerder.addDocument(document);
		documentbeheerder.addDocument(document);
		documentbeheerder.addDocument(document);
		verify(fakeMedewerker);
	}

	@Test
	public void testVoteForRemoval() {
		// Document wordt toegevoegd en de medewerker wordt verwittigd
		fakeMedewerker.documentAdded(document);
		// Document wordt verwijderd en de medewerker wordt gevraagd zijn stem
		// uit te brengen.
		expect(fakeMedewerker.voteForRemoval(document)).andReturn(true);
		// Document wordt verwijderd en de medewerkers wordt verwittigd
		fakeMedewerker.documentRemoved(document);

		replay(fakeMedewerker);
		documentbeheerder.addDocument(document);
		assertTrue(documentbeheerder.removeDocument(document));
		verify(fakeMedewerker);
	}

	@Test
	public void testVoteAgainstRemoval() {
		fakeMedewerker.documentAdded(document);

		expect(fakeMedewerker.voteForRemoval(document)).andReturn(false);

		replay(fakeMedewerker);
		documentbeheerder.addDocument(document);
		assertFalse(documentbeheerder.removeDocument(document));
		verify(fakeMedewerker);
	}

}
