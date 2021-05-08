package com.tech.javabasics.step10collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingObjects {

	private static List<Dog> myPets = new ArrayList<>();

	public static void main(String[] args) {

		myPets.add(new Dog("Bru", "Black"));
		myPets.add(new Dog("Tiger", "Brown"));
		myPets.add(new Dog("SpookySpider", "White"));
		myPets.add(new Dog("DusterBoy", "Shaded"));
		myPets.add(new Dog("Scooby", "Brown"));
		myPets.add(new Dog("Silk", "White"));
		myPets.add(new Dog("DirtyDover", "Brown"));
		myPets.add(new Dog("DarkyBlacky", "Black"));

		showPets();

		// Sort these dogs by Length of Name
		System.out.println("======= S O R T E D    U S I N G     C O M P A R A B L E =============");
		Collections.sort(myPets);
		showPets();

		// Sort these dogs by Color
		System.out.println("======= S O R T E D    U S I N G     C O M P A R A T O R =============");
		Comparator<Dog> comparatorByColor = (Dog d1, Dog d2) -> {
			return d1.color.compareTo(d2.color);
		};
		Comparator<Dog> comparatorByName = (Dog d1, Dog d2) -> {
			return d1.name.compareTo(d2.name);
		};
		System.out.println("============ BY COLOR ==========");
		myPets.sort(comparatorByColor);
		showPets();

		System.out.println("============ BY NAME ==========");
		myPets.sort(comparatorByName);
		showPets();

		System.out.println("======= S O R T E D    U S I N G     L A M B D A   =============");

		// Sort by Name
		System.out.println("============ BY NAME ==========");
		myPets.sort(Comparator.comparing(d -> d.name));
		showPets();

		System.out.println("============ BY COLOR REVERSED ==========");
		// Sort by Color but in reversed order
		myPets.sort(Comparator.comparing((Dog d) -> d.color).reversed());
		showPets();

		// Sort these dogs first by Color and then by Name
		System.out.println("============ BY COLOR AND THEN NAME ==========");
		myPets.sort(Comparator.comparing((Dog d) -> d.color).thenComparing((Dog d) -> d.name));
		showPets();

		// Group by dogs by name, so that I can search for a pet by its name

		// Group the pets by color, so that I can find all dogs of a specific color at once

	}

	private static void showPets() {
		myPets.forEach(d -> {
			System.out.println(d);
		});
	}
}
