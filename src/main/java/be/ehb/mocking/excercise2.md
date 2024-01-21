## Database
We are developing a DAO that can write a book (ID, title, author) to and read it from a
database. You must provide the DAO object with a connection object via its constructor.
We wish to test the DAO in isolation and therefore develop a mock connect object based
on its interface. The connection object interface contains the following methods:

- `boolean insert(Boek boek)`
- `Boek selectByID(int i)`
- `boolean open()`
- `boolean close()`

Implement the most important unit tests using EasyMock.