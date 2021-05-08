package com.tech.javabasics.step02formattingandprintingstrings;

public class StringFormattingAssignment {
	public static void main(String[] args) {

		String namePredicate = "A";
		String department1 = "Engineering";
		String department2 = "Testing";
		Integer numOfDays = 30;

// "select * from employee e where e.name = like('A%') and e.dept_id in ('Engineering', 'Testing') and hireDt > today() - 30"

		String queryNormal = "select * from employee e where e.name = like('" + namePredicate
				+ "%') and e.dept_id in ('" + department1 + "', '" + department2 + "') and hireDt > today() - "
				+ numOfDays; // Using simple + operator
		String queryUsingFormat = String.format(
				"select * from employee e where e.name = like('%s%%') and e.dept_id in ('%s', '%s') and hireDt > today() - %d",
				namePredicate, department1, department2, numOfDays); // Using String.format()

		System.out.println(
				"select * from employee e where e.name = like('A%') and e.dept_id in ('Engineering', 'Testing') and hireDt > today() - 30");
		System.out.println(queryNormal);
		System.out.println(queryUsingFormat);

	}
}
