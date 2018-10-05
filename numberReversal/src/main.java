/*
 * This application will have the user input a number then will reverse that number and display it
 */

import java.util.*;


public class main {

	static public Scanner input = new Scanner(System.in);
	static public Scanner input2 = new Scanner(System.in);
	static public int i, reminder, cont, rev = 0;
	static public String contChoice;
		
	public static void main(String[] args)
	{
		while (cont != 1) {
			
			System.out.println("Enter up to a nine digit number to reverse: ");
			i = input.nextInt();
			rev = 0;
			// Following 6 lines borrowed from https://www.tutorialgateway.org/reverse-a-number-in-java/
			while (i > 0) 
			{
				reminder = i %10;
				rev = rev * 10 + reminder;
				i = i / 10;
			}
			
			System.out.println("The number reversed is: " + rev);
			
			System.out.println("Would you like to exit? Please enter numbers only. \n1. Yes \n2. No");
			if(input2.nextInt() == 1) {
				cont = 1;
			}
			
		}
		input.close();
		input2.close();
		System.out.println("Goodbye!");
	}
}