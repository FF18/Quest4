package com.weapons;

public abstract class Weapon {
	private int strength;//value range 0...100
	final int value = 100;
	private String owner;//a person
	
	public void takeStrength() {
		if(strength > 0 && strength <= value) {
			System.out.println("strong weapon");
		}
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getStregth() {
		return strength;
	}

}
