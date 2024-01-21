package be.ehb.mocking.excercise1;

public class BoekDAO {
	private IConnection connection;

	public BoekDAO(IConnection connection) {
		super();
		this.connection = connection;
	}
	
	public boolean insert(Boek boek){
		return connection.insert(boek);
	}
	public Boek selectByID(int i){
		return connection.selectByID(i);
	}

}
