package com.weapons;

import com.quest.Person;

public class Gun extends Weapon {
	private int bullets;

	public Gun(int strength, Person owner, int bullets) {
		super(strength, owner);
		this.bullets = bullets;
	}

	public void addBullets() {
		System.out.println(
				"Gun : " + bullets + ", add bullets " + super.getStrength() + ", name owner " + super.getOwner());
	}

	public void shoot(int shoot) {
		System.out.println("I shot " + bullets + " times");
	}

	public int getBullets() {
		return bullets;
	}

	public void setBullets(int bullets) {
		this.bullets = bullets;
	}

}
