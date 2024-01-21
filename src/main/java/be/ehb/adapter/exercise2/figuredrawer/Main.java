package be.ehb.adapter.exercise2.figuredrawer;

import be.ehb.adapter.exercise2.drawers.MainDrawer;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainDrawer dr = new MainDrawer();
		dr.drawAllKindsOfFigures(new FigureDrawerAdapter(new FigureDrawer()));

	}

}
