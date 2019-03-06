package com.quest;

public abstract class Person {
	private String name;
	
	public Person(String name) {
		this.setName(name);
	}
	public abstract void sayName();

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
