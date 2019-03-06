package com.weapons;

import com.quest.Person;

public abstract class Weapon {
	private final int strength;//value range 0...100
	private Person owner;//a person
	
	public Weapon(int stren, Person person) {
		this.strength = stren;
		this.owner = person;
	}
	public void takeStrength() {
		//if(getStrength() > 0 && getStrength() <= value) {
			System.out.println("strong weapon");
		//}
	}
	
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	public int getStrength() {
		return strength;
	}

}
