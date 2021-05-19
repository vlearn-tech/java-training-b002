package com.tech.javabasics.step14abstraction;

public class Cat extends Pet implements Lovable {

	boolean goesToOtherPeopleHouse;

	@Override
	void makeSound() {
		System.out.println("Mew Mew");
	}

	void play() {
		System.out.println("Jump on sofa");
	}

	void specialCaringInstructions() {
		if (goesToOtherPeopleHouse) {
			System.out.println(this.name + " goes to other people's house");
		} else {
			System.out.println("Nothing special that " + this.name + " does.");
		}
	}

	public Cat(String name, String color, Person owner, boolean goesToOtherPeopleHouse) {
		super(name, color, owner);
		this.goesToOtherPeopleHouse = goesToOtherPeopleHouse;
		System.out.println("Cat object created for  :: " + this.name);
	}

	@Override
	void moves() {
		System.out.println(this.name + " moves so slowly... ");
	}

	public void playsAround() {
		System.out.println("Its a cat, its just jumping from the table to the floor");
	}

	@Override
	public void makesFunnyNoise() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cuddlesWithOwner() {
		// TODO Auto-generated method stub

	}

}
