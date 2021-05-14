package com.tech.javabasics.step13encapsulation;

import java.util.ArrayList;
import java.util.List;

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
				accessThisId(p.getId());
			}
		}
	}

	private static void accessThisId(int id) {
		System.out.println("Access the id " + id);
	}
}
