package be.ehb.codeCoverage;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;

import be.ehb.codeCoverage.exercise1.RegisterService;
import be.ehb.codeCoverage.exercise1.User;
import org.junit.Before;
import org.junit.Test;

import be.ehb.codeCoverage.exercise1.exceptions.PasswordException;
import be.ehb.codeCoverage.exercise1.exceptions.RetrievalFailed;
import be.ehb.codeCoverage.exercise1.exceptions.ServiceException;
import be.ehb.codeCoverage.exercise1.exceptions.UserException;
import be.ehb.codeCoverage.exercise1.interfaces.IUserDAO;

public class RegisterServiceTest {

	private RegisterService registerService;
	private IUserDAO mockDAO;

	@Before
	public void setUp() throws Exception {
		registerService = new RegisterService();

		mockDAO = createMock(IUserDAO.class);
		
		registerService.setUserDAO(mockDAO);
	}

	@Test
	public void testRegisterGeslaagd() throws UserException, PasswordException {
		
		User user = new User();
		String gebruikersnaam = "gebruikersnaam";
		String naam = "naam";
		String paswoord = "paswoord";
		int userID = 100;
		
		user.setGebruikersnaam(gebruikersnaam);
		user.setNaam(naam);
		user.setPaswoord(paswoord);
		user.setUserID(userID);
		
		expect(mockDAO.storeUser(gebruikersnaam, naam, paswoord)).andReturn(
				user);
		//mockDAO.getClass();
		replay(mockDAO);

		assertEquals(userID, registerService.register(gebruikersnaam, naam, paswoord));
		verify(mockDAO);
	}

	
	@Test
	public void testRegisterNietGeslaagd() throws UserException, PasswordException {
		expect(mockDAO.storeUser("fail1", "fail2", "fail3")).andReturn(null);
		
		replay(mockDAO);
		assertEquals(-1, registerService.register("fail1", "fail2", "fail3"));
		verify(mockDAO);

	}

	// bis 
	@Test
	public void testUserException() throws PasswordException, UserException {
		expect(mockDAO.storeUser("", "fail2", "fail3")).andThrow(new UserException());
		replay(mockDAO);
		try {
			registerService.register("", "fail2", "fail3");
			fail("A UserException should have been thrown!");
		} catch (UserException ex) {
			assertEquals("Detected an empty string!", ex.getMessage());
		}

	}

	@Test(expected = PasswordException.class)
	public void testPasswordException() throws UserException, PasswordException {
		expect(mockDAO.storeUser("fail1", "fail2", "")).andThrow(new PasswordException());
		replay(mockDAO);
		registerService.register("fail1", "fail2", "");
	}
	
	// tris

	@Test
	public void testOpvragenGebruikerViaGeldigID() throws ServiceException, RetrievalFailed {
		User user1 = new User(1, "username", "naam", "paswoord");
		expect(mockDAO.retrieveUser(1)).andReturn(user1);
		replay(mockDAO);
		
		User user2 = registerService.retrieve(1);
		assertNotNull(user2);
		assertEquals(user1, user2);
	}
	
	@Test
	public void testOpvragenGebruikerViaOnGeldigID() throws ServiceException, RetrievalFailed {
		expect(mockDAO.retrieveUser(99)).andReturn(null);
		replay(mockDAO);
		
		assertNull(registerService.retrieve(99));
	}
	
	@Test(expected = ServiceException.class)
	public void testDriemaalOpvragenGebruikViaOnGeldigID() throws ServiceException, RetrievalFailed {
		expect(mockDAO.retrieveUser(99))
				.andReturn(null).times(2)
				.andThrow(new RetrievalFailed());
		replay(mockDAO);
		
		assertNull(registerService.retrieve(99));
		assertNull(registerService.retrieve(99));
		assertNull(registerService.retrieve(99));
		verify(mockDAO);
	}
}
