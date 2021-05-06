package com.tech.javabasics.step10Collections;

public class Dog implements Comparable<Dog> {
	String name;
	String color;

	public Dog(String name, String color) {
		this.name = name;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + "]";
	}

	@Override
	public int compareTo(Dog anotherDog) {
		// Default Comparison based on length of the name of the dog
		int result = -1 * (this.name.length() - anotherDog.name.length());
		return result;
	}

}

//Dog [name=Bruno, color=Black] -- this
//Dog [name=Tiger, color=Brown] -- anotherDog