package com.tech.javabasics.step09Classes;

public class Dog {

	static Integer dogIdSequenceGenerator = 0;

	Integer dogId;
	String name;
	String color;
	Integer volumeOfSound;

	public void describe() {
		System.out.println(String.format("About %s (id - %d) - %s in color and makes a %s sound", name, dogId, color,
				volumeOfSound >= 10 ? "loud" : "soft"));
	}

	public Dog() {

	}

	public Dog(String name, String color, Integer volumeOfSound) {
		this.dogId = ++dogIdSequenceGenerator;
		this.name = name;
		this.color = color;
		this.volumeOfSound = volumeOfSound;
	}

}
