package com.tech.javabasics.step11files;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadObjectFile {
	public static void main(String[] args) {

		try (ObjectInputStream inStream = new ObjectInputStream(
				Files.newInputStream(Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles\\EmployeeFile.data")))) {

			Employee emp = null;
			while ((emp = (Employee) inStream.readObject()) != null) {
				System.out.println(emp);
			}
		} catch (IOException | ClassNotFoundException ex) {
		}

	}
}
