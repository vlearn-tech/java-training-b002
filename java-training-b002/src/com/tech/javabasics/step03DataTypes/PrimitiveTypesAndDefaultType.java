package com.tech.javabasics.step03DataTypes;

public class PrimitiveTypesAndDefaultType {
	public static void main(String[] args) {
		int i = 10;
		long l = 10L;

		int iNew = (int) l;

		double d = 10.5;
		float f = 10.5F;

		int iMax = Integer.MAX_VALUE;
		System.out.println(iMax);

		String strSalary = "50000";
		String strIncrement = "15";

//		int salary = Integer.valueOf(strIncrement);

		System.out.println(String.format("Revised salary is %d",
				(Integer.valueOf(strSalary) * (100 + Integer.valueOf(strIncrement)) / 100)));

		System.out.println(Long.MAX_VALUE);

		System.out.println(Long.SIZE);

		int compare = Integer.compare(Integer.MIN_VALUE, Integer.MIN_VALUE);
		System.out.println(compare);

	}
}
