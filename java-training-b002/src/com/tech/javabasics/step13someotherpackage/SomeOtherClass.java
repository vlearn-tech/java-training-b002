package com.tech.javabasics.step13someotherpackage;

import java.util.ArrayList;
import java.util.List;

import com.tech.javabasics.step13encapsulation.Dog;
import com.tech.javabasics.step13encapsulation.Pet;
import com.tech.javabasics.step13encapsulation.WhiteMouse;

public class SomeOtherClass {
	public static void main(String[] args) {
		List<Pet> pets = new ArrayList<>();
		pets.add(new Dog("Scooby", 4, "Brown"));
		pets.add(new WhiteMouse("Stuart", 1, "White"));
		pets.add(new Dog("Snowy", 3, "Grey"));

		System.out.println(pets.get(0));
		System.out.println(pets.get(1));
		System.out.println(pets.get(2));

		for (Pet p : pets) {
			if (p.getName().equals("Snowy")) {

				// This will not work as this method is protected and hence not available unless in same package or
				// a subclass
//				hackThisId(p.getId());
			}
		}

	}

	private static void hackThisId(int id) {
		System.out.println("Hacked the id " + id);
	}
}
