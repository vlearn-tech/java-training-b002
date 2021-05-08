package com.tech.javabasics.step10collections;

import java.util.ArrayList;
import java.util.List;

public class QueueDemo {

	private static List<String> peopleInQueue = new ArrayList<>();

	public static void main(String[] args) {

		// People standing in a queue.
		// People always get added to the end of the queue
		// People always leave from front of the queue

		push("Vikram");
		push("Rekha");
		push("Ria");
		push("Mohan");
		pop();
		pop();
		push("Ashok");
		push("Ria");
		push("Vinod");
		moveOut("Ashok");
		moveOut("Ria");
		push("Ria");
		push("Ria");

	}

	// Add a new person into the queue
	private static void push(String newPerson) {
		peopleInQueue.add(0, newPerson);
		showQueue();
	}

	// Add a new person into the queue
	private static void pop() {
		String personToMoveOut = peopleInQueue.get(peopleInQueue.size() - 1);
		peopleInQueue.remove(peopleInQueue.size() - 1);
		showQueue();
		System.out.println(personToMoveOut + " moved out");
	}

	private static void moveOut(String person) {
		peopleInQueue.remove(person);
		showQueue();
	}

	private static void showQueue() {
		System.out.println(peopleInQueue);
	}

}
