/*
 * 22W_CST8116_451 Intro to Computer Programming
 * Assignment #5 – Java Programming: Loops and Arrays
 * Carol Ann Wilson
 * Student ID: 040672794
 * Instructor: Piyush Jangam
 * Date: March 3, 2022
 */

// Write a Java program to calculate the average value of array elements

/* Read in array size
 * Declare array
 * Read in array contents
 * Average the input of the array
 * output the average of the numbers in the array
 */


package Assignment5;

import java.util.Scanner;

public class Q2AverageArray {
	
	public static void main (String[] args) {
		
		// Open the scanner
		Scanner scanner = new Scanner(System.in);
		
		// Ask the user for input
		System.out.println("How many numbers do you want to enter?");
		
		// Take the size they want into size1
		int size1 = scanner.nextInt();
		
		//Set declare total and set to 0
		double total = 0;
		
		// Declare array, using double because results could have decimal places so I might as well allow decimals from the start
		double doubleArray[] = new double[size1];

		// Ask the user for their numbers
		System.out.println("Please enter " + size1 + " numbers:");
		
		// Use a for loop to allow the user to enter their numbers until the array is full
		for(int i=0; i<size1; i++) {
			
			doubleArray[i]=scanner.nextDouble();
			total = total + doubleArray[i];
		}
		
		// Calculate the average of the array
		double average = total/size1;
		
		// Print the output
		System.out.println("Thank you");
		System.out.println("The average of your numbers is " + average + " .");
		
		// Close the scanner
		scanner.close();
		
	}

}
