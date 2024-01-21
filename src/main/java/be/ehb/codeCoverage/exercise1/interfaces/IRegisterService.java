package be.ehb.codeCoverage.exercise1.interfaces;

import be.ehb.codeCoverage.exercise1.User;
import be.ehb.codeCoverage.exercise1.exceptions.PasswordException;
import be.ehb.codeCoverage.exercise1.exceptions.ServiceException;
import be.ehb.codeCoverage.exercise1.exceptions.UserException;

public interface IRegisterService {
	int register(String gebruikersnaam, String naam, String paswoord) throws UserException, PasswordException;
	User retrieve(int userID) throws ServiceException;
} 
