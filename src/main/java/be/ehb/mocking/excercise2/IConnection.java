package be.ehb.mocking.excercise2;

public interface IConnection {
	boolean insert(Book boek);
	Book selectByID(int i);
	boolean open();
	boolean close();
}
