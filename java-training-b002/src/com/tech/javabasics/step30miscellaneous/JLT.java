package com.tech.javabasics.step30miscellaneous;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class JLT {
	public static void main(String[] args) {
		final String name = "ABC";

		try {
			Path path = Paths.get("C:\\Users\\HP\\Desktop\\JavaFiles", "SomeDummyFile.txt");
			Files.createFile(path);
			Files.writeString(path, "We are learning Java fast", StandardOpenOption.APPEND);
		} catch (Exception e) {
			System.out.println("Some exception occurred : ");
			e.printStackTrace();
		} finally {
			System.out.println("Always gets executed");
		}
	}
}
