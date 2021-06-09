package com.tech.javabasics.step90miniproject;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadEmployeeRegionalReport {
	public static void main(String[] args) {

		try (ObjectInputStream inStream = new ObjectInputStream(
				Files.newInputStream(Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles\\EmployeeReportAsObject.txt")))) {

			EmployeeRegionalReport regionalReport = null;
			while ((regionalReport = (EmployeeRegionalReport) inStream.readObject()) != null) {
				System.out.println(regionalReport);
			}
		} catch (IOException | ClassNotFoundException ex) {
		}

	}
}
