package com.tech.javabasics.step12aggregationandinheritence;

public class Dog extends Pet {

	boolean isAwakeAtNight;

	@Override
	void makeSound() {
		System.out.println("Woof woof");
	}

	void play() {
		System.out.println("Fetch a bone!!");
	}

	void specialDogFunda() {
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

}
