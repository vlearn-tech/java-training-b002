package com.tech.javabasics.step12aggregationandinheritence;

public class DataLoaderAndRunner {
	public static void main(String[] args) {
		Person rahul = new Person("Rahul", 'M');
		Address newAddress = new Address("B-123 Some Apartment, Patia", "Bhubaneswar", 751024L);
		rahul.address = newAddress;

		Pet bruno = new Dog("Bruno", "Brown", rahul, true);
		Pet spooky = new Dog("Spooky", "Black", rahul, false);
		Pet silver = new Cat("Silver", "White", rahul, Boolean.TRUE);
		Pet skipper = new Horse("Skipper", "Grey", rahul);

		// Despite pets being of different types, since all are "Pet"s hence Java allows to store all in
		// same list
		rahul.pets.add(bruno);
		rahul.pets.add(spooky);
		rahul.pets.add(silver);
		rahul.pets.add(skipper);

//		System.out.println(rahul);

		// You can run the loop on the Pets
		for (Pet p : rahul.pets) {
			p.printDetailsOfPet();
//			p.specialFunda();

			// instanceof checks the exact type of the object
			if (p instanceof Dog) {
				Dog d = (Dog) p;
				d.specialDogFunda();
			} else if (p instanceof Cat) {
				Cat c = (Cat) p;
				c.specialCatFunda();
			} else {
				p.specialFunda();
			}
		}

	}
}
