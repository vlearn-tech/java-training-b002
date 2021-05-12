package com.tech.javabasics.step12aggregationandinheritence;

import java.util.ArrayList;
import java.util.List;

public class Person {
	String name;
	Character gender;
	Address address;
	List<Pet> pets = new ArrayList<>();

	public Person(String name, Character gender) {
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", address=" + address + ", pets=" + pets + "]";
	}

}
