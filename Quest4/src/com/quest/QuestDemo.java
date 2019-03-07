package com.quest;

import com.weapons.Knife;
import com.weapons.Weapon;
import com.weapons.Gun;

public class QuestDemo {

	public static void main(String[] args) {
		Knife knife1 = new Knife(5, null, 2);
		Knight knight = new Knight("Artur", knife1);
		knight.sayName();
		Knife knife = new Knife(75, knight, 9);
		Superman superman = new Superman("Henry", 80);
		Gun gun = new Gun(88, superman, 8);

//		knight.sayName();
//		knight.getWeapon();
//		knight.getName();

//		knife.getSharpness();
////		knife.getStrength();
////		knife.getOwner();
//		superman.sayName();
//		superman.saySpeed(0);
////		knife2.getSharpness();
	}

}