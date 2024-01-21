package be.ehb.unitTesting.exercise3.customassertions2;

import static org.junit.Assert.*;
import static be.ehb.unitTesting.exercise3.customassertions2.MyAssertions.*;

import java.lang.reflect.InvocationTargetException;

import org.junit.Before;
import org.junit.Test;

public class PersoonTest {

	private Persoon p1,p2;
	
	@Before
	public void setUp() throws Exception {
		p1 = new Persoon(1, "Peter", 18);
		p2 = new Persoon(1, "Jacques", 18);
	}

	
	@Test
	public void testWithJUnitAssertEquals() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		assertEquals(p1,  p2);
	}
	
	@Test
	public void testWithCustomAssertion() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		customEquals(p1, p2);
	}

}
