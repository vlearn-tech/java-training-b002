package com.tech.javabasics.step13encapsulation;

public class Pet {

	private static int currentId = 0;

	private String name;
	private int age;
	private int id;

	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
		this.id = ++currentId;
	}

	public Pet() {
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the id
	 */
	protected int getId() {
		return id;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
