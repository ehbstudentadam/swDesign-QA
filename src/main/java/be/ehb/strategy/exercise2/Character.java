package be.ehb.strategy.exercise2;

public abstract class Character {
	protected WeaponBehavior weaponBehavior;
	private String name;
	
	public void setWeapon(WeaponBehavior weapon) {
		this.weaponBehavior = weapon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void useWeapon() {
		System.out.print("I'm a " + getClass().getSimpleName() + " and I'm ");
		weaponBehavior.fight();
	}
	
	public static void main(String[] args) {
		King king = new King();
		Dwarf dwarf = new Dwarf();
		Elf elf = new Elf();
		Hobbit hobbit = new Hobbit();
		
		king.useWeapon();
		dwarf.useWeapon();
		elf.useWeapon();
		hobbit.useWeapon();
		
		king.setWeapon(new Axe());
		king.useWeapon();
		
		
		
	}
	

}
