package com.tech.javabasics.step12aggregationandinheritence;

public class Horse extends Pet {

	public Horse(String name, String color, Person owner) {
		super(name, color, owner);
	}

	@Override
	void makeSound() {
		System.out.println("Neighhhhhhhhhhh");
	}
}
