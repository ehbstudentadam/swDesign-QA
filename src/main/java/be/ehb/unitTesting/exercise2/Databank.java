package be.ehb.unitTesting.exercise2;

import java.util.ArrayList;

import ehb.ex2.exceptions.LeeftijdException;
import ehb.ex2.exceptions.NaamException;

public class Databank {
	//simulatie databank
	private ArrayList<Gebruiker> lijst = new ArrayList<Gebruiker>();
	
	public boolean opslaan(Gebruiker g) {
		if (g.getNaam().equals(""))
			throw new NaamException();
		if (g.getLeeftijd() == 0)
			throw new LeeftijdException();
		return lijst.add(g);
	}
}
