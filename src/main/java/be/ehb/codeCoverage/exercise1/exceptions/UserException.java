package be.ehb.codeCoverage.exercise1.exceptions;

public class UserException extends Exception {

	/**
	 * 
	 */ 
	private static final long serialVersionUID = 1L;

	public UserException() {
		super("Detected an empty string!");
	}
}
