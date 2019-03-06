package com.weapons;

import com.quest.Person;

public class Knife extends Weapon {
	private final int sharpness;
//	final int sharp = 10;
	
	public Knife(int strength, Person owner, int sharpness) {
		super(strength, owner);
		this.sharpness = sharpness;
	}

//	public Knife(int getStrength, String getOwner, int sharpness) {
//		setStrength(95);
//		setOwner("Artur");
//		this.sharpness = sharpness;
//	}

	public void getSharpness() {
//		if(sharpness > 0 && sharpness <= sharp) {
			System.out.println("Sharp knife : "+ sharpness+ ", strength value : "
		+ super.getStrength() + ", name owner : "+ super.getOwner());
		//}
	}

//	public void takeSharpness(int sharpness) {
//		this.sharpness = sharpness;
//	}

}
