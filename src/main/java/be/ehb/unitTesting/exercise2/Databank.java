package be.ehb.unitTesting.exercise2;
import be.ehb.unitTesting.exercise2.exceptions.LeeftijdException;
import be.ehb.unitTesting.exercise2.exceptions.NaamException;

import java.util.ArrayList;

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
