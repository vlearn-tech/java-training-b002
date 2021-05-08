package com.tech.javabasics.step10Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class UsingIterators {
	private static List<Dog> myPets = new ArrayList<>();
	private static Map<String, Dog> myPetMap;

	public static void main(String[] args) {

		myPets.add(new Dog("Bru", "Black"));
		myPets.add(new Dog("Tiger", "Brown"));
		myPets.add(new Dog("SpookySpider", "White"));
		myPets.add(new Dog("DusterBoy", "Shaded"));
		myPets.add(new Dog("Scooby", "Brown"));
		myPets.add(new Dog("Silk", "White"));
		myPets.add(new Dog("DirtyDover", "Brown"));
		myPets.add(new Dog("DarkyBlacky", "Black"));

		System.out.println("======= ITERATION  IN  NORMAL  DIRECTION =========");
		ListIterator<Dog> dogIterator = myPets.listIterator();

		while (dogIterator.hasNext()) {
			System.out.println(dogIterator.next());
		}

		System.out.println("\n\n======= ITERATION  IN  REVERSE  DIRECTION =========");
		ListIterator<Dog> dogIteratorForReverseTraversal = myPets.listIterator(myPets.size());

		while (dogIteratorForReverseTraversal.hasPrevious()) {
			System.out.println(dogIteratorForReverseTraversal.previous());
		}

		myPetMap = new HashMap<>();
		for (Dog d : myPets) {
			myPetMap.put(d.name, d);
		}

	}
}
