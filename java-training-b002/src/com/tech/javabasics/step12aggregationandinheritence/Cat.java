package com.tech.javabasics.step12aggregationandinheritence;

public class Cat extends Pet {

	boolean goesToOtherPeopleHouse;

	@Override
	void makeSound() {
		System.out.println("Mew Mew");
	}

	void play() {
		System.out.println("Jump on sofa");
	}

	void specialCatFunda() {
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

}
