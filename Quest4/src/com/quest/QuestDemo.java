package com.quest;

import com.weapons.Knife;

public class QuestDemo {

	public static void main(String[] args) {
		Knight knight = new Knight("Lancelot", null);
		Knife knife = new Knife(90 , "Artur", 9);
		
		knight.sayName();
		knight.getWeapon();

		
		knife.getSharpness();
		knife.getStrength();
		knife.getOwner();
	}

}
