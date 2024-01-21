package be.ehb.mocking.excercise1;

public interface IConnection {
	boolean insert(Boek boek);
	Boek selectByID(int i);
	boolean open();
	boolean close();
	void setSleep(int i);
}
