package com.weapons;

public class Gun extends Weapon {
	private int bullets;
	final int clip = 6;
	
	public Gun(int getStrength(), String getOwner(), int bullets) {
		getStrength(70);
		getOwner("Colt");
		this.bullets = bullets;
	}
	

	public void addBullets() {
		if(bullets > 0 && bullets <= clip) {
			int add = clip - bullets;
			System.out.println("Gun "+ bullets+ " add bullets "+ add+
		+ super.getStrength() + " name owner "+ super.getOwner());
		}
	}

	public void shoot(int shoot) {
		
	}

	public int getBullets() {
		return bullets;
	}

	public void setBullets(int bullets) {
		this.bullets = bullets;
	}

}
