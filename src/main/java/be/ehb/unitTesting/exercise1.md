## My Personal Library Application
We have implemented an application to manage our personal library. We implemented
three classes:

![alt text](src\main\resources\excersiceImages\unit_testing.png "class diagram")

A patron should be able to borrow and return books. By default the library lends a
maximum of 3 books per patron although some patrons can borrow more books. For
each patron the program can print out the name of the person and in between brackets
how many out of the maximum number of books that this person has already borrowed.
Example: “John Johnson (3 out of 4 books)”. The program can create a list of the books
a certain patron has borrowed.

You shouldn’t be able to add duplicate books to the library. Furthermore the library
won’t accept the same person to be added as a patron twice. When you try to remove a
book or patron which isn’t connected to the library the program will let you know.
When a patron borrows a book, it’s temporarily added to his or her collection and will
no longer be available to other patron until the patron returns the book to the library.
The librarian should be able to see a list of all books which are available and can check
if a certain book is available.

Implement the appropriate JUnit tests and find the mistakes in the code.