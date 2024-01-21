package be.ehb.unitTesting.exercise2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import be.ehb.unitTesting.exercise2.Databank;
import be.ehb.unitTesting.exercise2.Gebruiker;
import be.ehb.unitTesting.exercise2.exceptions.LeeftijdException;
import be.ehb.unitTesting.exercise2.exceptions.NaamException;

public class DatabankTest {
	private Gebruiker g;
	private Databank d;

	@Before
	public void setUp() throws Exception {
		g = new Gebruiker();
		g.setVoornaam("Jan");
		d = new Databank();
	}

	@Test
	public void testLeeftijdException() {
		g.setNaam("Janssens");
		// default leeftijd is 18
		g.setLeeftijd(0);

		try {
			d.opslaan(g);
			// ... 
			fail("We verwachten een LeeftijdException");
		} catch (LeeftijdException l) {
			assertEquals("Foutboodschap is niet correct", l.getMessage(),
					"Leeftijd is niet correct! Deze gebruiker kan niet worden opgeslagen!");
		}
	}

	@Test(expected = NaamException.class)
	public void testNaamException() {
		// default leeftijd is 18
		d.opslaan(g);
	}

	@Test
	public void testOpslaan() {
		g.setNaam("Janssens");
		g.setLeeftijd(22);

		assertTrue(d.opslaan(g));
	}

}
