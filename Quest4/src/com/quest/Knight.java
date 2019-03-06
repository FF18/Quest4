package com.quest;

import com.weapons.Weapon;

public class Knight extends Person {
	private static final String Weapon = "Knight";
	private Weapon weapon;

	public Knight(String name, Weapon weapon) {
		super(name = "Lancelot");
		this.weapon = weapon;
	}

	@Override
	public void sayName() {
		System.out.println("My name is " + getName() + " and I'm a "+ Weapon);
//		System.out.println("Lancelot2 ");
		
	}
	
	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
}
