package com.tech.javabasics.step14abstraction;

public abstract class Pet {
	String name;
	String color;
	Person owner;

	void printDetailsOfPet() {
		System.out.println(this.toString());
		this.makeSound();
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", color=" + color + "]";
	}

	public Pet(String name, String color, Person owner) {
		this.name = name;
		this.color = color;
		this.owner = owner;
		System.out.println("Pet object being created for :: " + this.name);
	}

	// Default constructor
	public Pet() {
		System.out.println("Default and Empty Pet object being created");
	}

	abstract void specialCaringInstructions();

	abstract void makeSound();

	abstract void moves();

//	abstract void playsAround();
}
