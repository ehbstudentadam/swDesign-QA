## 1 Code coverage
When the source code is large, it is important to find out which code has already been
tested. Code coverage tools will indicate after running the tests what percentage of the
classes, methods and lines of code were tested.

Carry out the unit tests of a previous lab using a code coverage tool.

## 2 RegisterService
We provide two interfaces: IRegisterService and IUserDAO.  
IRegisterService has a method register with a username, name and password as arguments
and an integer as return value (the userID).

IUserDAO has a storeUser method with the same arguments and a User object as the
return value. A User object consists of a username, name, password and userID.
When a user is created, the DAO returns the created user object including an assigned
userID. If the user is not created, a null value will be returned.

The register method of the RegisterService uses this DAO and returns the userID when
the user creation is successful. If the user was not created, the method returns a negative
number.

We only implement RegisterService.  
We provide the two most important test cases.

## 3 RegisterService bis
We add the following property to the storeUser method from the IUserDAO interface:
If an empty string is used as username, the method throws a UserException with the
message "Detected an empty string!".

If an empty string is used as a password, IUserDAO’s storeUser method throws a Pass-
wordException.  
The Register forwards both exceptions to a higher level.
PasswordException and UserException are of type Exception. The user’s name is not a
required field.

Write the two main unit tests for this code.

## 4 RegisterService tris
We add the following method to the IUserDAO interface: User retrieveUser (int userID).
If the user was found it will be returned and if not, this method returns a null value.
This method is used by the RegisterService User retrieve (int userID) method.

If a nonexistent user is queried three times via the retrieveUser method of IUserDAO,
this method throws a RetrievalFailed exception. When this happens, the retrieve (int
userID) RegisterService method will catch this exception and throw a ServiceException.

Both RetrievalFailed and ServiceException are of type exception.  
Provide the main unit tests for this code.