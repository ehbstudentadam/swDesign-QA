package be.ehb.mocking.exercise1;

import static org.junit.Assert.*;

import be.ehb.mocking.excercise1.Boek;
import be.ehb.mocking.excercise1.BoekDAO;
import be.ehb.mocking.excercise1.IConnection;
import be.ehb.mocking.excercise1.MockConnection;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BoekDAOTest {
	private static IConnection connection;
	private Boek boek;
	private BoekDAO boekDAO;

	@BeforeClass
	public static  void start() throws Exception {
		connection = new MockConnection();
		connection.open();
	}

	@Before
	public void setUp() throws Exception {
		boekDAO = new BoekDAO(connection);
		boek = new Boek(1, "The Ancestor's Tale", "Richard Dawkins");
	}

	@Test(timeout = 20)
	public void testInsertSuccess() {
		assertTrue(boekDAO.insert(boek));
	}

	@Test(timeout = 20)
	public void testInsertFailure() {
		connection.setSleep(40);
		assertTrue(boekDAO.insert(boek));
	}

	@Test(timeout = 20)
	public void testSelectByIDSuccess() {
		connection.setSleep(5);
		boekDAO.insert(boek);
		assertEquals(boekDAO.selectByID(1), boek);
	}

	@Test(timeout = 20)
	public void testSelectByIDFailure() {
		connection.setSleep(40);
		boekDAO.insert(boek);
		assertEquals(boekDAO.selectByID(1), boek);
	}

	@AfterClass
	public static void stop() {
		connection.close();
	}

}
