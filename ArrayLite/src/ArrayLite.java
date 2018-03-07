/**
 * Author:	Sam Cooney
 * Project:	ArrayLite
 * Date:	Nov 1, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: 
 */

import java.util.Scanner;	// Import Scanner class.

public class ArrayLite {	// Begin ArrayLite.java

	public static void main(String[] args) {	// Begin main.
		Box myBox = new Box(12);				// Instantiate object for class Box.
		Scanner scan = new Scanner(System.in);	// Instantiate object for class Scanner.
		
		System.out.println("Enter the number of students in the class.");
		int LIMIT = scan.nextInt();				// Read in LIMIT.
		scan.nextLine();						// Skip a line.
		String[] students = new String[LIMIT];	// Create array.
		System.out.println("Enter the student's names in alphabetic order.");
		
		for(int i = 0;i < LIMIT;i++) {			// Begin for loop to read in student names.
			
			System.out.println("Enter name " + (i+1));
			students[i] = scan.nextLine();		// Read in name of student.
			System.out.println();				// Skip a line.
		}										// End for loop.
		
		System.out.println("This is the list of students starting with the first student int the class.");
		
		for(String i : students) {				// Begin for each loop.
			
			System.out.println(i);
		}										// End for each loop.
		
		System.out.println();					// Skip a line.
		System.out.println("This is the list of students starting with the last student int the class.");
		
		for(int i = LIMIT-1;i >= 0;i--) {		// Begin for loop.
			
			System.out.println(students[i]);
		}										// End for loop.
		
		System.out.println();					// Skip a line.
		System.out.println(myBox);				// Print out my box.
		
		scan.close();							// Close scanner.
	}											// End main.

}												// End class ArrayLite.
