package com.tech.javabasics.step09classes;

public class DogRunner {
	public static void main(String[] args) {

		Dog tim = new Dog("Tim", "Brown", 9);
//		tim.name = "Tim";
//		tim.color = "Brown";
//		tim.volumeOfSound = 9;

		tim.describe();

		Dog tiger = new Dog("Tiger", "Black", 14);
//		tiger.name = "Tiger";
//		tiger.color = "Black";
//		tiger.volumeOfSound = 14;

		tiger.describe();

		Dog rocky = new Dog("Rocky", "White", 7);
		rocky.describe();

		System.out.println(Dog.dogIdSequenceGenerator);

	}
}
