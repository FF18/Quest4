package com.quest;

import com.weapons.Weapon;

public class Knight extends Person {
	private Weapon weapon;

	public Knight(String name, Weapon weapon) {
		super(name);
		this.weapon = weapon;
	}

	@Override
	public void sayName() {
		System.out.println("Lancelot");
		
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
}
