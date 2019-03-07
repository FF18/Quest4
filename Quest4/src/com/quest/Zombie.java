package com.quest;

public class Zombie extends Person {
	private String face;
	private String deathDate;

	public Zombie(String name, String deathDate) {
		super(name = "Mad");
		this.deathDate = deathDate;
		face = "Zombie";
	}

	public void sayName() {
		System.out.println("My name is " + getName() + " and I'm a " + face);
	}

	public String getDeathDate() {
		return deathDate;
	}

}
