## Custom assertions
### Book
A book has an ISBN, title, author, publisher. In our tests we often have to check whether
two books are the same. Two books are the same when both their ISBN, title and author
match. Develop a custom assertion.

### Person
Implement a Person class with an ID, name, age and favorite color. According to the
specification, two people are the same when their ID matches. The equals method and
hash code will therefore be implemented based on the datamember id. However, in your
JUnit testing you will want to find out whether two objects of the Person type match.
Using AssertEquals only the ID will be checked and the other data won’t be included in
the check.

We could write an AssertEquals for each datamember but we want to implement a
solution which we can reuse for any class.