package com.bin.api;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public ApiApplication() {
		super();
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);

		// Add this block to your main method
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = scanner.nextLine();
		System.out.println(input.toUpperCase());
		scanner.close(); // Close the scanner
	}

}