package com.tech.javabasics.step10Collections;

public class Dog {
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

}
