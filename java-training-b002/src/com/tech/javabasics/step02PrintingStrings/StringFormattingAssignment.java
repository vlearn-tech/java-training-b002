package com.tech.javabasics.step02PrintingStrings;

public class StringFormattingAssignment {
	public static void main(String[] args) {

		String namePredicate = "A";
		String department1 = "Engineering";
		String department2 = "Testing";
		Integer numOfDays = 30;

		// "select * from employee e where e.name = like('A%') and e.dept_id in ('Engineering', 'Testing')
		// and hireDt > today() - 30"

		String queryNormal = ""; // Use simple + operator
		String queryUsingConcat = ""; // Use concat
		String queryUsingFormat = ""; // Use String.format()

		System.out.println(queryNormal);
		System.out.println(queryUsingConcat);
		System.out.println(queryUsingFormat);

	}
}
