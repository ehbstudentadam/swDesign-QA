## Printspooler
A printer typically has a print spooler. This is a piece of software that temporarily stores
the documents to be printed in memory and sends the document one by one to the printer
when it is ready to print the next document. Typically, there is only one print spooler
for a printer.

Implement a print spooler class yourself that stores documents. The document class has
datamembers for the name of the document, the number of bytes and whether or not it
should be printed in colors.

The print spooler has a method addDocument. The addDocument method adds a document
to the list of documents to be printed. The processDocument method will remove
the first document to be printed from the row. The removeDocument method will remove
a specific document from the queue. This method is used when the user wants to cancel
the print.

![alt text](https://github.com/ehbstudentadam/swDesign-QA/blob/master/src/main/resources/excersiceImages/strategy_singleton.png?raw=true "class diagram")

Test your code by adding a number of documents to the singleton PrintSpooler and
removing a few of them, ... To test the class you can add a printDocuments() method
that does not print all documents but just show all the documents in the queue with all
their characteristics using System.out.println.