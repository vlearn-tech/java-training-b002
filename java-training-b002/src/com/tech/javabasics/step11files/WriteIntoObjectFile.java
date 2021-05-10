package com.tech.javabasics.step11files;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WriteIntoObjectFile {
	public static void main(String[] args) {

		try (ObjectOutputStream outStream = new ObjectOutputStream(
				Files.newOutputStream(Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles\\EmployeeFile.data")))) {
			List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles\\SampleCSVFile.csv"));

			for (String rec : lines) {
				Employee emp = Employee.mapToEmployee(rec);
				outStream.writeObject(emp);
			}
			System.out.println("Object file created from the source file");
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
}
