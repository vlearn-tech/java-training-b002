package com.tech.javabasics.step14abstraction;

public class Horse extends Pet implements Playable {

	public Horse(String name, String color, Person owner) {
		super(name, color, owner);
		System.out.println("Horse object created for  :: " + this.name);
	}

	@Override
	void makeSound() {
		System.out.println("Neighhhhhhhhhhh");
	}

	@Override
	void specialCaringInstructions() {
		System.out.println("Most special thing about " + this.name + " is its stunning looks and speed");
	}

	@Override
	void moves() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playsAround() {
		// TODO Auto-generated method stub

	}

}
