package com.tech.javabasics.step13encapsulation;

public class Dog extends Pet {
	String color;

	void show() {
		System.out.println("Dog [name=" + getName() + ", age=" + getAge() + ", id=" + getId() + "]");
	}

	public Dog(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

}
