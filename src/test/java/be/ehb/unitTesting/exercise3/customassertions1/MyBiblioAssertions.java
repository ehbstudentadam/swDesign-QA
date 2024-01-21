package be.ehb.unitTesting.exercise3.customassertions1;

import static org.junit.Assert.*;

public class MyBiblioAssertions {
	public static void assertBoekenGelijk(Boek b1, Boek b2){
		assertEquals("ISBN niet gelijk!", b1.getIsbn(), b2.getIsbn());;
		assertEquals("Titel niet gelijk!", b1.getTitel(), b2.getTitel());
		assertEquals("Auteur niet gelijk!", b1.getAuteur(), b2.getAuteur());	
	}
}
