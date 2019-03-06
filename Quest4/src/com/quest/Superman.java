package com.quest;

public class Superman extends Person {
	private int speed;
	private static String face = "Superman";
//	private Weapon weapon;

	public Superman(String name, int speed) {
		super(name = "Henry");
		this.speed = speed;
	}

	@Override
	public void sayName() {
		System.out.println("My name is " + getName() + " and I'm a "+ face);	
	}
	
	public void saySpeed(int speed) {
	if(speed<=100) {
			System.out.println("Superman is increasing speed "+ getSpeed());
		}
	
	if(speed>=100) {
			System.out.println("Superman is decreasing speed "+ getSpeed());
		}
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
