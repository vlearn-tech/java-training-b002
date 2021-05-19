package com.tech.javabasics.step13someotherpackage;

import com.tech.javabasics.step13encapsulation.Pet;

public class HackThePetId {
	public static void main(String[] args) {
		SomeTempPetClassForHackingPetId stp = new SomeTempPetClassForHackingPetId("Bruno", 12);
		stp.hackThePetId();
	}
}

class SomeTempPetClassForHackingPetId extends Pet {

	public SomeTempPetClassForHackingPetId(String name, int age) {
		super(name, age);
	}

	void hackThePetId() {
		System.out.println(" id : " + this.getId());
	}
}
