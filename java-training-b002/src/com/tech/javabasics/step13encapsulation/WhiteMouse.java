package com.tech.javabasics.step13encapsulation;

public class WhiteMouse extends Pet {
	String color;

	void show() {
		System.out.println("WhiteMouse [name=" + getName() + ", age=" + getAge() + ", id=" + getId() + "]");
	}

	public WhiteMouse(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

}
