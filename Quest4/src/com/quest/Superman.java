package com.quest;

import com.weapons.Weapon;

public class Superman extends Person {
	private int speed;
	private Weapon weapon;

	public Superman(String name, int speed, Weapon weapon) {
		super(name);
		this.speed = speed;
		this.weapon = weapon;
	}

	@Override
	public void sayName() {
		System.out.println("My name is " + getName() + " and I'm a Superman");
	}

	public void saySpeed(int speed) {
		if (speed <= 100) {
			System.out.println("Superman is increasing speed " + speed);
		}

		if (speed >= 100) {
			System.out.println("Superman is decreasing speed " + speed);
		}
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

}
