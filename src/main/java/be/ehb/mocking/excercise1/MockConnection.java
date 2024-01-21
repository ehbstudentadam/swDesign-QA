package be.ehb.mocking.excercise1;

import java.util.HashMap;

public class MockConnection implements IConnection {
	HashMap<Integer, Boek> boeken = new HashMap<Integer, Boek>();
	private int sleep;

	public int getSleep() {
		return sleep;
	}

	public void setSleep(int sleep) {
		this.sleep = sleep;
	}

	@Override
	public boolean insert(Boek boek) {
		try {
			Thread.sleep(sleep);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return boeken.put(boek.getId(), boek) == null;
	}

	public MockConnection() {
		super();
		sleep = 5;
	}

	@Override
	public Boek selectByID(int id) {
		try {
			Thread.sleep(sleep);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return boeken.get(id);
	}

	@Override
	public boolean open() {

		return true;
	}

	@Override
	public boolean close() {

		return true;
	}

}
