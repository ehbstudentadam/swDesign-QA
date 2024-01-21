package be.ehb.unitTesting.exercise3.customassertions1;

import static be.ehb.unitTesting.exercise3.customassertions1.MyBiblioAssertions.*;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BoekTest {
	Boek b1,b2;

	@Before
	public void setUp() throws Exception {
		b1 = new Boek("0-618-05673-4", "Unweaving the Rainbow", "Richard Dawkins", "Houghton Mifflin");
		b2 = new Boek("0-618-05673-4", "Unweaving the Rainbow", "Richard Dawkins", "Houghton Mifflin");
	}

	@Test
	public void testBoekenZijnGelijk() {
		
		assertEquals(b1, b2); // volstaat niet
		assertBoekenGelijk(b1, b2);
		
	}

}
