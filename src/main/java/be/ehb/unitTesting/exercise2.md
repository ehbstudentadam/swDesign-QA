## Exceptions
A user has the following datamembers: a last name, a first name and an age. Users are
equal when their first and last names are equal. First and last name are empty strings
by default. Age is set at 18 by default.

The method save(User u) of the Database class returns a boolean which indicates if the
user has been saved or not. If an empty string has been used as name, the method
generates an NameException. If age equals 0 the method generates an AgeException
with the message "Age is not correct! The user cannot be saved!".

NameException and AgeException are subtypes of RuntimeException.

Implement the appropriate JUnit tests.