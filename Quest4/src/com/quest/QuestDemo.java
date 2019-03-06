package com.quest;

import com.weapons.Knife;

public class QuestDemo {

	public static void main(String[] args) {
		Knight knight = new Knight(null, null);
		Knife knife = new Knife(0," " , 9);
		
		knight.sayName();
//		knight.getWeapon();
//		knight.getName();

		
		knife.getSharpness();
//		knife.getStrength();
//		knife.getOwner();
	}

}
