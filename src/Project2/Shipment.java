/*
 * 22W_CST8116_451 Intro to Computer Programming
 * Project #2 – Developing a Java Application
 * Carol Ann Wilson
 * Student ID: 040672794
 * Instructor: Piyush Jangam
 * Date: March 21, 2022
 */

/* 2.	Create a class named Shipment
		a.	The program must ask for two separate packages to ship
		b.	The program must calculate the cost difference using the difference in volume:
			i.e.  The base price for a package with volume <=1 is $3, for every unit increase in volume, the cost increases by $1
			e.g. 1: a parcel with volume 4, the cost is $3+ $1 +$1 +$1 = $6
			e.g. 2: a parcel with volume 2.5, the cost is $3 + $1.5 = $4.5
		c.	Give the following (in order of priority):  
			i.	If there is no difference, display the costs as the same  
			ii.	If the cost of one is less than twice the other, display that it is “slightly more than”  
			iii.	If the cost of one is less than three times the other, display that it is “twice”  
			iv.	If the cost of one is less than four times the other, display that it is “triple”  
			v.	If the cost of one is less than five times the other, display that it is “quadruple”  
			vi.	Otherwise, display that as a calculated multiple (eg 5x, 6x etc)
		d.	The program must indicate the more costly package (if not same cost) and by how much  
		e.	The program must calculate and display the appropriate message (including proper dimension and cost format)  
		f.	Your code also does NOT need to worry if the user inputs an invalid value for the input (example: invalid length). The output of your code must match the samples.  
		g.	You must change the title i.e. Welcome to <your name> shipping calculator! 
*/

package Project2;

public class Shipment {

	public static void main(String[] args) {

		// Instantiation of Package for package 1 and 2
		Package package1 = new Package();
		Package package2 = new Package();
		// Initialization of pkg cost value holders to 1
		double pkg1cost = 1;
		double pkg2cost = 1;
		double result = 1;

		// Welcome to Carol Ann's Shipping Calculator!
		System.out.println("Welcome to Carol Ann's Shipping Calculator!");

		// Requesting the dimensions of the first package:
		System.out.println("Please enter the dimensions of your first package:");
		package1.inputLength();
		package1.inputWidth();
		package1.inputHeight();

		// Requesting the dimensions of the second package:
		System.out.println("Please enter the dimensions of your second package:");
		package2.inputLength();
		package2.inputWidth();
		package2.inputHeight();

		// Calling displayDimensions and calcVolume from Package.java for package 1
		System.out.print("First package dimensions: ");
		package1.displayDimensions();
		package1.calcVolume();
		System.out.println(", Volume = " + package1.volume);

		// Calling displayDimensions and calcVolume from Package.java for package 2
		System.out.print("Second package dimensions: ");
		package2.displayDimensions();
		package2.calcVolume();
		System.out.println(", Volume = " + package2.volume);

		// Package one will cost X to ship
		// Package two will cost X to ship

		// This loop calculates whether the package1 is $3.00 or more than that
		if (package1.volume <= 1) {
			System.out.println("Package 1 will cost $3.00 to ship.");
			pkg1cost = 3; // Setting package cost to $3.00 otherwise it stays as 1
		} else if (package1.volume > 1) {
			pkg1cost = 3 + (package1.volume - 1);
			System.out.println("Package 1 will cost $" + pkg1cost + " to ship.");
		}

		// This loop calculates whether the package2 is $3.00 or more than that
		if (package2.volume <= 1) {
			System.out.println("Package 2 will cost $3.00 to ship.");
			pkg2cost = 3; // Setting package cost to $3.00 otherwise it stays as 1
		} else if (package2.volume > 1) {
			pkg2cost = 3 + (package2.volume - 1);
			System.out.println("Package 2 will cost $" + pkg2cost + " to ship.");
		}

		// Package a/b is :: The same price as package a/b
		// :: X times the price of package a/b
		// :: Cheaper than package a/b

		// This if loop checks if the packages are the same price
		if (pkg1cost == pkg2cost) {
			System.out.println("The two packages cost the same.");
		}

		// The else if portion checks if pkg1 is more expensive than pkg2, if it is, it
		// goes through this loop to determine if it's slight more, double, triple,
		// quadruple, or some other multiplier larger
		// If it's not larger, it goes to the next else
		else if (pkg1cost > pkg2cost) {

			if (pkg1cost > pkg2cost && pkg1cost < (2 * pkg2cost)) {
				System.out.println("The first package costs slightly more than the second package");
			} else if (pkg1cost == 2 * pkg2cost) {
				System.out.println("The first package is twice the cost of the second package");
			} else if (pkg1cost == 3 * pkg2cost) {
				System.out.println("The first package is triple the cost of the second package");
			} else if (pkg1cost == 4 * pkg2cost) {
				System.out.println("The first package is quadruple the cost of the second package");
			} else {
				result = pkg1cost / pkg2cost;
				System.out.println("The first package is " + result + " times the cost of the second package");
			}
		}

		// This is the else loop if pkg2 is larger than pkg1
		// If goes through the if/else statements to determine if it's slightly more,
		// double, triple, quadruple, or some other multiplier larger
		else {
			if (pkg2cost > pkg1cost && pkg2cost < (2 * pkg1cost)) {
				System.out.println("The first package costs slightly more than the second package");
			} else if (pkg2cost == 2 * pkg1cost) {
				System.out.println("The second package is twice the cost of the first package");
			} else if (pkg2cost == 3 * pkg1cost) {
				System.out.println("The second package is triple the cost of the first package");
			} else if (pkg2cost == 4 * pkg1cost) {
				System.out.println("The second package is quadruple the cost of the first package");
			} else {
				result = pkg2cost / pkg1cost;
				System.out.println("The second package is " + result + " times the cost of the first package");
			}
		}

	}
}