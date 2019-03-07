package com.weapons;

import com.quest.Person;

public class Knife extends Weapon {
	private final int sharpness;

	public Knife(int strength, Person owner, int sharpness) {
		super(strength, owner);
		this.sharpness = sharpness;
	}

	public void getSharpness() {
		System.out.println("Sharp knife : " + sharpness + ", strength value : " + super.getStrength()
				+ ", name owner : " + super.getOwner());
	}

}
