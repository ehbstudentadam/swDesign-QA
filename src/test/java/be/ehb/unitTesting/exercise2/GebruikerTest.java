package be.ehb.unitTesting.exercise2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import be.ehb.unitTesting.exercise2.Gebruiker;

public class GebruikerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testInitialisatie() {
		Gebruiker g = new Gebruiker();

		assertTrue("Probleem naam", g.getNaam().equals(""));
		assertTrue("Probleem voornaam", g.getVoornaam().equals(""));
		assertTrue("Probleem leeftijd", g.getLeeftijd() == 18);
	}
	
	

}
