package be.ehb.strategy.exercise2;

public class BowAndArrow implements WeaponBehavior{
	public void fight() {
		System.out.println("using my " + this.getClass().getSimpleName());
		
	}
}
