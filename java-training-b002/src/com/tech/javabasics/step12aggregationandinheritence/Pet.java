package com.tech.javabasics.step12aggregationandinheritence;

public class Pet {
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
	}

	void specialFunda() {
		System.out.println("Watch out this space for more");
	}

	void makeSound() {
		System.out.println("The pet makes some sound which I cannot even describe");
	}

}
