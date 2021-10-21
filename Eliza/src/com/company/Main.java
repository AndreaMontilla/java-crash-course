package com.company;

import java.util.Scanner; // Import the Scanner class

public class Main {

    public static void main(String[] args) {
	    var scanner = new Scanner(System.in);  // Create a Scanner object

	    System.out.println(Doctor.intro()); // prints the intro
		var userInput = "";

		do {

			userInput = scanner.nextLine();
			String response = Doctor.response(userInput);
			System.out.println(response);

		} while(!userInput.equalsIgnoreCase("quit"));

	    scanner.close(); // closes the scanner
    }
}
