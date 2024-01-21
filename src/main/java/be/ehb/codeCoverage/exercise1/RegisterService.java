package be.ehb.codeCoverage.exercise1;

import be.ehb.codeCoverage.exercise1.exceptions.PasswordException;
import be.ehb.codeCoverage.exercise1.exceptions.RetrievalFailed;
import be.ehb.codeCoverage.exercise1.exceptions.ServiceException;
import be.ehb.codeCoverage.exercise1.exceptions.UserException;
import be.ehb.codeCoverage.exercise1.interfaces.IRegisterService;
import be.ehb.codeCoverage.exercise1.interfaces.IUserDAO;

public class RegisterService implements IRegisterService {
	
	private IUserDAO userDAO;

	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}
 
	@Override
	public int register(String username, String name, String password) throws UserException, PasswordException {
		// Op deze plaats zouden in het geval van een echte case 
		// alle bewerkingen zich bevinden.
		// Aangezien deze oefening als doel heeft JUnit en Easymock aan te leren
		// beperken we ons tot de strikt noodzakelijke code
		
		User user = userDAO.storeUser(username, name, password);
		int i = -1;
		if (user != null)
			i = user.getUserID();
		return i;
	}

	public User retrieve(int userID) throws ServiceException{
		try {
			return userDAO.retrieveUser(userID);
		} catch (RetrievalFailed e) {
			throw new ServiceException();
		}
	}
}
