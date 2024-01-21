package be.ehb.codeCoverage.exercise1.interfaces;

import be.ehb.codeCoverage.exercise1.User;
import be.ehb.codeCoverage.exercise1.exceptions.PasswordException;
import be.ehb.codeCoverage.exercise1.exceptions.RetrievalFailed;
import be.ehb.codeCoverage.exercise1.exceptions.UserException;

public interface IUserDAO {
	User storeUser(String gebruikersnaam, String naam, String paswoord) throws UserException, PasswordException;
	User retrieveUser(int userID) throws RetrievalFailed;
}
 