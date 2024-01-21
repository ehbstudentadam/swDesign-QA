package be.ehb.singleton.exercise3;

import java.util.ArrayList;

public class PrintSpooler {
	
	private ArrayList<Document> documents;
	
	private static PrintSpooler uniqueInstance;
	
	private PrintSpooler(){
		documents = new ArrayList<Document>();
	} //deze private constructor is zeer belangrijk!
	
	public static PrintSpooler getInstance(){
		if(uniqueInstance == null)
			uniqueInstance = new PrintSpooler();
		return uniqueInstance;
	}
	
	public void addDocument(Document d){
		getDocuments().add(d);
		System.out.println("Document "+d.getName() + " added to the printer spooler");
	}
	
	public void processDocument(){
		if (getDocuments().size() > 0)
		{
			Document d = getDocuments().remove(getDocuments().size()-1);
			System.out.println("Document " + d.getName() + " of " + d.getNumberBytes() + " bytes in " + (d.isColor() ? "kleur" : "zwart-wit") + " removed");
		}
		else
			System.out.println("No more documents in the queue");
	}

	private ArrayList<Document> getDocuments() {
		return documents;
	}
	
	public void printDocuments(){
		System.out.println("*************************QUEUE BEGIN*****************************");
		for(Document d:documents)
			System.out.println("Document " + d.getName() + " of " + d.getNumberBytes() + " bytes in " + (d.isColor() ? "kleur" : "zwart-wit"));
		
		System.out.println("*************************QUEUE END*****************************");
	}
	
	public static void main(String[] args) {
		PrintSpooler.getInstance().addDocument(new Document("Document1",5,true));
		PrintSpooler.getInstance().addDocument(new Document("Document2",15,true));
		PrintSpooler.getInstance().addDocument(new Document("Document3",20,true));
		
		PrintSpooler.getInstance().processDocument();
		PrintSpooler.getInstance().printDocuments();
		PrintSpooler.getInstance().processDocument();
		PrintSpooler.getInstance().printDocuments();
		PrintSpooler.getInstance().processDocument();
		PrintSpooler.getInstance().processDocument();
		
	}

}
