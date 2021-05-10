package com.tech.javabasics.step90miniproject;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EmployeeSummary {
	Integer numOfPeople = 0;
	Integer totalExperience = 0;
	Long totalSalary = 0L;
	Double averageSalary = 0.0;

	public void updateRegionalSummary(Employee e) {
		this.numOfPeople++;
		this.totalExperience += ((Long) ChronoUnit.YEARS.between(e.getDateOfJoining(), LocalDate.now())).intValue();
		this.totalSalary += e.getSalary();
		this.averageSalary = (Double) ((Long) this.totalSalary).doubleValue() / this.numOfPeople;
	}

	@Override
	public String toString() {
		return "EmployeeSummary [numOfPeople=" + numOfPeople + ", totalExperience=" + totalExperience + ", totalSalary="
				+ totalSalary + ", averageSalary=" + averageSalary + "]";
	}

}