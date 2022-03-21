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
 * Reverse the element location of the array contents
 * output the information from the sorted arrays in the requested order 
 */

package Assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class Q4bReverseArray {
	
	public static void main (String[] args) {
		
		// Open the scanner
		Scanner scanner = new Scanner(System.in);
		
		// Ask the user for input
		System.out.println("How many numbers do you want to enter?");
		
		// Take the size they want into size1
		int size1 = scanner.nextInt();
		
		// Declare array
		int intArray[] = new int[size1];

		// Ask the user for their numbers
		System.out.println("Please enter " + size1 + " whole numbers:");
		
		// Use a for loop to allow the user to enter their numbers until the array is full
		for(int i=0; i<size1; i++) {
			
			intArray[i]=scanner.nextInt();
		}
				
		// Print the output
		System.out.println("Thank you");
		
		// Reverse the element location of the array
		System.out.println("Your current array is: " + Arrays.toString(intArray));
		// Calls the method below to reverse the array
		reverseIntArray(intArray, size1);
		System.out.println("Your reversed array is: " + Arrays.toString(intArray));
		
		scanner.close();
		
	}
	
	static void reverseIntArray(int intArray[], int size1) {

		// This int will hold the temporary value of the array prior to be moved
		int tempArrayEntry;
		// counter
		int i;
		// While i is less than half of the size of the array, process the loop
		// This will work with an array that is an even or odd length long
		// Even length arrays will just transpose equally
		// Odd length arrays will leave the 1/2 remainder, ie the middle number of the array
		// in it's original place
        for (i = 0; i < size1 / 2; i++) { 
        	// Moves the first array entry to tempArrayEntry
        	tempArrayEntry = intArray[i]; 
        	// Moves the last entry - the counter - one to the corresponding top
        	// part of the array
        	// ie 4 would go to 0, 3 would go to 1, etc.
            intArray[i] = intArray[size1 - i - 1]; 
            // Moves the temp entry into the previous location of the "end" entry
            intArray[size1 - i - 1] = tempArrayEntry; 
		
		
        }
        
	}
}
