## Documentmanager
We develop this assignment with the help of JUnit and EasyMock.
We create an interface of the class we wish to exclude from the test. In this exercise, this
is the Employee class. The Employee class interacts with the class to be tested.

The class we want to test is called the Document Manager. The Document Manager
class manages a number of documents. These documents are kept in the class and can
be searched by their file name. Files can also be deleted, added.

A Document has a title and path. Documents are the same when their title matches.
The Document Manager has an addDocument (Document document) method. When this
method is executed, the Document Manager will notify his Employees using the method
documentAdded (Document document). When an existing document is re-added, the
Contributors are notified by the documentChanged (Document document) method.

If the Document Manager is instructed to remove a document, he will check by means
of the voteForRemoval method of his Employees whether this document may actually be
removed. If the sum of the votes is greater than zero, the Document Manager removes
the document and warns its employees with the method documentRemoved (Document
document).

An employee has the following methods:
- `void documentAdded(Document document)`
- `void documentChanged(Document document)`
- `void documentRemoved(Document document)`
- `boolean voteForRemoval(Document document)`

### Testcase 1
In our first test case, we check whether the deletion of a non-existent document does not
accidentally lead to a notification from the Employee (s). To obtain a Mock object, we
need to create a Mock object for the interface we wish to simulate. Next, we will record
the expected behavior. We then place the object in the replay state.

### Testcase 2
If a document has been added, we expect employees to be notified. Write out a test case
for this.

### Testcase 3
We are now going to add the same document four times. We test whether the Employees
(Medewerkers) are appropriately informed.

### Testcase 4
We test what happens when we make a request to delete a document. The Employees
will be questioned via the voteForRemoval method. We first test what happens if the
Employee (s) agree to a removal of the document. Test case 5 We test what happens
when we make a request to delete a document. The Employees will be questioned using
the voteForRemoval method. We first test what happens if the Employee (s) do not
agree with a removal of the document.

## PricingService
We have a PricingService class that relies on a DataAccess class to retrieve data from
a database. The PricingService can retrieve that price of the products by means of a
unique ID. The PricingService class uses the DataAccess class, but does not assume
the responsibility to create it. This responsibility can be found in another part of the
application.

We provide two interfaces: IPricingService and IDataAccess.

The interface IDataAccess only contains the method
- `double getPriceByID(String ID)`

The IPricingService interface consists of the following methods:
- `void setDataAccess(IDataAccess dataAccess)`
- `double getPrice(String id) throws ProductNotFoundException`

We only provide an implementation of PricingService and write the most important tests
for this class.

### Testcase 1
We check if the PricingService implementation fetches a price through the DataAccess
class when we use a correct ID.

### Testcase 2
We check that if the DataAccess class does not find the price based on the ID, the
PricingService implementation throws a ProductNotFoundException.

### Testcase 3
We check whether the PricingService implementation takes possible RuntimeExceptions
to the next level. These kinds of errors can occur when a connection error occurs within
the DataAccess class. These errors must be handled at a higher level.