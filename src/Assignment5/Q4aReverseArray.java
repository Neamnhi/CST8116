/*
 * 22W_CST8116_451 Intro to Computer Programming
 * Assignment #5 – Java Programming: Loops and Arrays
 * Carol Ann Wilson
 * Student ID: 040672794
 * Instructor: Piyush Jangam
 * Date: March 3, 2022
 */

// Write a Java program to reverse an array of integer values

/* Read in array size
 * Declare array
 * Read in array contents
 * Sort each array from lowest to highest
 * Reverse the order
 * output the information from the sorted arrays in the requested order 
 */

package Assignment5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q4aReverseArray {
	
	public static void main (String[] args) {
		
		// Open the scanner
		Scanner scanner = new Scanner(System.in);
		
		// Ask the user for input
		System.out.println("How many numbers do you want to enter?");
		
		// Take the size they want into size1
		int size1 = scanner.nextInt();
		
		// Declare Integer array, you cannot use the Collections.reverseOrder command on a primitive, so have to use Integer instead
		Integer intArray[] = new Integer[size1];

		// Ask the user for their numbers
		System.out.println("Please enter " + size1 + " whole numbers:");
		
		// Use a for loop to allow the user to enter their numbers until the array is full
		for(int i=0; i<size1; i++) {
			
			intArray[i]=scanner.nextInt();
		}
		
		// Sort the array descending (Note for self: Descending sort requires collections usage: Arrays.sort(intArray, Collections.reverseOrder())
		// Same in a string array, you'd have to use the reverse order command here as well
		Arrays.sort(intArray, Collections.reverseOrder());
		
		// Print the output
		System.out.println("Thank you");
		System.out.println("Your numbers, from highest to lowest, are: " + Arrays.toString(intArray));
		
		scanner.close();
		
		
	}

}
