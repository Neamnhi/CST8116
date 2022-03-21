/*
 * 22W_CST8116_451 Intro to Computer Programming
 * Project #2 – Developing a Java Application
 * Carol Ann Wilson
 * Student ID: 040672794
 * Instructor: Piyush Jangam
 * Date: March 21, 2022
 */

/* 1.	Create a Java class named Package that contains the following:
		a.	Package should have three private instance variables of type double named length, width, and height. 
		b.	Package should have one private instance variable of the type Scanner named input, initialized to System.in. 
		c.	No-args (explicit default) public constructor, which initializes all three double instance variables to 1.0.  
		d.	Initial (parameterized) public constructor, which defines three parameters of type double, named length, width, and height, which are used to initialize the instance variables of same name. 
		e.	Public copy constructor, with a parameter of type Package, used to duplicate an existing Package object. 
		f.	Three public void methods named inputLength, inputWidth, and inputHeight. Each method will prompt the user for the appropriate property, and input a double value using the Scanner object input to initialize the instance variables 
		g.	A public void method named displayDimensions which prints the dimensions as length X width X height (each value separated by a “ X “). 
		h.	A public method of type double named calcVolume that calculates the volume and returns the result as a double value. 
 */

package Project2;

import java.util.Scanner;

public class Package {

	// Declarations of doubles, scanner and an additional value of volume
	private double length;
	private double width;
	private double height;
	private Scanner input = new Scanner(System.in);

	double volume;

	// This is the constructor required to set the l,w,h values to one
	public Package() {
		length = 1;
		width = 1;
		height = 1;
	}

	// Parameterized constructor for package
	public Package(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	// Copy of package constructor, for the second package
	public Package(Package copy) {
		this.length = copy.length;
		this.height = copy.height;
		this.width = copy.width;
	}

	// These next three (inputLength, inputWidth, inputHeight) are the requests to
	// the
	// user to input those values
	public void inputLength() {
		System.out.println("Length:");
		length = input.nextDouble();
	}

	public void inputWidth() {
		System.out.println("Width:");
		width = input.nextDouble();
	}

	public void inputHeight() {
		System.out.println("Height:");
		height = input.nextDouble();
	}

	// This method displays the dimension of the package as input by the user
	public void displayDimensions() {
		System.out.print(length + " x " + width + " x " + height + ".");
	}

	// This method calculates the volume of the package based on the values input by
	// the user
	// Using public double instead of public void means that the method must return
	// something
	public double calcVolume() {
		volume = length * width * height;
		return volume;
	}

}
