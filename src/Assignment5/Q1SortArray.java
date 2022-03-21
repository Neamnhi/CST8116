/*
 * 22W_CST8116_451 Intro to Computer Programming
 * Assignment #5 – Java Programming: Loops and Arrays
 * Carol Ann Wilson
 * Student ID: 040672794
 * Instructor: Piyush Jangam
 * Date: March 3, 2022
 */

// Write a Java program to sort a numeric array and a string array

/* Read in array size
 * Declare array
 * Read in array contents
 * Sort each array from lowest to highest or alphabetical
 * output the information from the sorted arrays in the requested order 
 */

package Assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class Q1SortArray {

	public static void main (String[] args) {
		
		// Open the scanner
		Scanner scanner = new Scanner(System.in);
		
		/* ################# INT ARRAY ################### */

		// Ask the user for input
		System.out.println("How many numbers do you want to enter?");
		
		// Take the size they want into size1
		int size1 = scanner.nextInt();
		
		// Declare int array
		int intArray[] = new int[size1];

		// Ask the user for their numbers
		System.out.println("Please enter " + size1 + " whole numbers:");
		
		// Use a for loop to allow the user to enter their numbers until the array is full
		for(int i=0; i<size1; i++) {
			
			intArray[i]=scanner.nextInt();
		}
		
		// Sort the array ascending (Note for self: Descending sort requires collections usage: Arrays.sort(intArray, Collections.reverseOrder())
		// Same in a string array, you'd have to use the reverse order command here as well
		Arrays.sort(intArray);
		
		// Print the output
		System.out.println("Thank you");
		System.out.println("Your numbers, from lowest to highest, are: " + Arrays.toString(intArray));
		
		
		
		
		/* ################# STRING ARRAY ################### */

		// Ask the user for input for the size of the string array
		System.out.println("How many words do you want to enter?");
		int size2 = scanner.nextInt();

		// Declare string array
		String stringArray[] = new String[size2];
		
		System.out.println("Please enter each word:");
		
		for(int i=0; i<size2; i++) {
			
			stringArray[i]=scanner.next();
		}
		// Sort the array ascending alphabetically
		Arrays.sort(stringArray);
		System.out.println("Thank you.");
		System.out.println("I have sorted the words alphabetically. The order is: " + Arrays.toString(stringArray));		
		
		// Close the scanner
		scanner.close();
		
	}

}
