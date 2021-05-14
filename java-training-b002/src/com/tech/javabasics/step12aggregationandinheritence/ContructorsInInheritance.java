package com.tech.javabasics.step12aggregationandinheritence;

public class ContructorsInInheritance {
	public static void main(String[] args) {
//		Parrot p = new Parrot();
//		Puppy pup = new Puppy();

		Pet pet = new Puppy();

	}
}

// -- Pet
//    -- NonCagedPet
//       -- Dog
//          -- Puppy
//    -- CagedPet
//       -- Parrot

class MyPet {
	public MyPet() {
		System.out.println("Creating Pet");
	}
}

class CagedPet extends MyPet {
	public CagedPet() {
		System.out.println("Creating Caged Pet");
	}
}

class NonCagedPet extends Pet {
	public NonCagedPet() {
		System.out.println("Creating NonCaged Pet");
	}
}

class PetDog extends NonCagedPet {
	public PetDog() {
		System.out.println("Creating Dog");
	}
}

final class Puppy extends PetDog {
	public Puppy() {
		System.out.println("Creating Puppy");
	}
}

class Parrot extends CagedPet {
	public Parrot() {
		System.out.println("Creating Parrot");
	}
}