/*
 * 22W_CST8116_451 Intro to Computer Programming
 * Assignment #5 – Java Programming: Loops and Arrays
 * Carol Ann Wilson
 * Student ID: 040672794
 * Instructor: Piyush Jangam
 * Date: March 3, 2022
 */

// Write a Java program to test if an array contains a specific value

/* Create an array with a bunch of numbers already pre-entered
 * Using a loop, search the array for the specific number requested by the user
 * Print the output of whether or not the specific number has been found, probably using if/else loop
 */

package Assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class Q3SearchArray {
	
	public static void main (String[] args) {
		
		// Open the scanner
		Scanner scanner = new Scanner(System.in);
		
		// Declare the array with a set of values
		int searchArray[]= {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29};
		
		// Ask the user what number they are looking for
		System.out.println("What number are you looking for?");
		int searchValue = scanner.nextInt();
		Arrays.sort(searchArray);
		boolean searchResult = false;
		
			//compare each number in each location to the searchValue
			//if the value equals the searchValue, change searchResult to true
			//otherwise continue until all numbers are checked
			for (int number : searchArray) {				
				if (number == searchValue) {	            	
	                searchResult = true;
	                break;	     
	            }
		}
       	if (searchResult) {
            System.out.println("Congratulations, your number, " + searchValue + ", appears in the list!");
       	}
       	else {       		
       		System.out.println("I'm sorry, we did not find your number in the list.");
       	}


		//close Scanner
		scanner.close();
	}
}
