package be.ehb.strategy.exercise2;

public class Axe implements WeaponBehavior {
	public void fight() {
		System.out.println("using my " + this.getClass().getSimpleName());
		
		
	}
}
