## Time-out
Develop an application that can read and write a book (ID, title, author) to a database.
We implement a dummy DAO class to achieve this . Make sure during the testing of
this application that the connection is created only once to perform all the tests, and the
connection break only once after the tests. Writing or retrieving information from the
database may take no longer than 20 milliseconds.

Tip: take a look at `Thread.sleep(x);`  
Implement the appropriate tests.