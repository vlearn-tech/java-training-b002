package com.tech.javabasics.step14abstraction;

public class Dog extends Pet implements Lovable, Playable {

	boolean isAwakeAtNight;

	@Override
	void makeSound() {
		System.out.println("Woof woof");
	}

	void play() {
		System.out.println("Fetch a bone!!");
	}

	@Override
	void specialCaringInstructions() {
		if (isAwakeAtNight) {
			System.out.println(String.format("%s stays alert and protects the house from burglars.", this.name));
		} else {
			System.out.println("Nothing special that " + this.name + " does");
		}
	}

	public Dog(String name, String color, Person owner, boolean isAwakeAtNight) {
		super(name, color, owner);
		this.isAwakeAtNight = isAwakeAtNight;
		System.out.println("Dog object created for  :: " + this.name);
	}

	@Override
	void moves() {
		System.out.println("The dog moves very fast, very difficult to catch");
	}

	@Override
	public void makesFunnyNoise() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cuddlesWithOwner() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playsAround() {
		// TODO Auto-generated method stub

	}

}
