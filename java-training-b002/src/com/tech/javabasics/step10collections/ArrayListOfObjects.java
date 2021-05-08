package com.tech.javabasics.step10collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOfObjects {
	public static void main(String[] args) {
		List<Dog> myPets = new ArrayList<>();

		myPets.add(new Dog("Bruno", "Black"));
		myPets.add(new Dog("Tiger", "Brown"));
		myPets.add(new Dog("Spooky", "White"));
		myPets.add(new Dog("Duster", "Shaded"));
		myPets.add(new Dog("Scooby", "Brown"));

		List<Dog> myBrownPets = new ArrayList<>();

		for (Dog d : myPets) {
			if (d.color.equalsIgnoreCase("brown")) {
				myBrownPets.add(d);
			}
		}

		System.out.println(myBrownPets);

	}
}
