package Assignment1;
import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
				
		Scanner userInput = new Scanner(System.in);
		//This allows me to intake the username I am requesting in the next line

		System.out.println("Welcome to Kat Industries, please enter your username.");
		//Tells the user to enter their username

		String userName = userInput.nextLine();
		/*Reads the user input, the nextLine statement uses the return
		  to indicate that the user is done entering*/


		userInput.close();
		/*closes the scanner, while cleanup will take care of memory resources
		  it’s always good practice to close something you open when you’re done*/
		
		System.out.println("Thank you " + userName + ". Welcome to the system.");

	}
}
