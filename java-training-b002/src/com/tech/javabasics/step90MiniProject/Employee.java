package com.tech.javabasics.step90MiniProject;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee {

	private Long id;
	private String firstName;
	private String lastName;
	private Boolean isMarried;
	private Character gender;
	private LocalDate dateOfBirth;
	private LocalDate dateOfJoining;
	private Integer salary;
	private String region;
	private Integer age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Boolean getIsMarried() {
		return isMarried;
	}

	public void setIsMarried(Boolean isMarried) {
		this.isMarried = isMarried;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getAge() {
		Long age = ChronoUnit.YEARS.between(dateOfBirth, LocalDate.now());
		return age.intValue();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", isMarried=" + isMarried
				+ ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", dateOfJoining=" + dateOfJoining
				+ ", salary=" + salary + ", region=" + region + ", age=" + getAge() + "]";
	}

}
